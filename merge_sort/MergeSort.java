// ¡Por supuesto!El algoritmo Merge Sort es un algoritmo de ordenamiento eficiente que divide una lista en dos mitades,ordena cada mitad de forma recursiva y luego fusiona las dos mitades ordenadas en una sola lista ordenada.

// El proceso de división y fusión continúa hasta que la lista completa se ha ordenado.El algoritmo es muy eficiente para grandes conjuntos de datos,aunque requiere más espacio de memoria que otros algoritmos de ordenamiento como Quick Sort.

package merge_sort;

public class MergeSort {

  public static void main(String[] args) {
    int[] arr = { 12, 11, 13, 5, 6, 7 };

    System.out.println("Array original:");
    imprimirArray(arr);

    MergeSort ob = new MergeSort();
    ob.ordenar(arr, 0, arr.length - 1);

    System.out.println("\nArray ordenado:");
    imprimirArray(arr);
  }

  // Función para imprimir un array
  public static void imprimirArray(int[] arr) {
    for (int i = 0; i < arr.length; ++i) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  // Función principal de Merge Sort
  public void ordenar(int[] arr, int inicio, int fin) {
    if (inicio < fin) {
      // Encuentra el punto medio del array
      int mitad = (inicio + fin) / 2;

      // Ordena la primera mitad
      ordenar(arr, inicio, mitad);

      // Ordena la segunda mitad
      ordenar(arr, mitad + 1, fin);

      // Une ambas mitades
      merge(arr, inicio, mitad, fin);
    }
  }

  // Función para unir dos sub-arrays de arr[]
  public void merge(int[] arr, int inicio, int mitad, int fin) {
    // Encuentra el tamaño de los sub-arrays que se van a fusionar
    int n1 = mitad - inicio + 1;
    int n2 = fin - mitad;

    // Crea dos sub-arrays temporales
    int[] L = new int[n1];
    int[] R = new int[n2];

    // Copia los datos a los sub-arrays temporales
    for (int i = 0; i < n1; ++i) {
      L[i] = arr[inicio + i];
    }
    for (int j = 0; j < n2; ++j) {
      R[j] = arr[mitad + 1 + j];
    }

    // Fusiona los sub-arrays temporales
    int i = 0, j = 0;

    // Indice inicial del sub-array que se fusionará
    int k = inicio;
    while (i < n1 && j < n2) {
      if (L[i] <= R[j]) {
        arr[k] = L[i];
        i++;
      } else {
        arr[k] = R[j];
        j++;
      }
      k++;
    }

    // Copia los elementos restantes de L[], si los hay
    while (i < n1) {
      arr[k] = L[i];
      i++;
      k++;
    }

    // Copia los elementos restantes de R[], si los hay
    while (j < n2) {
      arr[k] = R[j];
      j++;
      k++;
    }
  }
}
