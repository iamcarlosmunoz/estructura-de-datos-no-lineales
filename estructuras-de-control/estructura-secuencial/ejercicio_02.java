
/**
 * Diseñe un algoritmo para convertir una longitud dada en metros a sus equivalentes en
 * centímetros, pies, pulgadas y yardas.
 * Considere que: 1 metro = 100 centímetros; 1 pulgada = 2.54 centímetros; 1 pie = 12 pulgadas; 1 yarda = 3 pies
 */

import java.util.Scanner;

public class ejercicio_02 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    float metros = 0.0f; // dato entrada
    float centimetros = 0.0f;
    float pies = 0.0f;
    float pulgadas = 0.0f;
    float yardas = 0.0f;

    System.out.print("Ingrese valor en metros: ");
    metros = sc.nextFloat();

    centimetros = metros * 100;
    pulgadas = centimetros / 2.54f;
    pies = pulgadas / 12;
    yardas = pies / 3;

    System.out.println("1. valor en centimetros = " + centimetros);
    System.out.println("2. valor en pulgadas = " + pulgadas);
    System.out.println("3. valor en pies = " + pies);
    System.out.println("4. valor en yardas = " + yardas);

    sc.close();
  }
}
