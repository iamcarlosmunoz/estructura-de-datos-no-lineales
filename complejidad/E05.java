package complejidad;

import java.util.Scanner;

/**
 * Leer un número y calcular la sumatoria de números pares hasta el número
 * leído. (Inicie la suma en 0, por fuera del ciclo).
 */
public class E05 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int sumatoria = 0; // acumulador
    int contador; // Contador de instrucciones
    int i; // contador ciclo

    System.out.print("\nIngrese número: ");
    int numero = sc.nextInt();

    for (i = 2, contador = 1; (contador++ != 0 && i <= numero); contador++, i += 2) {
      contador++;
      sumatoria += i;
    }

    System.out.println("\nSumatoria Total: " + sumatoria);
    System.out.println("Contador Intrucciones: " + contador);

    sc.close();

    // Complejidad Algoritmica
    // 1 + n/2 + 1 + n/2(1) + n/2
    // = 2 + 3n/2
  }

}
