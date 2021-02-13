import java.util.Scanner;

/**
 * Leer una cantidad que representa los segundos y convertirla en horas, minutos
 * y segundos. Ejemplo. Si lee 3700 seg, entonces se convierte en 1 hora 1
 * minuto y 40 segundos.
 */

public class ejercicio_11 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int entrada = 0;
    int horas = 0;
    int minutos = 0;
    int segundos = 0;

    System.out.print("\nIngrese valor en SEGUNDOS = ");
    entrada = sc.nextInt();

    horas = entrada / 3600;
    minutos = (entrada - (horas * 3600)) / 60;
    segundos = entrada - (horas * 3600 + minutos * 60);

    System.out.println("\n1. Horas = " + horas);
    System.out.println("2. Minutos = " + minutos);
    System.out.println("3. Segundos = " + segundos);

    sc.close();
  }
}
