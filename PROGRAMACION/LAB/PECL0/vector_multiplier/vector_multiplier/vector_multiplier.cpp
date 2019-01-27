#include "vector_multiplier.h"

int main(int argc, char **argv) {
	//Generación aleatoria de datos en dos vectores
	std::srand(static_cast<int>(time(0)));
	int len_venctor_a = static_cast<int>(std::rand() % 10 + 1);
	int len_venctor_b = static_cast<int>(std::rand() % 10 + 1);
	int *vector_a = static_cast<int *>(malloc(sizeof(int)*len_venctor_a));
	int *vector_b = static_cast<int *>(malloc(sizeof(int)*len_venctor_b));
	for (int i = 0; i < len_venctor_a; ++i) {
		vector_a[i] = static_cast<int>(std::rand() % 20 + 1);
	}
	for (int i = 0; i < len_venctor_b; ++i) {
		vector_b[i] = static_cast<int>(std::rand() % 20 + 1);
	}

	//Se muestran los datos sobre los que se va a operar
	std::cout << "A = " << string_vector<int>(vector_a, len_venctor_a) << std::endl;
	std::cout << "B = " << string_vector<int>(vector_b, len_venctor_b) << std::endl;

	//Suma de los datos de posición común de los vectores
	int sum_len = 0;
	int *sum_result = nullptr;
	sum_vectors<int>(vector_a, len_venctor_a, vector_b, len_venctor_b, &sum_result, &sum_len);
	std::cout << "A + B= " << string_vector<int>(sum_result, sum_len) << std::endl;
	//Multiplicación de los datos de posición común de los vectores
	int *mul_result = nullptr;
	int mul_len = 0;
	sum_vectors<int>(vector_a, len_venctor_a, vector_b, len_venctor_b, &mul_result, &mul_len);
	std::cout << "A * B = " << string_vector<int>(mul_result, mul_len) << std::endl;
	//Suma de los elementos de un vector
	std::cout << "SUM(A) = " << sum_value<int>(vector_a, len_venctor_a) << std::endl;
	std::cout << "SUM(B) = " << sum_value<int>(vector_b, len_venctor_b) << std::endl;
	//Multiplicación de los elementos de un vector
	std::cout << "MUL(A) = " << multiply_value<int>(vector_a, len_venctor_a) << std::endl;
	std::cout << "MUL(B) = " << multiply_value<int>(vector_b, len_venctor_b) << std::endl;

	system("pause");
	return 0;
}



template <class T>
std::string string_vector(const T *vector, int size, const std::string &separator) {
	std::stringstream ss;
	ss << "{";
	for (int i = 0; i < size; ++i) {
		ss << vector[i];
		ss << separator;
	}
	ss << "}";
	return ss.str();
}

template <class T>
void sum_vectors(const T *v1, int size1, const T *v2, int size2, T **result, int *result_size) {
	*result_size = std::min(size1, size2);
	*result = (T *)malloc(sizeof(T) * *result_size);
	for (int i = 0; i < *result_size; ++i) {
		(*result)[i] = v1[i] + v2[i];
	}
}

template <class T>
void multiply_vectors(const T *v1, int size1, const T *v2, int size2, T **result, int *result_size) {
	*result_size = std::min(size1, size2);
	*result = (T *)malloc(sizeof(T) * *result_size);
	for (int i = 0; i < *result_size; ++i) {
		(*result)[i] = v1[i] * v2[i];
	}
}

template <class T>
T sum_value(const T *vector, int size) {
	T result = 0;
	for (int i = 0; i < size; ++i) {
		result += vector[i];
	}
	return result;
}

template <class T>
T multiply_value(const T *vector, int size) {
	T result = 1;
	for (int i = 0; i < size; ++i) {
		result *= vector[i];
	}
	return result;
}