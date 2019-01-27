# CMakeList.txt: archivo del proyecto de CMake de nivel superior, establezca la configuración global
# e incluya los subproyectos aquí.
#
cmake_minimum_required (VERSION 3.8)
set (CMAKE_CXX_STANDARD 11)

project ("vector_multiplier")

# Incluya los subproyectos.
add_subdirectory ("vector_multiplier")
