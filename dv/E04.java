package dv;

import java.util.Scanner;

/**
 * Realice un programa que inicialice y ordene un vector de tamaño n, mediante
 * el método Quicksort.
 */
 
public class E04 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("\nIngrese limite del vector: ");
    int limite = sc.nextInt();

    // Inicializar vector
    int vector[] = new int[limite];
    for (int pos = 0; pos < vector.length; pos++) {
      System.out.print("[" + pos + "] = ");
      vector[pos] = sc.nextInt();
    }

    // Ordenar vector
    quickSort(vector, 0, vector.length - 1);

    // imprimir vector
    System.out.println("\nVector ordenado:");
    for (int numero : vector) {
      System.out.print(numero + " ");
    }
    System.out.println();

    sc.close();
  }

  private static void quickSort(int vector[], int izquierda, int derecha) {
    int pivote = vector[izquierda];
    int i = izquierda;
    int j = derecha;

    while (i < j) {
      while (vector[i] <= pivote && i < j) {
        i++;
      }
      while (vector[j] > pivote) {
        j--;
      }
      if (i < j) {
        int aux = vector[i];
        vector[i] = vector[j];
        vector[j] = aux;
      }
    }

    vector[izquierda] = vector[j];
    vector[j] = pivote;

    if (izquierda < j - 1) {
      quickSort(vector, izquierda, j - 1);
    }
    if (j + 1 < derecha) {
      quickSort(vector, j + 1, derecha);
    }
  }
}
