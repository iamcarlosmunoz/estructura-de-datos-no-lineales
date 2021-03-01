import java.util.Scanner;

/**
 * Leer un número entero positivo y calcular la suma de todos los digitos que
 * componen el número. Ej Si n= 3524 La salida será: La suma de dígitos es:14
 */

public class ejercicio_14 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Entrada
    int number = 0;

    // Salida
    int sum = 0;
    int temp = 0;

    System.out.print("\nIngrese el numero: ");
    number = sc.nextInt();

    while (number > 0) {
      temp = number % 10;
      sum += temp;
      number /= 10;
    }

    System.out.println("\nResulta = " + sum);

    sc.close();

  }
}
