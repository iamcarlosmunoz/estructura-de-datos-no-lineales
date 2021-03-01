import java.util.Scanner;

/**
 * Leer dos números enteros, el primero llamado base y el segundo exponente.
 * Calcular el resultado de elevar la base al exponente sin usar el operador de
 * exponenciación. Ejs. 2**3 = 8 ; 2**-3= 1/8, 2**0=1; etc
 */

public class ejercicio_09 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Entrada
    int exponent = 0;
    int base = 0;

    // Salida
    float result = 1;

    System.out.print("Ingrese base: ");
    base = sc.nextInt();

    System.out.print("Ingrese exponente: ");
    exponent = sc.nextInt();

    int absExponent = exponent > 0 ? exponent : (-1) * exponent;

    for (int i = 1; i <= absExponent; i++) {
      result *= base;
    }

    if (exponent < 0) {
      result = 1f / result;
    }

    System.out.println("resultado = " + result);

    sc.close();
  }
}
