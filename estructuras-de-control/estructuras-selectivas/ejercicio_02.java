
/**
 * Leer dos numeros y calcular la suma y la multiplicación, solo si los números
 * son diferentes.
 */

import java.util.Scanner;

public class ejercicio_02 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int numero = 0;
    int numeroDos = 0;

    System.out.print("\nIngrese primer número = ");
    numero = sc.nextInt();
    System.out.print("Ingrese segundo número = ");
    numeroDos = sc.nextInt();

    if (numero != numeroDos) {
      int suma = 0;
      int multiplicacion = 0;

      suma = numero + numeroDos;
      multiplicacion = numero * numeroDos;

      System.out.println("\n1. " + numero + " + " + numeroDos + " = " + suma);
      System.out.println("2. " + numero + " x " + numeroDos + " = " + multiplicacion);
    } else {
      System.out.println("\nLos número son iguales.");
    }

    sc.close();
  }
}
