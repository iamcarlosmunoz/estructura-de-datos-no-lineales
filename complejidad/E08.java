package complejidad;

import java.util.Scanner;

/**
 * Leer un número y determinar si es primo.
 */
 
public class E08 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int contadorPrimo = 0;
    int contador; // contador de instrucciones
    int i; // contador ciclo for

    System.out.print("\nIngrese número entero: ");
    int numero = sc.nextInt();

    for (i = 1, contador = 1; (contador++ != 0 && i <= numero); contador++, i++) {
      contador += 2;
      if (numero % i == 0) {
        contadorPrimo++;
      }
    }

    if (contadorPrimo > 2) {
      System.out.println("\nEl número NO es primo.");
    } else {
      System.out.println("\nEl número SI es primo.");
    }
    System.out.println("\nTotal de instrucciones: " + contador);

    sc.close();

    // Complejidad Algoritmica
    // 1 + n + 1 + n(1 + 1) + n
    // 2 + n + 2n + n
    // = 2 + 4n
  }
}
