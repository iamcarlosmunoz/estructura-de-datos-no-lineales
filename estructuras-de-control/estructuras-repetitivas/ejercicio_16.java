import java.util.Scanner;

/**
 * Calcular la serie de Fibonacci hasta un número n positivo que se lee desde el
 * teclado. La serie debe iniciar asi: 0 1 1 2 3 5 8 13 21 ... n.
 */

public class ejercicio_16 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Entrada
    int number = 0;

    // Salida
    int temp = 0;
    int temp2 = 1;

    System.out.print("\nIngrese número entero: ");
    number = sc.nextInt();

    for (int i = 1; i <= number; ++i) {
      System.out.print(temp + " ");

      int sum = temp + temp2;
      temp = temp2;
      temp2 = sum;
    }

    sc.close();

  }
}
