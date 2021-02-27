import java.util.Scanner;

/**
 * Leer un número entero y calcular el número invertido. Ej1. Si n= 614275, el
 * invertido es 572416. Ej2. Si n = 9518 el invertido es: 8159
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
