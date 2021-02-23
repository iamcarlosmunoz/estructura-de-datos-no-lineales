import java.util.Scanner;

/**
 * Un vendedor desea conocer su comision total al final del día. Suponga que en
 * el almacen solo hay articulos de tres precios con la siguiente comision:
 * $100.000 (comision 3%) $300.000 (comision 5%) $500.000 (comision 8%)
 */

public class ejercicio_12 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Variables Entrada
    int articuloTipo1 = 0; // $100.000 (comision 3%)
    int articuloTipo2 = 0; // $300.000 (comision 5%)
    int articuloTipo3 = 0; // $500.000 (comision 8%)

    // Variables Salida
    float comision = 0f;

    System.out.print("\nIngrese articulos vendidos con valor ($100.000): ");
    articuloTipo1 = sc.nextInt();

    System.out.print("Ingrese articulos vendidos con valor ($300.000): ");
    articuloTipo2 = sc.nextInt();

    System.out.print("Ingrese articulos vendidos con valor ($500.000): ");
    articuloTipo3 = sc.nextInt();

    if (articuloTipo1 > 0 && articuloTipo2 > 0 && articuloTipo3 > 0) {
      comision = ((articuloTipo1 * 100000) * 3 / 100) + ((articuloTipo2 * 300000) * 5 / 100)
          + ((articuloTipo3 * 500000) * 8 / 100);
      System.out.println("\nComision: " + comision);
    } else {
      System.out.println("\nSin comisiones");
    }

    sc.close();
  }
}