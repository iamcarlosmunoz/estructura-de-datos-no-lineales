package dv;

import java.util.Scanner;

/**
 * Realice un programa que adivine un número un número entre 1 y un límite que
 * debe ser ingresado por el usuario. (Use búsqueda binaria)
 */
 
public class E02 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    boolean bandera = false;
    int posInicial;
    int posFinal;
    int mitad;
    int numeroMax;
    int numeroIntentos;
    int listaNumeros[];

    // Ingresar limite
    System.out.print("\nIngrese el valor limite: ");
    numeroMax = sc.nextInt();

    // Valores iniciales
    numeroIntentos = (int) Math.round(Math.log10(numeroMax) / Math.log10(2));
    listaNumeros = generarVector(numeroMax);
    posInicial = 0;
    posFinal = listaNumeros.length - 1;

    // Imprimir limite establecido
    System.out.println("1 al " + listaNumeros.length);
    System.out.println("Maximo número de intentos: " + numeroIntentos);

    // ciclo principal
    do {
      // Calcular mitad
      mitad = posInicial + posFinal / 2;

      // Imprimir menu
      System.out.println("\nEl número que usted penso es " + listaNumeros[mitad] + "?");
      System.out.println(">>>  Si es BAJO ingrese [1].");
      System.out.println(">>>  Si es ALTO ingrese [2].");
      System.out.println(">>>  Si " + listaNumeros[mitad] + " es el número CORRECTO ingrese [0].");
      System.out.print("Ingrese opción: ");
      int opcion = sc.nextInt();

      // validar opción ingresada
      if (opcion == 1) {
        posInicial = mitad - 1;
        numeroIntentos--;
      } else if (opcion == 2) {
        posFinal = mitad + 1;
        numeroIntentos--;
      } else if (opcion == 0) {
        bandera = true;
      }

    } while (numeroIntentos > 0 && !bandera);

    System.out.println("\nEl número encontrado es " + listaNumeros[mitad]);
    System.out.println("Numero de intentos restantes: " + numeroIntentos + " de " + (int) Math.round(Math.log10(numeroMax) / Math.log10(2)));
    System.out.println("Fin del juego");

    sc.close();
  }

  private static int[] generarVector(int numeroMax) {
    int vector[] = new int[numeroMax];
    for (int index = 0; index < numeroMax; index++) {
      vector[index] = index + 1;
    }
    return vector;
  }
}
