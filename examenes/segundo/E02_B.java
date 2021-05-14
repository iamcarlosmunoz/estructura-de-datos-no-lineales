package examenes.segundo;

/**
 * 2.B. Calcule complejidad total de cada uno de los siguientes trozos de
 * algoritmo. Indicando el número total de instrucciones que realiza si n=1000.
 */
public class E02_B {

  public static void main(String[] args) {

    int n = 1000;
    int i; // Iterador ciclo for.
    int ins; // Contador de instrucciones

    for (i = n, ins = 1; ins++ != 0 && i > 0; ins++, i /= 2) {
      ins += 2;
      System.out.println(" ");
      System.out.println(i + " ");
    }

    System.out.println("\nTotal de instrucciones: " + ins);

    // Respuesta
    // Complejidad Algoritmica =
    //
    //
    // Procedimiento
    //
  }

}
