package examenes.primero;

/**
 * Inicialice una matriz con números enteros de tamaño mxn y encuentre el mayor
 * elemento de la matriz. Usando recursividad
 */

public class Ejercicio_02 {

  public static void main(String[] args) {

    // Entrada
    int m[][] = { { 1, 8, 0, 23 }, { 30, 1, 55, 12 }, { 40, 87, 15, 21 } };
    int m2[][] = { { 1, 2, 3 }, { 5, 6, 7, 8 }, { 9, 12, 12 } }; // Nota: no funciona con matrizes irregulares

    // Salida
    int largest = 0;

    largest = largestNumber(m, m.length - 1, m[0].length - 1, 0);

    System.out.println("\nNúmero mayor = " + largest + "\n");

  }

  public static int largestNumber(int m[][], int rows, int columns, int largest) {
    if (rows < 0)
      return largest;
    else if (columns < 0)
      return largestNumber(m, rows - 1, m[0].length - 1, largest);
    else {
      if (m[rows][columns] >= largest) // Comprobacion
        largest = m[rows][columns];
      return largestNumber(m, rows, columns - 1, largest);
    }
  }
}
