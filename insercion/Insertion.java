package insercion;

import java.util.Arrays;

public class Insertion {

  public static void orderArray(int[] numbers){
    int position; // Para guardar la posicion del Array
    int auxiliar; // Para guardar el valor dependiendo la posicion del array

    for(int i = 0; i < numbers.length; i++){
      position = i;
      auxiliar = numbers[i];

      while((position > 0) && (numbers[position - 1] > auxiliar)){
        numbers[position] = numbers[position - 1];
        position--;
      }
     
      numbers[position] = auxiliar;
    }

    System.out.println(Arrays.toString(numbers));
  }

  public static void main(String[] args) {
    int[] numbers = {6, 4, 2, 1, 3, 5};
    orderArray(numbers);
  }
}
