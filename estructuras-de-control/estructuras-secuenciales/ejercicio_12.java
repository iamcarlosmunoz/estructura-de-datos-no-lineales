
/**
 * Diseñe un algoritmo que lea la hora actual del día HH:MM:SS 
 * y determine cuantas horas,minutos y segundos restan para finalizar el día.
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ejercicio_12 {

  public static void main(String[] args) {

    Calendar calendar = new GregorianCalendar();

    int horasActual = 0;
    int minutosActual = 0;
    int segundosActual = 0;

    int horasRestantes = 0;
    int minutosRestantes = 0;
    int segundosRestantes = 0;

    horasActual = calendar.get(Calendar.HOUR_OF_DAY);
    minutosActual = calendar.get(Calendar.MINUTE);
    segundosActual = calendar.get(Calendar.SECOND);

    horasRestantes = 24 - horasActual;
    minutosRestantes = 60 - minutosActual;
    segundosRestantes = 60 - segundosActual;

    System.out.println("\nHora actual es = " + horasActual + ":" + minutosActual + ":" + segundosActual);
    System.out.println("\n1. Horas restantes = " + horasRestantes);
    System.out.println("2. Minutos restantes = " + minutosRestantes);
    System.out.println("3. Segundos restantes = " + segundosRestantes);
  }
}
