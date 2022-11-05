#include <stdio.h>
#include <stdlib.h>

void printArray(int numeros[], int cantidad){
  printf("Valores:[ ");
  for(int i = 0; i < cantidad; i++){
    printf("%i ", numeros[i]);
  }
  printf("]");
}

int* CreateArray(int cantidad){
  int* numbers = (int*) malloc(cantidad * sizeof(int));
  return numbers;
}

void FreeArray(int* array){
  free(array);
}

void OrderArray(int* numbers, int cantEl){
  int temp;
  int min;
  for(int i = 0; i < cantEl; i++){
    min = i;
    for(int j = i + 1; j < cantEl; j++){
      if(numbers[j] < numbers[min]){
        min = j;
      }
    }

    temp = numbers[i];
    numbers[i] = numbers[min];
    numbers[min] = temp;

  }
  printArray(numbers, cantEl);
}

int main(){
  int* numbers = CreateArray(6);
  numbers[0] = 6;
  numbers[1] = 4;
  numbers[2] = 2;
  numbers[3] = 1;
  numbers[4] = 5;
  numbers[5] = 3;

  OrderArray(numbers, 6);  
  FreeArray(numbers);
}