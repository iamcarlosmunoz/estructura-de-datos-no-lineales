import java.util.Scanner;

/**
 * Leer un número entero (n) y calcular la sumatoria: 1 – 1/3 + 1/5 – 1/7 + ....
 * 1/n Hasta dicho número.
 */

public class ejercicio_03 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Entrada
    int number = 0;

    // Salida
    boolean sign = true; // true = signo positivo; false = signo negativo
    float summation = 0;

    System.out.print("\nIngrese número entero: ");
    number = sc.nextInt();

    for (int i = 1; i <= number; i++) {
      if (sign) {
        summation += 1f / i;
      } else {
        summation -= 1f / i;
      }
      sign = !sign;
    }

    System.out.println("\nSumatoria = " + summation);

    sc.close();

  }
}
