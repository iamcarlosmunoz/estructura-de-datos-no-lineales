import java.util.Scanner;

/**
 * Leer la nota final de un estudiante (entre cero y cinco) y determinar si gana
 * o pierde la materia.
 */

public class ejercicio_09 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int nota = 0;

    System.out.print("\nIngrese la nota final = ");
    nota = sc.nextInt();

    if (nota < 3 && nota >= 0) {
      System.out.println("\nPerdio la materia.");
    } else if (nota >= 3 && nota <= 5) {
      System.out.println("\nGano la materia.");
    } else {
      System.out.println("\nNota ingresada no valida.");
    }

    sc.close();
  }
}
