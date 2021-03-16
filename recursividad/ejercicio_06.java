package recursividad;

import java.util.Scanner;

/**
 * Leer un número y sumar los dígitos del número. Ejemplo: Entrada: 123
 * Resultado:6
 */

public class ejercicio_06 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Entrada
    int number;

    System.out.print("\nIngrese el valor: ");
    number = sc.nextInt();

    System.out.println("\nla sumatoria de los digitos de " + number + " = " + sum(number) + "\n");

    sc.close();

  }

  public static int sum(int number) {
    if (number == 0)
      return number;
    else
      return sum(number / 10) + number % 10;
  }

}
