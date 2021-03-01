import java.util.Scanner;

/**
 * Leer dos números enteros y calcular la multiplicación entera entre los
 * números, sin usar el operador (*).
 */

public class ejercicio_07 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Entrada
    int multiplicand = 0;
    int multiplier = 0;

    // Salida
    int product = 0;

    System.out.print("\nIngrese multiplicando: ");
    multiplicand = sc.nextInt();

    System.out.print("Ingrese multiplicador: ");
    multiplier = sc.nextInt();

    while (multiplier > 0) {
      multiplier--;
      product += multiplicand;
    }

    System.out.println("\nProducto = " + product);

    sc.close();
  }
}
