package recursividad;

import java.util.Scanner;

/**
 * Leer un número entero e invertirlo. Ejemplo: Entrada: 123 Salida: 321.
 * Imprima el numero invertido en el programa principal(Se debe invertir en la
 * función y devolver al programa principal)
 */

public class ejercicio_05 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int number;

    System.out.print("\nIngrese el valor: ");
    number = sc.nextInt();

    sc.close();

    System.out.print("\nResultado = " + reverseNumber(number, 0) + "\n");

  }

  public static int reverseNumber(int number, int i) {
    if (number == 0)
      return i;
    else
      return reverseNumber(number / 10, i * 10 + number % 10);
  }
}
