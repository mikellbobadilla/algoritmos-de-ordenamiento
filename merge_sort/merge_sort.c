#include <stdio.h>
#include <stdlib.h>

void Mezclar(int numeros[], int inicio, int mitad, int final){
  int auxiliar[final];
  int k = 0;
  int i = inicio;
  int j = mitad + 1;

  while(i <= mitad && j <= final){
    k++;
    if(numeros[i] < numeros[j]){
      auxiliar[k] = numeros[i];
      i++;
    }
  }
}

void MergeSort(int numeros[], int inicio, int final){
  int mitad;

  mitad = (inicio + final)/2; // 

  if(inicio < final){
    MergeSort(numeros, inicio, mitad); // Toma la parte izquierda del arreglo dividido
    MergeSort(numeros, mitad + 1, final); // Toma la parte derecha del arreglo dividido
    Mezclar(numeros, inicio, mitad, final);
  }
}