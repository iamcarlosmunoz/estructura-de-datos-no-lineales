import java.util.Scanner;

/**
 * Leer un carácter y determinar si es una vocal mayuscula o minuscula, si no es
 * una vocal imprima el mensaje correspondiente.
 */

public class ejercicio_13_01 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    char caracter = ' ';

    System.out.print("\nIngrese carácter: ");
    caracter = sc.nextLine().charAt(0);

    switch (caracter) {
      case 'A':
      case 'E':
      case 'I':
      case 'O':
      case 'U':
        System.out.println("\nEs una vocal mayuscula");
        break;

      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
        System.out.println("\nEs una vocal minuscula");
        break;

      default:
        System.out.println("\nNo es una vocal");
    }

    sc.close();

  }
}
