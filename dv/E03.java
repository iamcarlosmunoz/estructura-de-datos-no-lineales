package dv;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Realice un programa que inicialice un vector de tamaño n y lo ordene (use
 * cualquier método de ordenamiento) y adicionalmente lea un número para
 * buscarlo en el vector. Determine si el número se encuentra o no en el vector.
 * Si se encuentra imprima la posición (Use búsqueda binaria).
 */
 
public class E03 {

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
    Arrays.sort(vector);
    System.out.println("Vector Ordenado:");
    for (int numero : vector) {
      System.out.print(numero + " ");
    }
    System.out.println();

    // Ingresar numero
    System.out.print("\nIngrese número a buscar: ");
    int numero = sc.nextInt();

    // Evaluar busqueda
    int pos = busquedaBinaria(vector, numero);
    if (pos == -1) {
      System.out.println("El número no esta en el vector");
    } else {
      System.out.println("El número se encontro en la posicion: " + pos);
    }

  }

  private static int busquedaBinaria(int vector[], int numero) {

    int posInicial = 0;
    int posFinal = vector.length - 1;

    while (posInicial <= posFinal) {
      int mitad = posInicial + posFinal / 2;
      if (vector[mitad] == numero) {
        return mitad;
      }
      if (vector[mitad] < numero) {
        posInicial = mitad + 1;
      } else {
        posFinal = mitad - 1;
      }
    }
    return -1;
  }
}
