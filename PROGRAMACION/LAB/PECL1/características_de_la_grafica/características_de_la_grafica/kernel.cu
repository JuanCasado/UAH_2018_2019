
#include "cuda_runtime.h"
#include "device_launch_parameters.h"
#include <stdio.h>

/*
PASOS SEGUIDOS PARA AÑADIR EL ARCHIVO DE CABECERAS: #include "common/book.h"
	- Clonar el repositorio de GitHub: https://github.com/CodedK/CUDA-by-Example-source-code-for-the-book-s-examples-
	- Ir a Proyect>Properties en VS
	- Añadir la raiz del repositorio clonado a: INCLUDE PATH
	- Añadir el directorio lib del repositorio clonado a: LIBRARY PATH
	- Añadir el directorio bin del repositorio clonado a: EXECUTABLE PATH
*/
#include "common/book.h"

int main() {
	int nDevices;
	HANDLE_ERROR(cudaGetDeviceCount(&nDevices));
	for (int i = 0; i < nDevices; i++) {
		cudaDeviceProp prop;
		HANDLE_ERROR(cudaGetDeviceProperties(&prop, i));
		printf("\n------------ Device Number: %d ------------\n\n", i);
		printf("Device name: %s\n\n", prop.name);
		printf("Calculo como en el ejercicio de clase:\n");
		printf("  Memory Clock Rate (KHz): %d\n", prop.memoryClockRate);
		printf("  Memory Bus Width (bits): %d\n", prop.memoryBusWidth);
		printf("  Peak Memory Bandwidth (GB/s): %f\n\n", 2.0*prop.memoryClockRate*(prop.memoryBusWidth / 8) / 1.0e6);

		printf("Total global memory %lld\n", prop.totalGlobalMem);
		printf("Total const memory %d\n", prop.totalConstMem);
		printf("Memory pitch %d\n\n", prop.memPitch);
		
		printf("Multiprocesor count %d\n", prop.multiProcessorCount);
		printf("Max Threads per multiprocesor %d\n", prop.maxThreadsPerMultiProcessor);
		printf("Shared memory per multiprocesor %d\n", prop.sharedMemPerMultiprocessor);
		printf("Registers per multiprocesor %d\n\n", prop.regsPerMultiprocessor);

		printf("Max Threads per block %d\n", prop.maxThreadsPerBlock);
		printf("Shared memory per block %d\n", prop.sharedMemPerBlock);
		printf("Registers per block %d\n", prop.regsPerBlock);
		printf("Max block size: ");
		printf("( [x->%d], [y->%d], [z->%d] )\n", prop.maxThreadsDim[0], prop.maxThreadsDim[1], prop.maxThreadsDim[2]);
		printf("Max grid size: ");
		printf("( [x->%d], [y->%d], [z->%d] )\n", prop.maxGridSize[0], prop.maxGridSize[1], prop.maxGridSize[2]);

		printf("Device Overlap %d\n", prop.deviceOverlap);
		printf("Kernel Execution Timeout %d\n", prop.kernelExecTimeoutEnabled);
	}
	getchar();
    return 0;
}