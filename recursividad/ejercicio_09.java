package recursividad;

import java.util.Scanner;

/**
 * Leer 2 numeros enteros y calcular el cociente de la división
 * entera.(sugerencia:use restas sucesivas)
 */

public class ejercicio_09 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Entrada
    int dividend = 0;
    int divisor = 0;

    // Salida
    int quotient = 0;

    System.out.print("\nIngrese dividendo: ");
    dividend = sc.nextInt();

    System.out.print("Ingrese divisor: ");
    divisor = sc.nextInt();

    quotient = division(dividend, divisor);

    System.out.println("\nCociente = " + quotient + "\n");

    sc.close();
  }

  public static int division(int dividend, int divisor) {
    if (divisor > dividend)
      return 0;
    else
      return 1 + division(dividend - divisor, divisor);
  }
}
