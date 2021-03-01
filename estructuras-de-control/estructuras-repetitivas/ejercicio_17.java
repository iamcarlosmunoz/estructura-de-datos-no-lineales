import java.util.Scanner;

/**
 * Si se suman los números impares se obtienen los cuadrados asi: 1= 1*1=1 1+3 =
 * 2*2 = 4 1+3+5 = 3*3 = 9 Usando este principio realice un algoritmo para
 * escribir los cuadrados de los n primeros números naturales.
 */

public class ejercicio_17 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Entrada
    int number = 0;

    // Salida
    int squares = 0;

    for (int i = 1, odd = 1; i <= 10; i++, odd += 2) {
      number += odd;
      squares = (odd / 2) + 1;
      System.out.println(squares + " * " + squares + " = " + (number));
    }

    sc.close();
  }
}
