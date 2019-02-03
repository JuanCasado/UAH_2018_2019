
#include "cuda_runtime.h"
#include "device_launch_parameters.h"
#include <stdlib.h>
#include <cuda.h>
#include <cuda_runtime.h>
#include <stdio.h>
#include <iostream>

__global__ void set2 (int *dnum) {
	*dnum = 2;
}

int main() {
	int hnum = 0, *dnum;
    
	cudaMalloc((void**) &dnum, sizeof(int));
	cudaMemcpy(dnum, &hnum, sizeof(int), cudaMemcpyHostToDevice);

	set2 <<< 1, 1 >>> (dnum);

	cudaMemcpy(&hnum, dnum, sizeof(int), cudaMemcpyDeviceToHost);

	std::cout << "a = " << hnum << std::endl;
	cudaFree(dnum);

	getchar();
    return 0;
}

