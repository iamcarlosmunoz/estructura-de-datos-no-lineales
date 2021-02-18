
/**
 * El sueldo neto de un vendedor se calcula como la suma de un sueldo básico de
 * 480.000 más el 12% del monto total vendido. Diseñe un algoritmo que determine
 * el sueldo neto de un vendedor sabiendo que hizo tres ventas en el mes.
 */

import java.util.Scanner;

public class ejercicio_09 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    float sueldo = 480000f;
    float sueldoNeto = 0f;
    float porcentaje = 12f;
    float comisionPorVentas = 0f;
    float primeraVenta = 0f;
    float segundaVenta = 0f;
    float terceraVenta = 0f;

    System.out.print("\nIngrese valor primera venta = ");
    primeraVenta = sc.nextFloat();

    System.out.print("Ingrese valor segunda venta = ");
    segundaVenta = sc.nextFloat();

    System.out.print("Ingrese valor tercera venta = ");
    terceraVenta = sc.nextFloat();

    comisionPorVentas = (primeraVenta + segundaVenta + terceraVenta) * (porcentaje / 100);
    sueldoNeto = sueldo + comisionPorVentas;

    System.out.println("\nComision por ventas (12%) = " + comisionPorVentas);
    System.out.println("Sueldo = " + sueldo);
    System.out.println("Sueldo NETO = " + sueldoNeto);

    sc.close();

  }
}
