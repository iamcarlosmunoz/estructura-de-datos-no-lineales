package complejidad;

import java.util.Scanner;

/**
 * Para un ciclo for anidado básico: lea el valor de n para conocer el número
 * total de instrucciones que se deben realizar. Imprima el numero de
 * instrucciones que se van ejecutando, como la única sentencia dentro del ciclo
 * for mas interno.
 */
 
public class E03 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int contador; // Contador de instrucciones
    int indexE; // Indice Externo
    int indexI; // Indice Interior

    System.out.print("\nIngrese valor de n: ");
    int n = sc.nextInt();

    for (indexE = 0, contador = 1; (contador++ != 0 && indexE < n); contador++, indexE++) {
      for (indexI = 0, contador++; (contador++ != 0 && indexI < n); contador++, indexI++) {
        contador++;
        System.out.println("contador = " + contador);
      }
    }

    System.out.println("\nNúmero total de instruciones = " + contador);

    // Complejidad Algoritmica
    // >>> For interno
    // 1 + n + 1 + n(1) + n = 2 + 3n
    // >>> For externo (Total)
    // 1 + n + 1 + n( 2 + 3n ) + n = 3n² + 4n + 2
  }
}
