import java.util.Scanner;

/**
 * Leer dos números positivos. si son diferentes se debe calcular la diferencia
 * y si son iguales la suma.
 */

class ejercicio_05 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int primerNumero = 0;
    int segundoNumero = 0;

    System.out.print("\nIngrese PRIMER número positivo = ");
    primerNumero = sc.nextInt();

    System.out.print("Ingrese SEGUNDO número positivo = ");
    segundoNumero = sc.nextInt();

    if (primerNumero == segundoNumero) {
      int suma = primerNumero + segundoNumero;
      System.out.println("\n1. " + primerNumero + " + " + segundoNumero + " = " + suma);
    } else {
      int resta = primerNumero - segundoNumero;
      System.out.println("\n1. " + primerNumero + " - " + segundoNumero + " = " + resta);
    }

    sc.close();
  }
}