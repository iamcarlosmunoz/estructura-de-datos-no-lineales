package recursividad;

import java.util.Scanner;

/**
 * La función de Ackerman se define como: Ackerman(m, n) = n + 1 si m = 0
 * Ackerman(m, n) = Ackerman(m - 1, 1) si m > 0 y n = 0 Ackerman(m, n) =
 * Ackerman(m - 1, Ackerman(m, n - 1)) si m > 0 y n > 0 Ej. Si se tiene
 * Ackermann(1, 2) = 4; Ackermann(3, 2) = 29 Realice un programa para encontrar
 * el valor de lfuncion de Ackerman, para dos valores enteros m,n.
 */

public class ejercicio_14 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Entrada
    int m = 0;
    int n = 0;

    // Salida
    long result = 0;

    System.out.print("\nIngrese primer valor: ");
    m = sc.nextInt();

    System.out.print("Ingrese segundo valor: ");
    n = sc.nextInt();

    result = ackermann(m, n);

    System.out.println("\nResultado = " + result + "\n");

    sc.close();

  }

  public static long ackermann(long m, long n) {
    if (m == 0)
      return n + 1;
    else if (m > 0 && n == 0)
      return ackermann(m - 1, 1);
    else
      return ackermann(m - 1, ackermann(m, n - 1));
  }
}
