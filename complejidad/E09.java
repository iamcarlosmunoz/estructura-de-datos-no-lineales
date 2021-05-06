package complejidad;

/**
 * Inicializar una matriz de tamaño m por n con números enteros y calcular la
 * suma de los números de la matriz.
 */
 
public class E09 {

  public static void main(String[] args) {

    int numeros[][] = {{1, 2, 3}, {4, 5, 6}}; // n = 2 y m = 3
    int suma = 0;
    int contador; // Contador de instrucciones
    int i; // Indice Externo
    int j; // Indice Interior

    for (i = 0, contador = 1; (contador++ != 0 && i < numeros.length); contador++, i++) {
      for (j = 0, contador++; (contador++ != 0 && j < numeros[i].length); contador++, j++) {
        contador++;
        suma += numeros[i][j];
      }
    }

    System.out.println("\nSuma total: " + suma);
    System.out.println("\nNúmero total de instruciones: " + contador);

    // Complejidad Algoritmica
    // >>> For interno
    // 1 + m + 1 + m(1) + n = 2 + 3m
    // >>> For externo (Total)
    // 1 + n + 1 + n( 2 + 3m ) + n
    // 2 + 2n + 2n + 3(n)(m)
    // = 2 + 4n + 3(n)(m)
  }

}
