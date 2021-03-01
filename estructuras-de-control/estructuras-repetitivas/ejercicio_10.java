import java.util.Scanner;

/**
 * Leer un número n y calcular todos los numeros factoriales hasta dicho número.
 */

public class ejercicio_10 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Entrada
    int number = 0;

    // Salida
    int factorial = 1;

    System.out.print("Ingrese el número: ");
    number = sc.nextInt();

    for (int i = 1; i <= number; i++) {
      factorial = 1;
      for (int j = 1; j <= i; j++)
        factorial = factorial * j;
      System.out.println(i + "! = " + factorial);
    }

    sc.close();

  }
}
