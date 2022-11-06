package merge_sort;

public class MergeSort{

  public static void sort(int[] numeros, int inicio, int end){
    if(inicio < end){
      int mitad = (inicio + end)/2;

      sort(numeros, inicio, mitad); // Lado izquierdo
      sort(numeros, mitad + 1, end); // lado derecho

      merge(numeros, inicio, mitad, end);
    }
  }


  private static void merge(int[] numeros, int inicio, int mitad, int end) {
  }


  public static void main(String[] args) {
    int[] numeros = {2, 3, 4, 5, 7, 0, 6, 10, 9, 8};


  }
}