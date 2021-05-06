package complejidad;

import java.util.Scanner;

/**
 * Lea un valor y realice la sumatoria par e impar SIMULTANEAMENTE hasta el
 * número leído. Inicie por fuera del ciclo for la suma par y la suma impar
 */
 
public class E06 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int sumatoriaPares = 0; // acumulador pares
    int sumatoriaImpares = 0; // acumulador impares
    int contador; // Contador de instrucciones
    int i; // contador ciclo

    System.out.print("\nIngrese número: ");
    int numero = sc.nextInt();

    for (i = 1, contador = 1; (contador++ != 0 && i <= numero); contador++, i++) {
      contador += 4;
      // SUMATORIA PARES
      if (i % 2 == 0) {
        sumatoriaPares += i;
      }
      // SUMATORIA IMPARES
      if (i % 2 != 0) {
        sumatoriaImpares += i;
      }
    }

    System.out.println("\nSumatoria Total números PARES: " + sumatoriaPares);
    System.out.println("Sumatoria Total números IMPARES: " + sumatoriaImpares);
    System.out.println("Contador Intrucciones: " + contador);

    sc.close();

    // Complejidad Algoritmica
    // 1 + n + 1 + n(2 + 2) + n = 2 + 7n
    // 2 + n + 4n + n
    // = 2 + 6n
  }
}
