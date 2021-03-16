package recursividad;

import java.util.Scanner;

/**
 * La serie de Fibonacci puede definirse en términos recursivos asi: (1) Fib(1)
 * = 1 ; Fib(0) = 0 (2) Fib(n) = Fib(n-1) + Fib(n-2) si n >= 2. Lea un valor
 * entero que representa el limite de la serie e imprimala hasta el valor
 * limite.
 */

public class ejercicio_13 {

  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    // Entrada
    int maxNumber = 0;

    System.out.print("\nCuántos números quieres en Fibonacci: ");
    maxNumber = sc.nextInt();

    System.out.println();

    for (int i = 0; i < maxNumber; i++) {
      System.out.print(fibonacci(i) + " ");
    }

    System.out.println("\n");

    sc.close();

  }

  public static int fibonacci(int n) {
    if (n == 0)
      return 0;
    else if (n == 1 || n == 2)
      return 1;
    else
      return fibonacci(n - 2) + fibonacci(n - 1);
  }
}
