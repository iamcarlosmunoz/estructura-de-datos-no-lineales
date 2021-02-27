import java.util.Scanner;

/**
 * Leer un número entero y calcular la sumatoria hasta dicho número. (∑ = 1 + 2
 * + 3 + … + n)
 */

public class ejercicio_02 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Entrada
    int number = 0;

    // Salida
    int summation = 0;

    System.out.print("\nIngrese número entero: ");
    number = sc.nextInt();

    for (int i = 0; i <= number; i++) {
      summation += i;
    }

    System.out.println("\nSumatoria = " + summation);

    sc.close();

  }
}