
/**
 * Diseñe un algoritmo que intercambie la cifra de las unidades de dos números
 * naturales de n cifras. Ej. Si un número es 3542 y el otro 654, los números
 * deben quedar así: 3544 y el otro 652.
 */

import java.util.Scanner;

public class ejercicio_10 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int primerNumero = 0;
    int segundoNumero = 0;
    int auxiliar = 0;
    int auxiliarDos = 0;

    System.out.print("\nIngrese primer numero = ");
    primerNumero = sc.nextInt();

    System.out.print("Ingrese segundo numero = ");
    segundoNumero = sc.nextInt();

    auxiliar = primerNumero % 10;
    auxiliarDos = segundoNumero % 10;

    primerNumero = (primerNumero - auxiliar) + auxiliarDos;
    segundoNumero = (segundoNumero - auxiliarDos) + auxiliar;

    System.out.println("\n1. Primer número = " + primerNumero);
    System.out.println("2. Segundo número = " + segundoNumero);

    sc.close();
  }
}
