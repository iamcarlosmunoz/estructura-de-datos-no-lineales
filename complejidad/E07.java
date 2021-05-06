package complejidad;

/**
 * Inicialice directamente un arreglo de enteros y encuentre el mayor (Coloque
 * el mayor en la última posición-Es decir considere el peor de los casos!).
 */
 
public class E07 {

  public static void main(String[] args) {

    int numeros[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 15}; // n = 10
    int mayor = numeros[0];
    int contador; // contador de instrucciones
    int i; // contador ciclo for

    for (i = 0, contador = 1; (contador++ != 0 && i < numeros.length); contador++, i++) {
      contador += 2;
      if (numeros[i] >= mayor) {
        mayor = numeros[i];
      }
    }

    System.out.println("\nEl número mayor es: " + mayor);
    System.out.println("\nTotal de instrucciones: " + contador);

    // Complejidad Algoritmica
    // 1 + n + 1 + n(1 + 1) + n
    // 2 + n + 2n + n
    // = 2 + 4n
  }
}
