import java.util.Scanner;

/**
 * leer dos números diferentes y encontrar el mayor y el menor.
 */

public class ejercicio_10 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int number = 0;
    int numberTwo = 0;

    System.out.print("\nIngrese primer número = ");
    number = sc.nextInt();

    System.out.print("Ingrese segundo número = ");
    numberTwo = sc.nextInt();

    if (number > numberTwo) {
      System.out.println("\n1. Mayor = " + number + "\n2. Menor = " + numberTwo);
    } else if (numberTwo > number) {
      System.out.println("\n1. Mayor = " + numberTwo + "\n2. Menor = " + number);
    } else {
      System.out.println("\nLos número son iguales.");
    }
    sc.close();
  }
}
