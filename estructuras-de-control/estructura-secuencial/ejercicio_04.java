
/**
 * Diseñe un algoritmo que encuentre las cifras de un número entero positivo de
 * 4 cifras en unidades, decenas, centenas y unidades de mil.
 */

import java.util.Scanner;

public class ejercicio_04 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int numero = 0;
    int unidades = 0;
    int decenas = 0;
    int centenas = 0;
    int unidadesDeMil = 0;

    System.out.print("\nIngrese número ENTERO de 4 cifras = ");
    numero = sc.nextInt();

    unidadesDeMil = numero / 1000;
    centenas = (numero - (unidadesDeMil * 1000)) / 100;
    decenas = (numero - (unidadesDeMil * 1000 + centenas * 100)) / 10;
    unidades = numero - (unidadesDeMil * 1000 + centenas * 100 + decenas * 10);

    System.out.println("\n1. Unidades de Mil = " + unidadesDeMil);
    System.out.println("2. Centenas = " + centenas);
    System.out.println("3. Decenas = " + decenas);
    System.out.println("4. Unidades = " + unidades);

    sc.close();
  }
}
