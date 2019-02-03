
#include "cuda_runtime.h"
#include "device_launch_parameters.h"
#include <stdio.h>

int main() {
	int nDevices;
	cudaGetDeviceCount(&nDevices);
	for (int i = 0; i < nDevices; i++) {
		cudaDeviceProp prop;
		cudaGetDeviceProperties(&prop, i);
		printf("\n------------ Device Number: %d ------------\n\n", i);
		printf("  Device name: %s\n", prop.name);
		printf("  Memory Clock Rate (KHz): %d\n", prop.memoryClockRate);
		printf("  Memory Bus Width (bits): %d\n", prop.memoryBusWidth);
		printf("  Peak Memory Bandwidth (GB/s): %f\n\n", 2.0*prop.memoryClockRate*(prop.memoryBusWidth / 8) / 1.0e6);
		
		printf("Max Threads per block %d\n", prop.maxThreadsPerBlock);
		printf("Shared memory per block %d\n\n", prop.sharedMemPerBlock);
		printf("Max block size: ");
		printf("(\n  [x->%d], \n  [y->%d], \n  [z->%d]\n)\n", prop.maxThreadsDim[0], prop.maxThreadsDim[1], prop.maxThreadsDim[2]);
		printf("Max grid size: ");
		printf("(\n  [x->%d], \n  [y->%d], \n  [z->%d]\n)\n", prop.maxGridSize[0], prop.maxGridSize[1], prop.maxGridSize[2]);
	}
	getchar();
    return 0;
}