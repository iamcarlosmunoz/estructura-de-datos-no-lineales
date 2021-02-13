import java.util.Scanner;

/**
 * Diseñe un algoritmo que exprese la capacidad de un disco duro en megabytes,
 * kilobytes y bytes, conociendo la capacidad del disco en gigabytes. Considere
 * que: 1 kilobyte = 1024 bytes, 1 megabyte = 1024 kilobyte, 1 gigabyte =
 * 1024megabytes
 */
public class ejercicio_08 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    float gigabytes = 0f;
    float megabytes = 0f;
    float kilobytes = 0f;
    float bytes = 0f;

    System.out.print("\nIngrese capacidad en Gigabytes = ");
    gigabytes = sc.nextFloat();

    megabytes = 1024 * gigabytes;
    kilobytes = 1024 * megabytes;
    bytes = 1024 * kilobytes;

    System.out.println("\n1. Megabytes = " + megabytes);
    System.out.println("2. Kilobytes = " + kilobytes);
    System.out.printf("3. Bytes = %.0f", bytes);

    sc.close();
  }
}
