import java.util.Scanner;

/**
 * Calcular el area de un triangulo. Si el triagulo es rectangulo use la formula
 * => area = (base * altura)/2 sino use la formula que calula el area en funcion
 * de los lados => area = raiz_cuadrada(s*(s-a)*(s-b)*(s-c)) donde s=(a+b+c)/2.
 */

public class ejercicio_11_01 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // variables entrada
    int option = 0; // default triangulo rectangulo
    float base = 0f;
    float altura = 0f;
    float ladoA = 0f;
    float ladoB = 0f;
    float ladoC = 0f;

    // variables salida
    float s = 0f;
    float area = 0f;

    System.out.println("\n::::::::::::: MENU :::::::::::::::");
    System.out.println("ingrese [0] para triangulo rectangulo");
    System.out.println("ingrese [1] para calcular area en funcion de los lados");
    System.out.print("\nIngrese opción: ");
    option = sc.nextInt();

    switch (option) {
      case 0:

        System.out.print("\nIngrese base: ");
        base = sc.nextFloat();

        System.out.print("Ingrese altura: ");
        altura = sc.nextFloat();

        area = (base * altura) / 2f;

        System.out.println("\nArea = " + area);

        break;
      case 1:

        System.out.print("\nIngrese valor lado A: ");
        ladoA = sc.nextFloat();

        System.out.print("Ingrese valor lado B: ");
        ladoB = sc.nextFloat();

        System.out.print("Ingrese valor lado C: ");
        ladoC = sc.nextFloat();

        s = (ladoA + ladoB + ladoC) / 2f;
        area = (float) Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));

        System.out.println("\nArea = " + area);

        break;
      default:
        System.out.println("\nOpcion no valida...");
    }

    sc.close();

  }
}
