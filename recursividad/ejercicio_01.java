package recursividad;

import java.util.Scanner;

/**
 * Leer un numero entero y n calcular el factorial de dicho numero.
 */

public class ejercicio_01 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Entrada
    int number = 0;

    // Salida
    int factorial = 1;

    System.out.print("\nIngrese numero entero: ");
    number = sc.nextInt();

    factorial = getFactorial(number);

    System.out.println("\nFactorial de " + number + "! = " + factorial);

    sc.close();

  }

  public static int getFactorial(int number) {
    if (number == 0)
      return 1;
    else
      return (getFactorial(number - 1) * number);
  }
}
