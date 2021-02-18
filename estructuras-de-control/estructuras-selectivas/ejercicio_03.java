
/**
 * Leer un número entero y determinar si es par o impar
 */

import java.util.Scanner;

class ejercicio_03 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int numero = 0;

    System.out.print("\nIngrese número entero = ");
    numero = sc.nextInt();

    if (numero % 2 == 0) {
      System.out.println("\n[" + numero + "] es PAR");
    } else {
      System.out.println("\n[" + numero + "] es IMPAR");
    }

    sc.close();
  }
}