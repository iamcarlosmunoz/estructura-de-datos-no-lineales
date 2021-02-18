
/**
 * Leer 2 valores enteros e intercambiar su valor. Sugerencia: use una variable
 * auxiliar. Ej. Si al inicio los valores son: n1 = 20 y n2 = 50 al final deben
 * quedar así n1= 50 y n2 = 20.
 */

import java.util.Scanner;

public class ejercicio_07 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int primerNumero = 0;
    int segundoNumero = 0;
    int auxiliar = 0;

    System.out.print("\nIngrese primer número ENTERO = ");
    primerNumero = sc.nextInt();

    System.out.print("Ingrese segundo número ENTERO = ");
    segundoNumero = sc.nextInt();

    auxiliar = primerNumero;
    primerNumero = segundoNumero;
    segundoNumero = auxiliar;

    System.out.println("\n1. Primer número = " + primerNumero);
    System.out.println("2. Segundo número = " + segundoNumero);

    sc.close();
  }
}
