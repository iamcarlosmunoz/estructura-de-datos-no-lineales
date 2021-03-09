package recursividad;

public class ejercicio_12 {

  public static void main(String[] args) {

    int matriz[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };

    System.out.println("\nSuma = " + sum(matriz, matriz.length - 1, matriz[0].length - 1));

  }

  public static int sum(int matriz[][], int row, int column) {
    if (row < 0)
      return 0;
    else if (column < 0)
      return sum(matriz, row - 1, matriz[0].length - 1);
    else
      return sum(matriz, row, column - 1) + matriz[row][column];
  }
}
