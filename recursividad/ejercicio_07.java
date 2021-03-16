package recursividad;

import java.util.Scanner;

/**
 * Leer un número llamado base y otro exponente y calcular la potencia elevando
 * la base al exponente.
 */

public class ejercicio_07 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Entrada
    int base = 0;
    int exponent = 1;

    // Salida
    int result = 0;

    System.out.print("\nIngrese base: ");
    base = sc.nextInt();

    System.out.print("Ingrese exponente: ");
    exponent = sc.nextInt();

    result = pow(base, exponent);

    System.out.println("\nResultado = " + result + "\n");

    sc.close();

  }

  public static int pow(int base, int exponent) {
    if (exponent == 0)
      return 1;
    else
      return pow(base, exponent - 1) * base;
  }
}
