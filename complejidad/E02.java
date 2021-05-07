package complejidad;

import java.util.Scanner;

/**
 * Igual al anterior pero ahora imprima el valor que toma la variable i, en cada
 * iteración, como única instrucción dentro del ciclo. .(for básico con una
 * única sentencia dentro del ciclo)
 */
 
public class E02 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int contador; // Contador de instrucciones
    int index;

    System.out.print("\nIngrese valor de n: ");
    int n = sc.nextInt();

    for (index = 0, contador = 1; (contador++ != 0 && index < n); contador++, index++) {
      contador++;
      System.out.println("index = " + index);
    }

    System.out.println("\nNúmero total de instruciones = " + contador);

    sc.close();

    // Complejidad Algoritmica
    // 1 + n + 1 + n(1) + n
    // = 2 + 3n
  }
}
