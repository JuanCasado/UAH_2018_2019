
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

template <class T>
__global__ void addVectors (T *result, T *v1, T *v2) {
	int i = blockIdx.x * blockDim.x + threadIdx.x;
	result[i] = v1[i] + v2[i];
}

template <class T>
void fillVector(T *v, int size) {
	for (int i = 0; i < size; ++i) {
		v[i] = static_cast<int>(std::rand() % 20 + 1);
	}
}

template <class T>
std::string printVector(const T *v, const int &size, const std::string &separator = ", ") {
	std::stringstream ss;
	ss << "{";
	for (int i = 0; i < size; ++i) {
		ss << v[i] << separator;
	}
	ss << "}";
	return ss.str();
}


int main() {
	std::srand(static_cast<int>(time(0)));
	int *hv1;
	int *hv2;
	int *dv1;
	int *dv2;
	int *hresult;
	int *dresult;

	//int klenght = static_cast<int>(std::rand() % 10 + 1);
	int klenght = 8;

	hv1 = static_cast<int *>(malloc(sizeof(int)*klenght));
	hv2 = static_cast<int *>(malloc(sizeof(int)*klenght));
	hresult = static_cast<int *>(malloc(sizeof(int)*klenght));
	fillVector<int>(hv1, klenght);
	fillVector<int>(hv2, klenght);

	cudaMalloc((void**)&dv1, sizeof(int)*klenght);
	cudaMalloc((void**)&dv2, sizeof(int)*klenght);
	cudaMalloc((void**)&dresult, sizeof(int*)*klenght);

	cudaMemcpy(dv1, hv1, sizeof(int)*klenght, cudaMemcpyHostToDevice);
	cudaMemcpy(dv2, hv2, sizeof(int)*klenght, cudaMemcpyHostToDevice);

	int split_factor = 4;
	int num_blocks = klenght / split_factor;
	int num_threads = split_factor;
	addVectors<int> <<< num_blocks, num_threads, 1>>> (dresult, dv1, dv2);

	cudaMemcpy(hresult, dresult, sizeof(int)*klenght, cudaMemcpyDeviceToHost);

	std::cout << printVector<int>(hv1, klenght);
	std::cout << " + ";
	std::cout << printVector<int>(hv2, klenght);
	std::cout << " = ";
	std::cout << printVector<int>(hresult, klenght);
	std::cout << std::endl;

	free(hv1);
	free(hv2);
	free(hresult);

	cudaFree(dv1);
	cudaFree(dv2);
	cudaFree(dresult);

	getchar();
	return 0;
}