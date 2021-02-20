import java.util.Scanner;

/**
 * Leer un carácter alfabetico y determinar si es una letra mayuscula o
 * minuscula.
 */

public class ejercicio_08 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    char letra = ' ';

    System.out.print("\nIngrese carácter alfabetico = ");
    letra = sc.nextLine().charAt(0);

    if (Character.isUpperCase(letra)) {
      System.out.println("\nEs Mayuscula");
    } else {
      System.out.println("\nEs Minuscula");
    }

    sc.close();
  }
}
