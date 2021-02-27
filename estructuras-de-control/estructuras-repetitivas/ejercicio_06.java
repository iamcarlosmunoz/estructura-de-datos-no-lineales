import java.util.Scanner;

/**
 * Leer dos número enteros y calcular la división entera y el residuo entre los
 * numeros, en una funcion sin usar los operadores "/" ni "%".
 */

public class ejercicio_06 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Entrada
    int dividend = 0;
    int divisor = 0;

    // Salida
    int quotient = 0;

    System.out.print("\nIngrese dividendo: ");
    dividend = sc.nextInt();

    System.out.print("Ingrese divisor: ");
    divisor = sc.nextInt();

    while (dividend > 0) {
      quotient++;
      dividend -= divisor;
    }

    System.out.println("\nCociente = " + quotient);
    System.out.println("Residuo = " + -dividend);

    sc.close();
  }
}
