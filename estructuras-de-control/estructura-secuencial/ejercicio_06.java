
/**
 * Realizar un algoritmo que permita leer una cantidad que representa grados Fahrenheit
 * y los convierta a grados centígrados y viceversa.
 * C = 9/5(F – 32) F = 9/5C + 32
 */

import java.util.Scanner;

public class ejercicio_06 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    float primerValorFahrenheit = 0f;
    float segundoValorCentrigrados = 0f;

    float gradosFahrenheit = 0f;
    float gradosCentrigrados = 0f;

    System.out.print("\nIngrese PRIMER valor en Fahrenheit = ");
    primerValorFahrenheit = sc.nextFloat();

    System.out.print("Ingrese SEGUNDO valor en Centígrados = ");
    segundoValorCentrigrados = sc.nextFloat();

    gradosFahrenheit = (9f / (5f * segundoValorCentrigrados)) + 32;
    gradosCentrigrados = 9f / (5f * (primerValorFahrenheit - 32));

    System.out.println("\n1. " + primerValorFahrenheit + " Fahrenheit a Centígrados = " + gradosCentrigrados);
    System.out.println("2. " + segundoValorCentrigrados + " Centígrados a Fahrenheit = " + gradosFahrenheit);

    sc.close();

  }
}
