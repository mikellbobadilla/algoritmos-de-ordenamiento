package burbuja;

import java.util.Arrays;

public class Burbuja {

  public static void orderByBurbuja(int[] numbers) {
    int auxiliar;
    for (int i = 0; i < numbers.length; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        if (numbers[i] > numbers[j]) {
          auxiliar = numbers[i];
          numbers[i] = numbers[j];
          numbers[j] = auxiliar;
        }
      }
    }
    System.out.println(Arrays.toString(numbers));
  }

  public static void main(String[] args) {
    int[] numbers = { 4, 2, 6, 1, 5, 3 };
    orderByBurbuja(numbers);
  }
}