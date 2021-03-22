package examenes.primero;

import java.util.Scanner;

/**
 * 1. Realizar un programa que lea un valor entero y cambie el primer digito con
 * el último y viceversa. (Restriccion: No pueden usar arreglos para resolverlo,
 * unicamente estructuras repetitivas)
 */

public class Ejercicio_01 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Entrada
    int number = 0;

    // Salida
    int firstDigit = 0;
    int lastDigit = 0;
    int aux = 0;
    int counter = 0;

    System.out.print("\nIngrese número: ");
    number = aux = sc.nextInt();

    lastDigit = number % 10; // Obtener ultimo digito antiguo NUMERO

    while (aux != 0) {
      firstDigit = aux % 10;
      aux /= 10;
      counter++;
    }

    number = (number - ((int) Math.pow(10, counter - 1) * firstDigit)) - lastDigit;
    number = ((int) Math.pow(10, counter - 1) * lastDigit) + number + firstDigit; // Resultado final

    System.out.println("\nResultado: " + number + "\n");

    sc.close();

  }
}