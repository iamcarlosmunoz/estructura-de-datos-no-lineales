import java.util.Scanner;

/**
 * Leer un número entero n y calcular la sumatoria: 1! + 2! + 3! ... + n!
 */

public class ejercicio_12 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Entrada
    int number = 0;

    // Salida
    int factorial = 1;
    int summation = 0;

    System.out.print("\nIngrese número entero: ");
    number = sc.nextInt();

    for (int i = 1; i <= number; i++) {
      factorial = 1;
      for (int j = 1; j <= i; j++)
        factorial = factorial * j;
      summation += factorial;
    }

    System.out.println("\nSumatoria = " + summation);

    sc.close();

  }
}
