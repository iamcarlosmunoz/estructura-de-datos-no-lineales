
/**
 * Ejercicio 01:
 * Diseñe un algoritmo que halle el área y el perímetro de un rectángulo.
 * Considere área = base x altura y el perímetro = 2 x (base+altura)
 */

import java.util.Scanner;

public class ejercicio_01 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    float base = 0.0f;
    float altura = 0.0f;
    float area = 0.0f;
    float perimetro = 0.0f;

    System.out.print("Ingrese área: ");
    base = sc.nextFloat();

    System.out.print("Ingrese altura: ");
    altura = sc.nextFloat();

    area = base * altura;
    perimetro = 2 * (base + altura);

    System.out.println("\nRESULTADOS");
    System.out.println("1. Área = " + area);
    System.out.println("2. Perímetro = " + perimetro);

    sc.close();
  }

}
