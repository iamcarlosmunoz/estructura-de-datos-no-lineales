
/**
 * Diseñe un algoritmo que determine el porcentaje de hombres y mujeres que hay
 * en un salón de clases.
 */

import java.util.Scanner;

public class ejercicio_05 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int numeroHombres = 0;
    int numeroMujeres = 0;

    float porcentajeHombres = 0f;
    float procentajeMujeres = 0f;

    System.out.print("\nIngrese número de Hombres = ");
    numeroHombres = sc.nextInt();

    System.out.print("Ingrese número de Mujeres = ");
    numeroMujeres = sc.nextInt();

    porcentajeHombres = ((float) numeroHombres / (float) (numeroHombres + numeroMujeres)) * 100f;
    procentajeMujeres = 100f - porcentajeHombres;

    System.out.println("\n1. Total de estudiantes = " + (numeroHombres + numeroMujeres));
    System.out.println("2. Porcentaje de Hombres = " + porcentajeHombres + "%");
    System.out.println("3. Porcentaje de Mujeres = " + procentajeMujeres + "%");

    sc.close();
  }
}
