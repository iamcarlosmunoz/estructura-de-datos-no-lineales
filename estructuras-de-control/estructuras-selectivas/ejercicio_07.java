import java.util.Scanner;

/**
 * Leer dos numeros e imprimirlos si al menos uno es positivo, en caso contrario
 * imprima "los numero son negativos"
 */

public class ejercicio_07 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int number = 0;
    int numberTwo = 0;

    System.out.print("\nIngrese primer número: ");
    number = sc.nextInt();

    System.out.print("Ingrese segundo número: ");
    numberTwo = sc.nextInt();

    if (number > 0 || numberTwo > 0) {
      System.out.println("\n1. " + number + "\n2. " + numberTwo);
    } else {
      System.out.println("\nLos números son negativos");
    }

    sc.close();

  }
}
