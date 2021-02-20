import java.util.Scanner;

/** Leer tres números y ordenarlos de mayor a menor. */

public class ejercicio_16 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int numberOne = 0;
    int numberTwo = 0;
    int numberThree = 0;

    System.out.print("\nIngrese primer número = ");
    numberOne = sc.nextInt();

    System.out.print("Ingrese segundo número = ");
    numberTwo = sc.nextInt();

    System.out.print("Ingrese tercer número = ");
    numberThree = sc.nextInt();

    if (numberOne > numberTwo && numberOne > numberThree && numberTwo > numberThree) {
      System.out.println("\n " + numberOne + ", " + numberTwo + ", " + numberThree);
    } else if (numberOne > numberTwo && numberOne > numberThree && numberTwo < numberThree) { // Variante
      System.out.println("\n " + numberOne + ", " + numberTwo + ", " + numberThree);
    } else if (numberTwo > numberOne && numberTwo > numberThree && numberOne > numberThree) {
      System.out.println("\n " + numberTwo + ", " + numberOne + ", " + numberThree);
    } else if (numberTwo > numberOne && numberTwo > numberThree && numberOne < numberThree) { // Variante
      System.out.println("\n " + numberTwo + ", " + numberThree + ", " + numberOne);
    } else if (numberThree > numberOne && numberThree > numberTwo && numberOne > numberTwo) {
      System.out.println("\n " + numberThree + ", " + numberOne + ", " + numberTwo);
    } else if (numberThree > numberOne && numberThree > numberTwo && numberOne < numberTwo) { // Variante
      System.out.println("\n " + numberThree + ", " + numberOne + ", " + numberTwo);
    }

    sc.close();
  }
}
