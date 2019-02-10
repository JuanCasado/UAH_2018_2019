
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

template <class T>
__global__ void mulMatrix(T *result, const T *m1, const T *m2, const int *dim, const int *tile) {
	int col = blockIdx.x * *tile + threadIdx.x;
	int row = blockIdx.y * *tile + threadIdx.y;
	T m_mul = 0;
	for (int i = 0; i < *dim; ++i) {
		m_mul += m1[row * *dim + i] * m2[col + *dim * i];
	}
	result[row * *dim + col] = m_mul;
}

template <class T>
std::string printMatrixOperation(const T *m1, const T *m2, const std::string &operation, const T *result, const int &dim) {
	int center_start = static_cast<int>(ceil(dim/2)) - 1;
	int center_end = (center_start % 2 ? center_start + 1: center_start) + 1;
	std::stringstream ss;
	auto matrixDrawer = [&](const int &init, const int &end, const std::string& c1, const std::string& c2) {
		for (int i = init; i < end; ++i) {
			std::stringstream ss_m1;
			std::stringstream ss_m2;
			std::stringstream ss_result;
			for (int j = 0; j < dim; ++j) {
				ss_m1 << m1[i+j*dim] << ", ";
				ss_m2 << m2[i+j*dim] << ", ";
				ss_result << result[i+j*dim] << ", ";
			}
			ss << ss_m1.str() << c1 << ss_m2.str() << c2 << ss_result.str() << "\n";
		}
	};
	matrixDrawer(0, center_start, "   ", "   ");
	matrixDrawer(center_start, center_end, " " +operation+ " ", " = ");
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

int main(){
	std::srand(static_cast<int>(time(0)));
	int klenght = 16*16;
	int kdim = static_cast<int>(sqrt(klenght));
	int ktile = kdim/2;
	dim3 dimGrid(kdim / ktile, kdim / ktile);
	dim3 dimBlock(ktile, ktile);
	int *hm1 = (int *)malloc(sizeof(int)*klenght);
	int *hm2 = (int *)malloc(sizeof(int)*klenght);
	int *hresult = (int *)malloc(sizeof(int)*klenght);
	int *dm1;
	int *dm2;
	int *dresult;
	int *ddim;
	int *dtile;

	fillVector<int>(hm1, klenght);
	fillVector<int>(hm2, klenght);

	HANDLE_ERROR(cudaMalloc((void**)&dm1, sizeof(int)*klenght));
	HANDLE_ERROR(cudaMalloc((void**)&dm2, sizeof(int)*klenght));
	HANDLE_ERROR(cudaMalloc((void**)&dresult, sizeof(int)*klenght));
	HANDLE_ERROR(cudaMalloc((void**)&ddim, sizeof(int)));
	HANDLE_ERROR(cudaMalloc((void**)&dtile, sizeof(int)));

	HANDLE_ERROR(cudaMemcpy(dm1, hm1, sizeof(int)*klenght, cudaMemcpyHostToDevice));
	HANDLE_ERROR(cudaMemcpy(dm2, hm2, sizeof(int)*klenght, cudaMemcpyHostToDevice));
	HANDLE_ERROR(cudaMemcpy(ddim, &kdim, sizeof(int), cudaMemcpyHostToDevice));
	HANDLE_ERROR(cudaMemcpy(dtile, &ktile, sizeof(int), cudaMemcpyHostToDevice));

	mulMatrix<int> <<< dimGrid, dimBlock, 1 >>> (dresult, dm1, dm2, ddim, dtile);
	check_CUDA_Error("Kernell error");
	HANDLE_ERROR(cudaMemcpy(hresult, dresult, sizeof(int)*klenght, cudaMemcpyDeviceToHost));
	std::cout << printMatrixOperation<int>(hm1, hm2, "*", hresult, kdim) << std::endl;

	free(hm1);
	free(hm2);
	free(hresult);
	HANDLE_ERROR(cudaFree(dm1));
	HANDLE_ERROR(cudaFree(dm2));
	HANDLE_ERROR(cudaFree(ddim));
	HANDLE_ERROR(cudaFree(dtile));
	HANDLE_ERROR(cudaFree(dresult));

	getchar();
    return 0;
}
