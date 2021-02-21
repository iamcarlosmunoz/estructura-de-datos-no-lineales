import java.util.Scanner;

/**
 * Calcular el salario neto de un trabajador, su salario basico se calcula con
 * base en el número de horas trabajadas, el precio por hora y las horas extra
 * (sí las tiene). El trabajador tine un descuento del 3% para ahorro si su
 * salario basico es menor o igual a $350.000. En caso contrario el descuento es
 * del 5%.
 */

public class ejercicio_04 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Entrada
    float precioHora = 0f;
    int horas = 0;
    int horasExtra = 0;

    // Salida
    float salarioBasico = 0f;
    float descuento = 0f;
    float salarioNeto = 0f;

    System.out.print("\nIngrese precio por hora: ");
    precioHora = sc.nextFloat();

    System.out.print("Ingrese número de horas: ");
    horas = sc.nextInt();

    System.out.print("Ingrese número de horas extras: ");
    horasExtra = sc.nextInt();

    salarioBasico = (horas + horasExtra) * precioHora;

    if (salarioBasico <= 350000) {
      descuento = salarioBasico * 3 / 100;
    } else {
      descuento = salarioBasico * 5 / 100;
    }

    salarioNeto = salarioBasico - descuento;

    System.out.println("Salario Neto es de = " + salarioNeto);

    sc.close();
  }
}
