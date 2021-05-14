package examenes.segundo;

/**
 * 2.A. Calcule complejidad total de cada uno de los siguientes trozos de
 * algoritmo. Indicando el número total de instrucciones que realiza si n=20.
 */
public class E02_A {

  public static void main(String[] args) {

    int n = 20;
    int c; // Contador de Iteracciones
    int i; // Iterador ciclo for.
    int ins; // Contador de instrucciones

    for (i = 0, c = 1, ins = 2; ins++ != 0 && i < n / 2; ins++, i += 2) {
      ins += 3;
      System.out.println(i + " ");
      System.out.println("Iteracion N° " + c);
      c++;
    }

    System.out.println("\nTotal de instrucciones: " + ins);

    // Respuesta
    // Complejidad Algoritmica = 3 + (5n)/4
    //
    //
    // Procedimiento
    // 1 + 1 + n/4 + 1 + n/4(3) + n/4
  }
}
