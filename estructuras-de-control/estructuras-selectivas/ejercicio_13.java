import java.util.Scanner;

/**
 * Leer un carácter y determinar si es una vocal mayuscula o minuscula, si no es
 * una vocal imprima el mensaje correspondiente.
 */

public class ejercicio_13 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    char caracter = ' ';

    System.out.print("\nIngrese carácter: ");
    caracter = sc.nextLine().charAt(0);

    if (caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U') {
      System.out.println("\nEs una vocal mayuscula");
    } else if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
      System.out.println("\nEs una vocal minuscula");
    } else {
      System.out.println("\nNo es una vocal");
    }

    sc.close();

  }
}
