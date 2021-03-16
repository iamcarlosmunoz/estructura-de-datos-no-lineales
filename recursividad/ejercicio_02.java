package recursividad;

import java.util.Scanner;

/**
 * Leer un número entero y calcular la sumatoria hasta el numero leído.
 */

public class ejercicio_02 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Entrada
    int number = 0;

    System.out.print("\nIngrese el valor: ");
    number = sc.nextInt();

    System.out.println("\nLa sumatoria de " + number + " = " + summation(number) + "\n");

    sc.close();

  }

  public static int summation(int number) {

    if (number == 0)
      return 0;
    else
      return summation(number - 1) + number;

  }
}
