import java.util.Scanner;

/**
 * Calcular la sumatoria 1 + x/2! + x/3! + ... + x/n!. Donde x y n son valores
 * que se leen desde teclado.
 */

public class ejercicio_13 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Entrada
    int x = 0;
    int n = 0;

    // Salida
    float summation = 0;
    int factorial = 1;

    System.out.print("Ingrese x: ");
    x = sc.nextInt();

    System.out.print("Ingrese n: ");
    n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      factorial = 1;
      for (int j = 1; j <= i; j++) {
        factorial *= j;
      }
      summation += x / factorial;
    }

    System.out.println("sumatoria: " + summation);

    sc.close();

  }
}
