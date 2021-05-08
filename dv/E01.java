package dv;

import java.util.Scanner;

/**
 * Realice un programa que adivine un número un número entre 1 y 100. (Use
 * búsqueda binaria)
 */
 
public class E01 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    boolean bandera = false;
    int posInicial;
    int posFinal;
    int mitad;
    int intentos = 0; // contador
    int listaNumeros[] = generarVector(100);

    // Valores iniciales
    posInicial = 0;
    posFinal = listaNumeros.length - 1;

    // ciclo principal
    do {
      // Calcular mitad y aumentar contador de intentos
      mitad = (posInicial + posFinal) / 2;
      intentos++;

      // Imprimir menu
      System.out.println("\nIntento N°" + intentos);
      System.out.println("El número que usted penso es " + listaNumeros[mitad] + "?");
      System.out.println(">>>  Si es BAJO ingrese [1].");
      System.out.println(">>>  Si es ALTO ingrese [2].");
      System.out.println(">>>  Si " + listaNumeros[mitad] + " es el número CORRECTO ingrese [0].");
      System.out.print("Ingrese opción: ");
      int opcion = sc.nextInt();

      // validar opción ingresada
      switch (opcion) {
        case 1:
          posInicial = mitad + 1;
          break;
        case 2:
          posFinal = mitad - 1;
          break;
        case 0:
          bandera = true;
          break;
        default:
          intentos--;
          System.out.println("\nOpción NO Valida vuelve a intentar: (No se contara el intento)");
      }

    } while (intentos < 7 && !bandera);

    System.out.println("\nEl número encontrado es " + listaNumeros[mitad]);
    System.out.println("Numero de intentos restantes: " + (intentos - 7) + " de 7 ");
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
