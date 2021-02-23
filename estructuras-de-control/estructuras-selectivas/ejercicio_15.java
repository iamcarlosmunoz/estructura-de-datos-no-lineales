import java.util.Scanner;

/**
 * Resolver la ecuacion de segundo grado: ax² + bx + c = 0. sugerencia use la
 * formula cuadratica para resolverla.
 */

public class ejercicio_15 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Variables Entrada
    float a = 0f;
    float b = 0f;
    float c = 0f;

    // Variables Salida
    float x1 = 0f;
    float x2 = 0f;

    System.out.print("\nIngrese a: ");
    a = sc.nextFloat();

    System.out.print("Ingrese b: ");
    b = sc.nextFloat();

    System.out.print("Ingrese c: ");
    c = sc.nextFloat();

    System.out.println("\nEcuación: " + a + "(x²)" + " + " + b + "(x) + " + c + " = 0");

    if (a != 0) {
      x1 = (float) (-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
      x2 = (float) (-b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
      System.out.println("\nSolución de la ecuacion:\nx1 = " + x1 + "\nx2 = " + x2);
    } else if (b != 0) {
      System.out.println("\nSolución imposible");
    } else {
      System.out.println("\nSolución indeterminada");
    }

    sc.close();
  }
}
