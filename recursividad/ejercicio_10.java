package recursividad;

import java.util.Scanner;

/**
 * Leer 2 numeros enteros y realizar la multiplicacion de los 2 numeros mediante
 * sumas sucesivas.
 */

public class ejercicio_10 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Entrda
    int a = 0;
    int b = 0;

    // Salida
    int result = 0;

    System.out.print("\nIngrese numero = ");
    a = sc.nextInt();

    System.out.print("Ingrese numero = ");
    b = sc.nextInt();

    result = multiplication(a, b);

    System.out.println("\nResultado = " + result + "\n");

    sc.close();

  }

  public static int multiplication(int a, int b) {
    if (b == 0)
      return 0;
    else
      return a + multiplication(a, b - 1);
  }
}
