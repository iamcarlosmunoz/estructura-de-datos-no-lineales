
/**
 * Leer el nombre, la edad, y el estado civil (0 = SOLTERO / 1 = CASADO) de una persona.
 * Imprima el nombre de la persona seguido del texto soltero y mayor de edad
 * solo si cumple com las condiciones correspondientes.
 */

import java.util.Scanner;

public class ejercicio_01 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String nombre = "";
    int edad = 0;
    int estadoCivil = 0;

    System.out.print("\nIngrese nombre = ");
    nombre = sc.next();

    System.out.print("Ingrese edad = ");
    edad = sc.nextInt();

    System.out.print("Ingrese estado civil [0 = SOLTERO / 1 = CASADO] = ");
    estadoCivil = sc.nextInt();

    if (edad >= 18 && estadoCivil == 0)
      System.out.println("\n" + nombre + " es SOLTERO y mayor de edad");

    sc.close();
  }
}
