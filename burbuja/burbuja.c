#include <stdio.h>
#include <stdlib.h>

int* CreateArray(int cantidad){
  int* numbers = (int*) malloc(cantidad * sizeof(int));
  return numbers;
}

void FreeArray(int* array){
  free(array);
}

void printArray(int numeros[], int cantidad){
  printf("Valores:[ ");
  for(int i = 0; i < cantidad; i++){
    printf("%i ", numeros[i]);
  }
  printf("]");
}

void OrderByBurbuja(int* numbers, int cantEl){
  int auxiliar;

  for(int i = 0; i < cantEl; i++){
    for(int j = i + 1; j < cantEl; j++){
      if(numbers[i] > numbers[j]){
        auxiliar = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = auxiliar;
      }
    }
  }

  printArray(numbers, cantEl);
}

int main(){
  int cant = 6;
  int* numbers = CreateArray(cant);
  numbers[0] = 6;
  numbers[1] = 4;
  numbers[2] = 2;
  numbers[3] = 1;
  numbers[4] = 5;
  numbers[5] = 3;

  OrderByBurbuja(numbers, cant);
  FreeArray(numbers);
  return 0;
}