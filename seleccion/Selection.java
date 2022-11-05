package seleccion;

import java.util.Arrays;

public class Selection{

  public static void printArray(int[] numbers){
    System.out.println(Arrays.toString(numbers));
  }

  public static void orderArray(int[] numbers){
    for(int i = 0; i < numbers.length; i++){
      int min = i; // Tomamos el valor de que hay en el indice para comprapar con el otro

      // Start ford 2
      for(int j = i + 1; j < numbers.length; j++){ // Busca el numero menor de la lista - Array
        if(numbers[j] < numbers[min]){
          min = j; // Lo que se guarda el indice en donde esta el numero menor para intercambiar
        } 
      }
      // End For 2 
      
      int aux = numbers[i]; // Se guarda tamporalmente el valor del indice
      numbers[i] = numbers[min]; // Guardamos el numero
      numbers[min] = aux;
    }

    printArray(numbers);
  }


  public static void main(String[] args) {
    int[] numbers = {6, 4, 2, 1, 3, 5, 10, 8, 20};

    orderArray(numbers);
  }
}