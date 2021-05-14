package complejidad;

import java.util.Scanner;

/**
 * Leer un número y determinar si es primo.
 */
public class E08 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int contador = 1;
    int i = 2;

    System.out.print("\nIngrese número entero: ");
    int numero = sc.nextInt();

    while ((contador++ != 0 && numero % i != 0)) {
      contador++;
      i++;
    }

    if (i == numero) {
      System.out.println("\nEl número es PRIMO");
    } else {
      System.out.println("\nNO es PRIMO");
    }
    System.out.println("\nNúmero de instrucciones: " + contador);

    sc.close();

    // Complejidad Algoritmica
    // 1 + n - 1 + n - 2
    // = -2 + 2n
  }
}
