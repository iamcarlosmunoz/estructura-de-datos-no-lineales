package examenes.segundo;

/**
 * 1. Calcule la complejidad total para el siguiente trozo de algoritmo.
 */
public class E01 {

  public static void main(String[] args) {

    // Entrada
    int n = 10;
    int m[][] = new int[10][10];

    // TROZO DE ALGORITMO
    int s = 0; // Constante
    for (int i = 0; i < n; i++) { // For Externo
      for (int j = 0; j < n; j++) { // For interno
        s += m[i][j];
        System.out.println("Ahora la suma es = " + s);
      }
    }

    // Respuesta
    // Complejidad Algoritmica = 4n² + 4n + 3
    //
    //
    // Procedimiento
    // >>> For Interno = 2 + 4n
    // >>> Constante s = o(1)
    // >>> For Externo = 2 + 2n + n(2 + 4n)
  }
}
