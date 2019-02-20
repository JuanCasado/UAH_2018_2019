#include "cuda_runtime.h"
#include "device_launch_parameters.h"
#include <cuda.h>
#include <cuda_runtime.h>
#include <stdio.h>
#include <ctime>
#include <cstdlib>
#include <iostream>
#include <string>
#include <sstream>
/*
PASOS SEGUIDOS PARA AÑADIR EL ARCHIVO DE CABECERAS: #include "common/book.h"
	- Clonar el repositorio de GitHub: https://github.com/CodedK/CUDA-by-Example-source-code-for-the-book-s-examples-
	- Ir a Proyect>Properties en VS
	- Añadir la raiz del repositorio clonado a: INCLUDE PATH
	- Añadir el directorio lib del repositorio clonado a: LIBRARY PATH
	- Añadir el directorio bin del repositorio clonado a: EXECUTABLE PATH
*/
#include "common/book.h"

#define TILE 8

template <class T>
__global__ void mulMatrixShared (T *Pd, T* Md, T* Nd, const int *width) {
	__shared__ T Mds[TILE][TILE];
	__shared__ T Nds[TILE][TILE];
	int bx = blockIdx.x;
	int by = blockIdx.y;
	int tx = threadIdx.x;
	int ty = threadIdx.y;
	int row = by * TILE + ty;
	int col = bx * TILE + tx;
	float value = 0;
	for (int m = 0; m < *width / TILE; ++m) {
		Mds[ty][tx] = Md[row * *width + (m * TILE + tx)];
		Nds[ty][tx] = Nd[(m * TILE + ty) * *width + col];
		__syncthreads();
		for (int k = 0; k < TILE; ++k) {
			value += Mds[ty][k] * Nds[k][tx];
		}
		__syncthreads();
	}
	Pd[row * *width + col] = value;
}


template <class T>
std::string printMatrixOperation(const T *m1, const T *m2, const std::string &operation, const T *result, const int &dim) {
	int center_start = static_cast<int>(ceil(dim / 2)) - 1;
	int center_end = (center_start % 2 ? center_start + 1 : center_start) + 1;
	std::stringstream ss;
	auto matrixDrawer = [&](const int &init, const int &end, const std::string& c1, const std::string& c2) {
		for (int i = init; i < end; ++i) {
			std::stringstream ss_m1;
			std::stringstream ss_m2;
			std::stringstream ss_result;
			for (int j = 0; j < dim; ++j) {
				ss_m1 << m1[i + j * dim] << ", ";
				ss_m2 << m2[i + j * dim] << ", ";
				ss_result << result[i + j * dim] << ", ";
			}
			ss << ss_m1.str() << c1 << ss_m2.str() << c2 << ss_result.str() << "\n";
		}
	};
	matrixDrawer(0, center_start, "   ", "   ");
	matrixDrawer(center_start, center_end, " " + operation + " ", " = ");
	matrixDrawer(center_end, dim, "   ", "   ");
	return ss.str();
}

template <class T>
void fillVector(T *v, int size) {
	for (int i = 0; i < size; ++i) {
		v[i] = static_cast<int>(std::rand() % 9);
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

int main() {
	int kwidth = 16*16;
	int kdim = static_cast<int>(sqrt(kwidth));
	dim3 dimBlock(TILE, TILE);
	dim3 dimGrid(16 / TILE, 16 / TILE);

	int *hm1 = (int *)malloc(sizeof(int)*kwidth);
	int *hm2 = (int *)malloc(sizeof(int)*kwidth);
	int *hresult = (int *)malloc(sizeof(int)*kwidth);
	int *dm1;
	int *dm2;
	int *dresult;
	int *ddim;

	fillVector<int>(hm1, kwidth);
	fillVector<int>(hm2, kwidth);

	HANDLE_ERROR(cudaMalloc((void**)&dm1, sizeof(int)*kwidth));
	HANDLE_ERROR(cudaMalloc((void**)&dm2, sizeof(int)*kwidth));
	HANDLE_ERROR(cudaMalloc((void**)&dresult, sizeof(int)*kwidth));
	HANDLE_ERROR(cudaMalloc((void**)&ddim, sizeof(int)));

	HANDLE_ERROR(cudaMemcpy(dm1, hm1, sizeof(int)*kwidth, cudaMemcpyHostToDevice));
	HANDLE_ERROR(cudaMemcpy(dm2, hm2, sizeof(int)*kwidth, cudaMemcpyHostToDevice));
	HANDLE_ERROR(cudaMemcpy(ddim, &kdim, sizeof(int), cudaMemcpyHostToDevice));

	mulMatrixShared<int><<< dimGrid, dimBlock, 1 >>> (dresult, dm1, dm2, ddim);
	check_CUDA_Error("Kernell error");
	HANDLE_ERROR(cudaMemcpy(hresult, dresult, sizeof(int)*kwidth, cudaMemcpyDeviceToHost));
	std::cout << printMatrixOperation<int>(hm1, hm2, "*", hresult, kdim) << std::endl;

	free(hm1);
	free(hm2);
	free(hresult);
	HANDLE_ERROR(cudaFree(dm1));
	HANDLE_ERROR(cudaFree(dm2));
	HANDLE_ERROR(cudaFree(ddim));
	HANDLE_ERROR(cudaFree(dresult));

	getchar();
	return 0;
}
