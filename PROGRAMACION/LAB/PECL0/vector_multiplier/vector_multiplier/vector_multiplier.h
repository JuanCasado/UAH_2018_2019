// vector_multiplier.h: archivo de inclusión para archivos de inclusión estándar del sistema,
// o archivos de inclusión específicos de un proyecto.

#ifndef vector_multiplier_h
#define vector_multiplier_h

#include <iostream>
#include <sstream>
#include <string>
#include <cstdlib>
#include <ctime>
#include <algorithm>
#include <stdlib.h>

/*
Convierte un vector en una cadena con un separador detrás de cada elemento
El tipo de los datos debe implementar el operador <<
*/
template <class T>
std::string string_vector(const T *vector, int size, const std::string &separator = ", ");

/*
Suma los elementos de posición común de un vector
Los parametros result y result_size son de entrada y salida de datos
El tipo de los datos debe implementar el operador +
*/
template <class T>
void sum_vectors(const T *v1, int size1, const T *v2, int size2, T **result, int *result_size);

/*
Multiplica los elementos de posición común de un vector
Los parametros result y result_size son de entrada y salida de datos
El tipo de los datos debe implementar el operador *
*/
template <class T>
void multiply_vectors(const T *v1, int size1, const T *v2, int size2, T **result, int *result_size);

/*
Retorna la suma los elementos un vector
El tipo de los datos debe implementar el operador +
*/
template <class T>
T sum_value(const T *vector, int size);

/*
Retorna la suma los elementos de un vector
El tipo de los datos debe implementar el operador *
*/
template <class T>
T multiply_value(const T *vector, int size);

#endif


// TODO: Haga referencia aquí a los encabezados adicionales que el programa requiere.
