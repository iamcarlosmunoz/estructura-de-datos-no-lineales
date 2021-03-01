import java.util.Scanner;

/**
 * Leer un número entero positivo y calcular la sumatoria de todos los digitos
 * que componen el número. Ej Si n= 3524 La salida será: La suma de dígitos es
 * 34.
 */

public class ejercicio_15 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Entrada
    int number = 0;

    // Salida
    int summation = 0;
    int temp = 0;

    System.out.print("\nIngrese número entero: ");
    number = sc.nextInt();

    while (number > 0) {
      temp = number % 10;
      for (int i = 1; i <= temp; i++)
        summation += i;
      number /= 10;
    }

    System.out.println("\nSumatoria = " + summation);

    sc.close();

  }
}
