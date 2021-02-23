import java.util.Scanner;

/**
 * Resolver la ecuacion de primer grado: ax + b = 0
 */

public class ejercicio_14 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Variables Entrada
    float a = 0f;
    float b = 0f;

    // Variables Salida
    float x = 0f;

    System.out.print("\nIngrese a: ");
    a = sc.nextFloat();

    System.out.print("Ingrese b: ");
    b = sc.nextFloat();

    System.out.println("\nEcuación: " + a + "(x)" + " + " + b + " = 0");

    if (a != 0) {
      x = -b / a;
      System.out.println("\nSolución de la ecuacion: x = " + x);
    } else if (b != 0) {
      System.out.println("\nSolución imposible");
    } else {
      System.out.println("\nSolución indeterminada");
    }

    sc.close();
  }
}
