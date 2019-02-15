#include "cuda_runtime.h"
#include "device_launch_parameters.h"
#include <cuda.h>
#include <cuda_runtime.h>
#include <stdio.h>
#include <math.h>
#include <iostream>

#define MIN(a,b) (((a)<=(b))?(a):(b))

// Número de intervalos
const int N = 80000;
const int numThreads = 256;
const int bloquesPorGrid = MIN(32, (N + numThreads - 1) / numThreads);

__device__ float funcion_gpu(float x) {
	return (cos(1/x)+pow(x,2)*(pow(x,3)+9))/(x+3);
}
float funcion_cpu(float x) {
	return (cos(1 / x) + pow(x, 2)*(pow(x , 3) + 9)) / (x + 3);
}
__global__ void trapecios(float a, float b, float h, float* resultado) {
	__shared__ float parcial[numThreads];
	int iteracion = threadIdx.x + blockIdx.x* blockDim.x;
	float temp = 0;
	while (iteracion < N) {
		if (iteracion != 0) {
			temp += funcion_gpu(a + h * iteracion);
		}
		iteracion += blockDim.x * gridDim.x;
	}
	parcial[threadIdx.x] = temp; // Almacena los resultados parciales
	__syncthreads(); // Sincroniza threads
	int i = blockDim.x / 2;
	while (i != 0) { // Fase de reducción
		if (threadIdx.x < i) {
			parcial[threadIdx.x] += parcial[threadIdx.x + i];
		}
		__syncthreads();
		i /= 2;
	}
	if (threadIdx.x == 0) {
		resultado[blockIdx.x] = parcial[0];
	}
}

__host__ void check_CUDA_Error(const char *mensaje) {
	cudaError_t error;
	cudaDeviceSynchronize();
	error = cudaGetLastError();
	if (error != cudaSuccess) {
		printf("ERROR %d: %s (%s)\n", error, cudaGetErrorString(error), mensaje); printf("\npulsa INTRO para finalizar...");
		fflush(stdin);
		char tecla = getchar();
		exit(-1);
	}
}

int main(int argc, char **argv) {
	const float a = 1.5f;
	const float b = 2.78f;
	float h = (b - a) / N;
	float *resultado_cpu;
	float *resultado_gpu;
	resultado_cpu = (float*)malloc(bloquesPorGrid * sizeof(float));
	cudaMalloc(&resultado_gpu, bloquesPorGrid * sizeof(float));
	check_CUDA_Error("RESERVA DE MEMORIA");
	trapecios << <bloquesPorGrid, numThreads >> > (a, b, h, resultado_gpu);
	check_CUDA_Error("LLAMADA AL KERNELL");
	cudaMemcpy(resultado_cpu, resultado_gpu, bloquesPorGrid * sizeof(float), cudaMemcpyDeviceToHost);
	check_CUDA_Error("COPIADO DE MEMORIA");
	float suma_parciales = (funcion_cpu(a) + funcion_cpu(b)) / 2.0f;
	for (int i = 0; i < bloquesPorGrid; i++) {
		suma_parciales += resultado_cpu[i];
	}
	suma_parciales *= h;
	std::cout << "Resultado de integral con GPU: " << suma_parciales << std::endl;
	suma_parciales = (funcion_cpu(a) + funcion_cpu(b)) / 2.0f;
	for (int i = 1; i < N; i++) {
		suma_parciales += funcion_cpu(a + i * h);
	}
	suma_parciales *= h;
	std::cout << "Resultado de integral con CPU: " << suma_parciales << std::endl;
	cudaFree(resultado_gpu);
	check_CUDA_Error("LIBERACION DE MEMORIA");
	free(resultado_cpu);
	return 0;
}