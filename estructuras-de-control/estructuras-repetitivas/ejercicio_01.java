import java.util.Scanner;

/**
 * Leer un número entero y calcular su factorial.
 */

public class ejercicio_01 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Variables Entrada
    int number = 0;

    // Variables Salida
    int factorial = 1;

    System.out.print("\nIngrese número: ");
    number = sc.nextInt();

    for (int i = 1; i <= number; i++) {
      factorial *= i;
    }

    System.out.println("\nFactorial de " + number + " = " + factorial);

    sc.close();

  }
}
