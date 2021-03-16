package recursividad;

import java.util.Scanner;

/**
 * Leer n valores enteros, almacenarlos en un arreglo y realizar la suma de los
 * elementos del vector.
 */

public class ejercicio_11 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Entrada
    int m[] = null;
    int limit = 0;

    // Salida
    int result = 0;

    System.out.print("\nIngrese el limite de valores: ");
    limit = sc.nextInt();

    m = new int[limit];

    System.out.println();

    for (int i = 0; i < m.length; i++) {
      System.out.print("[" + i + "] = ");
      m[i] = sc.nextInt();
    }

    result = sum(m, m.length - 1);

    System.out.println("\nLa suma = " + result + "\n");

    sc.close();

  }

  public static int sum(int m[], int pos) {
    if (pos == 0)
      return m[pos];
    else
      return sum(m, pos - 1) + m[pos];
  }
}
