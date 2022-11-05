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

void OrderByInsertion(int* numbers, int cantEl){
  int position;
  int auxiliar;

  for(int i = 0; i < cantEl; i++){
    position = i;
    auxiliar = numbers[i];

    while((position > 0) && (numbers[position - 1] > auxiliar)){
      numbers[position] = numbers[position - 1];
      position--;
    }

    numbers[position] = auxiliar;
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

  OrderByInsertion(numbers, 6);
  FreeArray(numbers);
}



