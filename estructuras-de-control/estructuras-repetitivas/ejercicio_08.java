import java.util.Scanner;

/**
 * Leer dos números enteros y calcular el maximo comun divisor, usando el metodo
 * de Euclides.
 */

public class ejercicio_08 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Entrada
    int number = 0;
    int numberTwo = 0;

    // Salida
    int temp = 0;

    System.out.print("\nIngrese primer número: ");
    number = sc.nextInt();

    System.out.print("Ingrese segundo número: ");
    numberTwo = sc.nextInt();

    while (numberTwo != 0) {
      temp = numberTwo;
      numberTwo = number % numberTwo;
      number = temp;
    }

    System.out.println("\nMCD = " + number);

    sc.close();

  }
}
