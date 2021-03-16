package recursividad;

import java.util.Scanner;

/**
 * Leer un valor entero y calcular la sumatoria 1 + 1/2 +1/3+ … 1/n.
 */

public class ejercicio_03 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Entrada
    int number = 0;

    System.out.print("\nIngrese el valor: ");
    number = sc.nextInt();

    System.out.println("\nLa sumatoria de " + number + " = " + summation(number) + "\n");

    sc.close();

  }

  public static float summation(int number) {

    if (number == 0)
      return 0;
    else
      return summation(number - 1) + (1f / number);

  }
}
