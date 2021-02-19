import java.util.Scanner;

/**
 * Leer un número positivo y calcular su raiz cuadrada. si es negativo imprima
 * el mensaje "NO TIENE SOLUCION REAL".
 */
public class ejercicio_06 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    float numero = 0f;

    System.out.print("\nIngrese número positivo = ");
    numero = sc.nextFloat();

    if (numero < 0) {
      System.out.println("\nNO TIENE SOLUCION REAL");
    } else {
      float raizCuadrada = (float) Math.sqrt(numero);
      System.out.println("\n √" + numero + " = " + raizCuadrada);
    }

    sc.close();
  }
}
