#ifndef matrix_multiplier_h
#define matrix_multiplier_h

#include <iostream>
#include <sstream>
#include <string>
#include <cstdlib>
#include <ctime>
#include <algorithm>
#include <stdlib.h>

/*
Convierte una matrixz en una cadena con un separador detrás de cada elemento
El tipo de los datos debe implementar el operador <<
*/
template <class T>
std::string string_matrix(T ***matrix, int size_y, int size_x, const std::string &separator = ", ");

/*
Suma dos matrices
Los parametros result,  result_size_x y result_size_y son de entrada y salida
El tipo de los datos debe implementar el operador +
*/
template <class T>
void sum_matrix(T ***m1, int size1_x, int size1_y, T ***m2, int size2_x, int size2_y, T ***result, int *result_size_x, int *result_size_y);

/*
Multiplica los elementos de posición común de un vector
Los parametros result,  result_size_x y result_size_y son de entrada y salida
El tipo de los datos debe implementar el operador *
*/
template <class T>
void multiply_matrix(T ***m1, int size1_x, int size1_y, T ***m2, int size2_x, int size2_y, T ***result, int *result_size_x, int *result_size_y);

#endif
