import java.util.Scanner;

/**
 * Leer la nota final de un estudiante (entre cero y cinco) y determinar si gana
 * o pierde la materia.
 */

public class ejercicio_09_01 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int nota = 0;

    System.out.print("\nIngrese la nota final = ");
    nota = sc.nextInt();

    switch (nota) {
      case 0:
      case 1:
      case 2:
        System.out.println("\nPerdio la materia.");
        break;
      case 3:
      case 4:
      case 5:
        System.out.println("\nGano la materia.");
        break;
      default:
        System.out.println("\nNota ingresada no valida.");
    }

    sc.close();
  }
}
