package examenes.segundo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 3. Inicialice aleatoriamente(usando random entre 1 y 500) un arreglo de
 * tamaño n (ingresado por el usuario) y ordénelo ascendentemente, usando
 * cualquiera de los método de ordenamiento. Adicionalmente solicite un valor
 * entero para buscarlo en el arreglo usando búsqueda binaria. Si lo encuentra,
 * imprima en que numero de intento lo encontró, de lo contrario imprima el
 * mensaje correspondiente.
 */
public class E03 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("\nIngrese limite del vector: ");
    int limite = sc.nextInt();

    // Inicializar vector
    int vector[] = generarVector(limite);

    // Imprimir vector Desordenado
    System.out.println("\nVector Desordenado:");
    for (int numero : vector) {
      System.out.print(numero + " ");
    }
    System.out.println();

    // Ordenar vector
    Arrays.sort(vector);
    System.out.println("\nVector Ordenado:");
    for (int numero : vector) {
      System.out.print(numero + " ");
    }
    System.out.println();

    // Ingresar numero
    System.out.print("\nIngrese número a buscar: ");
    int numero = sc.nextInt();

    // Evaluar busqueda
    int intentos = busquedaBinaria(vector, numero);
    if (intentos == -1) {
      System.out.println("El número no esta en el vector");
    } else {
      System.out.println("El número se ENCONTRO en " + intentos + " intentos.");
    }

    sc.close();

  }

  private static int busquedaBinaria(int vector[], int numero) {

    int posInicial = 0;
    int posFinal = vector.length - 1;
    int intentos = 1;

    while (posInicial <= posFinal) {
      int mitad = posInicial + posFinal / 2;
      if (vector[mitad] == numero) {
        return intentos;
      }
      if (vector[mitad] < numero) {
        posInicial = mitad + 1;
      } else {
        posFinal = mitad - 1;
      }
      intentos++;
    }
    return -1;
  }

  private static int[] generarVector(int limite) {
    Random random = new Random();
    int vector[] = new int[limite];
    for (int index = 0; index < limite; index++) {
      int randomInt = random.nextInt(500) + 1;
      vector[index] = randomInt;
    }
    return vector;
  }
}
