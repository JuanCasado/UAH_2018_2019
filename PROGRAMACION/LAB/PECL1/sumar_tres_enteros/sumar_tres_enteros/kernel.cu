
#include "cuda_runtime.h"
#include "device_launch_parameters.h"

#include <stdio.h>

template <class T>
__global__ T suma3 (const T a, const T b, const T c) {
	return a + b + c;
}

int main()
{
	int ha = 1;
	int hb = 2;
	int hc = 3;
	int da;
	int db;
	int dc;
	int hresult;
	int dresult;

    // Add vectors in parallel.
    cudaError_t cudaStatus = addWithCuda(c, a, b, arraySize);
    if (cudaStatus != cudaSuccess) {
        fprintf(stderr, "addWithCuda failed!");
        return 1;
    }

    printf("{1,2,3,4,5} + {10,20,30,40,50} = {%d,%d,%d,%d,%d}\n",
        c[0], c[1], c[2], c[3], c[4]);

    // cudaDeviceReset must be called before exiting in order for profiling and
    // tracing tools such as Nsight and Visual Profiler to show complete traces.
    cudaStatus = cudaDeviceReset();
    if (cudaStatus != cudaSuccess) {
        fprintf(stderr, "cudaDeviceReset failed!");
        return 1;
    }

    return 0;
}

