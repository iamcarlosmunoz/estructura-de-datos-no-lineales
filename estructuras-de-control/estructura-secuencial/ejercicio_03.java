
/**
 * Una institución benéfica ha recibido dos donaciones en dólares y euros. La
 * donación será repartida en tres rubros: 50% para la implementación de un
 * centro de salud, 30% para un comedor de niños y el resto para gastos
 * administrativos. Diseñe un algoritmo que determine el monto en pesos que le
 * corresponde a cada rubro. Considere que: 1 dólar = 2000 pesos 1 euro = 2800
 * pesos.
 */

import java.util.Scanner;

public class ejercicio_03 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    float donacionDolares = 0f;
    float donacionEuros = 0f;
    float donacionTotal = 0f;

    float valorDolar = 2000f;
    float valorEuro = 2800f;

    int porcentajePrimerRubro = 50;
    int porcentajeSegundoRubro = 30;
    int porcentajeTercerRubro = 100 - (porcentajePrimerRubro + porcentajeSegundoRubro);

    float montoPrimerRubro = 0f;
    float montoSegundoRubro = 0f;
    float montoTercerRubro = 0f;

    System.out.print("Ingrese primera donacion en DOLARES: ");
    donacionDolares = sc.nextFloat();
    System.out.print("Ingrese primera donacion en EUROS: ");
    donacionEuros = sc.nextFloat();

    donacionTotal = (donacionDolares * valorDolar) + (donacionEuros * valorEuro);
    montoPrimerRubro = donacionTotal * (porcentajePrimerRubro / 100f);
    montoSegundoRubro = donacionTotal * (porcentajeSegundoRubro / 100f);
    montoTercerRubro = donacionTotal * (porcentajeTercerRubro / 100f);

    System.out.printf("%n1. Monto total = %.1f", donacionTotal);
    System.out.printf("%n2. Monto para implementación de un centro de salud = %.1f", montoPrimerRubro);
    System.out.printf("%n3. Monto para comedor de niños = %.1f", montoSegundoRubro);
    System.out.printf("%n4. Monto para gastos administrativos = %.1f", montoTercerRubro);

    sc.close();
  }
}
