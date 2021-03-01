import java.util.Scanner;

/**
 * Leer un número entero n y calcular todos los números primos hasta dicho
 * número.
 */

public class ejercicio_11 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Entrada
    int number = 0;

    // Salida
    int primeNumber = 0;
    int counter = 0;

    System.out.print("Ingrese el numero entero: ");
    number = sc.nextInt();

    for (int i = 1; i <= number; i++) {
      primeNumber = 0;
      for (int j = 1; j <= i; j++) {
        if (i % j == 0) {
          primeNumber++;
        }
      }
      if (primeNumber == 2) {
        System.out.println(i + " es numero primo");
        counter++;
      }
    }

    if (counter == 0) {
      System.out.println("NO se encontraron numeros primos");
    }

    sc.close();

  }
}
