package complejidad;

import java.util.Scanner;

/**
 * Para un ciclo for básico: lea el valor de n para conocer el número de
 * instrucciones que se deben realizar. Suponga que no hay ninguna instrucción
 * que se ejecute dentro del ciclo. (for básico con sentencia vacía!)
 */
public class E01 {

  @SuppressWarnings("empty-statement")
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int contador; // Contador de instrucciones
    int index;

    System.out.print("\nIngrese valor de n: ");
    int n = sc.nextInt();

    for (index = 0, contador = 1; (contador++ != 0 && index < n); contador++, index++);

    System.out.println("\nNúmero total de instruciones = " + contador);

    // Complejidad Algoritmica
    // 1 + n + 1 + n = 2 + 2n
  }
}
