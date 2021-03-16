package recursividad;

import java.util.Scanner;

/**
 * Leer un número entero e invertirlo. Ejemplo: Entrada: 123 Salida: 321
 */

public class ejercicio_04 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int numero;

    System.out.print("\nIngrese el valor: ");
    numero = sc.nextInt();

    sc.close();

    System.out.print("\nResultado = ");
    reverseNumber(numero);
    System.out.println("\n");

  }

  public static void reverseNumber(int number) {
    if (number != 0) {
      System.out.print(number % 10);
      reverseNumber(number / 10);
    }
  }
}
