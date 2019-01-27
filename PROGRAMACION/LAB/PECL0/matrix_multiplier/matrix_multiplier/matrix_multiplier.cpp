#include "matrix_multiplier.h"

using namespace std;

int main(){
	//Generación aleatoria de datos en dos matrices cuadradas (para poderlas multiplicar y sumar)
	std::srand(static_cast<int>(time(0)));
	int len_matrix_a_x = static_cast<int>(std::rand() % 10 + 1);
	int len_matrix_a_y = len_matrix_a_x;
	int len_matrix_a = len_matrix_a_x * len_matrix_a_y;
	int len_matrix_b_x = len_matrix_a_x;
	int len_matrix_b_y = len_matrix_b_x;
	int len_matrix_b = len_matrix_b_x * len_matrix_b_y;
	int **matrix_a = static_cast<int **>(malloc(sizeof(int *) * len_matrix_a_x));
	int **matrix_b = static_cast<int **>(malloc(sizeof(int *) * len_matrix_b_y));
	for (int i = 0; i < len_matrix_a_x; ++i) {
		matrix_a[i] = static_cast<int *>(malloc(sizeof(int) * len_matrix_a_y));
		for (int j = 0; j < len_matrix_a_y; ++j) {
			matrix_a[i][j] = static_cast<int>(std::rand() % 20 + 1);
		}
	}
	for (int i = 0; i < len_matrix_b_x; ++i) {
		matrix_b[i] = static_cast<int *>(malloc(sizeof(int) * len_matrix_b_y));
		for (int j = 0; j < len_matrix_b_y; ++j) {
			matrix_b[i][j] = static_cast<int>(std::rand() % 20 + 1);
		}
	}

	std::cout << "A = " << string_matrix<int>(&matrix_a, len_matrix_a_x, len_matrix_a_y) << std::endl;
	std::cout << "B = " << string_matrix<int>(&matrix_b, len_matrix_b_x, len_matrix_b_y) << std::endl;

	//Suma de matrices
	int **sum = nullptr;
	int len_sum_x = 0;
	int len_sum_y = 0;
	sum_matrix(&matrix_a, len_matrix_a_x, len_matrix_a_y, &matrix_b, len_matrix_b_x, len_matrix_b_y, &sum, &len_sum_x, &len_sum_y);
	std::cout << "A + B = " << string_matrix<int>(&sum, len_sum_x, len_sum_y) << std::endl;

	//Multiplicación de matrices
	int **mul = nullptr;
	int len_mul_x = 0;
	int len_mul_y = 0;
	multiply_matrix(&matrix_a, len_matrix_a_x, len_matrix_a_y, &matrix_b, len_matrix_b_x, len_matrix_b_y, &mul, &len_mul_x, &len_mul_y);
	std::cout << "A * B = " << string_matrix<int>(&mul, len_mul_x, len_mul_y) << std::endl;

	system("pause");
	return 0;
}

template <class T>
std::string string_matrix(T ***matrix, int size_y, int size_x, const std::string &separator) {
	std::stringstream ss;
	ss << "{\n";
	for (int i = 0; i < size_x; ++i) {
		ss << "\t{";
		for (int j = 0; j < size_y; ++j) {
			ss << (*matrix)[i][j];
			ss << separator;
		}
		ss << "}\n";
	}
	ss << "}";
	return ss.str();
}

template <class T>
void sum_matrix(T ***m1, int size1_x, int size1_y, T ***m2, int size2_x, int size2_y, T ***result, int *result_size_x, int *result_size_y) {
	if (size1_x != size2_x) {
		return;
	}
	if (size1_y != size2_y) {
		return;
	}
	*result_size_x = size1_x;
	*result_size_y = size1_y;
	*result = static_cast<T **>(malloc(sizeof(T *) * *result_size_x));
	for (int i = 0; i < *result_size_x; ++i) {
		(*result)[i] = static_cast<T *>(malloc(sizeof(T) * *result_size_y));
		for (int j = 0; j < *result_size_y; ++j) {
			(*result)[i][j] = (*m1)[i][j] + (*m2)[i][j];
		}
	}
}

template <class T>
void multiply_matrix(T ***m1, int size1_x, int size1_y, T ***m2, int size2_x, int size2_y, T ***result, int *result_size_x, int *result_size_y) {
	if (size1_x != size2_y) {
		return;
	}
	*result_size_x = size1_x;
	*result_size_y = size2_y;
	*result = static_cast<T **>(malloc(sizeof(T *) * *result_size_x));
	for (int i = 0; i < *result_size_x; ++i) {
		(*result)[i] = static_cast<T *>(malloc(sizeof(T) * *result_size_y));
		for (int j = 0; j < *result_size_y; ++j) {
			(*result)[i][j] = 0;
			for (int k = 0; k < *result_size_x; ++k) {
				(*result)[i][j] += (*m1)[i][k] * (*m2)[k][j];
			}
		}
	}
}
