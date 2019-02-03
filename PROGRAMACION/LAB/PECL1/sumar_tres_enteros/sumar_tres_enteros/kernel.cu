#include <cuda.h>
#include <cuda_runtime.h>

#include <stdio.h>

/*
Adds three templated classes, they must implement the + operator.
Result is an I/O parameter.
*/
template <class T>
__global__ void add3 (T *result, const T *a, const T *b, const T *c) {
	*result =  *a + *b + *c;
}

int main() {
	int ha = 1;
	int hb = 2;
	int hc = 3;
	int *da;
	int *db;
	int *dc;
	int hresult;
	int *dresult;

	//Allocate GPU memory.
	cudaMalloc((void**)&da, sizeof(int));
	cudaMalloc((void**)&db, sizeof(int));
	cudaMalloc((void**)&dc, sizeof(int));
	cudaMalloc((void**)&dresult, sizeof(int));

	//CPU --> GPU
	cudaMemcpy(da, &ha, sizeof(int), cudaMemcpyHostToDevice);
	cudaMemcpy(db, &hb, sizeof(int), cudaMemcpyHostToDevice);
	cudaMemcpy(dc, &hc, sizeof(int), cudaMemcpyHostToDevice);
	cudaMemcpy(dresult, &hresult, sizeof(int), cudaMemcpyHostToDevice);

	//Perform GPU operations
	add3<int><<<1, 1, 1>>>(dresult ,da, db, dc);

	//CPU <-- GPU
	cudaMemcpy(&hresult, dresult, sizeof(int), cudaMemcpyDeviceToHost);

	//Show result
	printf("%d + %d + %d = %d\n", ha, hb, hc, hresult);
    return 0;
}

