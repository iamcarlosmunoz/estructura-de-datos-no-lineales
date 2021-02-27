import java.util.Scanner;

/**
 * Leer un número entero y calcular el número invertido. Ej1. Si n= 614275, el
 * invertido es 572416. Ej2. Si n = 9518 el invertido es: 8159
 */

public class ejercicio_05 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Entrada
    int number = 0;

    // Salida
    int reversed = 0;

    System.out.print("\nIngrese número entero: ");
    number = sc.nextInt();

    while (number != 0) {
      int digit = number % 10;
      reversed = reversed * 10 + digit;
      number /= 10;
    }

    System.out.println("\nResultado = " + reversed);

    sc.close();
  }
}
