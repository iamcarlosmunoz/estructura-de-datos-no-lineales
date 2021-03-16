package recursividad;

import java.util.Scanner;

/**
 * Leer dos números enteros y calcular el máximo común divisor(M.C.D. ),de dos
 * números enteros (M,N) utilizando el algoritmo de Euclides. Si M >= N una
 * función recursiva para MCD es MCD = M si N =0 MCD = MCD (N, M % N) si N <> 0
 */

public class ejercicio_08 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Entrada
    int m = 0;
    int n = 0;

    // Salida
    int mcdNumber = 0;

    System.out.print("\nIngrese número m: ");
    m = sc.nextInt();

    System.out.print("Ingrese número n: ");
    n = sc.nextInt();

    mcdNumber = mcd(m, n);

    System.out.println("\nMCD = " + mcdNumber + "\n");

    sc.close();
  }

  public static int mcd(int m, int n) {
    if (n == 0)
      return m;
    else
      return mcd(n, m % n);
  }
}
