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

    for (i = 1, contador = 1; (contador++ != 0 && i <= numero); contador++, i++) {
      contador += 2;
      if (i % 2 == 0) {
        sumatoria += i;
      }
    }

    System.out.println("\nSumatoria Total: " + sumatoria);
    System.out.println("Contador Intrucciones: " + contador);

    // Complejidad Algoritmica
    // 1 + n + 1 + n(2) + n = 2 + 4n
  }

}
