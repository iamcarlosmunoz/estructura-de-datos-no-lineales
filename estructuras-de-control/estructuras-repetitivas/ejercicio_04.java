import java.util.Scanner;

/**
 * Leer un número entero y calcular si es primo o no.
 */

public class ejercicio_04 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Entrada
    int number = 0;

    // Salida
    int counter = 0;

    System.out.print("\nIngrese número entero: ");
    number = sc.nextInt();

    for (int i = 1; i <= number; i++) {
      if (number % i == 0)
        counter++;
    }

    if (counter > 2)
      System.out.println("\nEl número NO es primo.");
    else
      System.out.println("\nEl número SI es primo.");

    sc.close();

  }
}
