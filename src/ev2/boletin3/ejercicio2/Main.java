package ev2.boletin3.ejercicio2;

import java.util.*;

/**
 * Crear dos conjuntos ordenados de String y realiza lo siguiente:
 * * Realiza inserciones, borrados y obtención de un subconjunto.
 * * Crea un nuevo conjunto que contenga la unión de los 2 conjuntos iniciales.
 * * Crea otro conjunto que contenga la diferencia de los 2 conjuntos iniciales (eliminar los elementos de c2 en c1).
 * */

public class Main {

    static TreeSet<String> ts1 = new TreeSet<>();
    static TreeSet<String> ts2 = new TreeSet<>();

    private static void rellenarConjuntos() {
        for (int i = 0; i < 10; i++) {
            ts1.add("Cadena " + i);
            ts2.add("Cadena " + (i+5));
        }
    }

    public static boolean eliminarElemento(TreeSet set, String cad) {
        boolean res = set.remove(cad);
        return res;
    }

    public static SortedSet<String> obtenerSubconjunto(TreeSet set, String cad) {
        SortedSet<String> res = set.headSet(cad);// set.subSet("Cadena 7", "Cadena 11");
        return res;
    }

    public static TreeSet<String> unionConjuntos() {
        TreeSet<String> union = (TreeSet<String>) ts1.clone();
        union.addAll(ts2);
        return union;
    }

    public static TreeSet<String> diferenciaConjuntos() {
        TreeSet<String> diferencia = (TreeSet<String>) ts2.clone();
        diferencia.removeAll(ts1);
        return diferencia;
    }

    public static void mostrarElementos(Set set) {
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
        rellenarConjuntos();
        System.out.println("----CONJUNTO 1");
        mostrarElementos(ts1);
        System.out.println("----CONJUNTO 2");
        mostrarElementos(ts2);
        System.out.println("----ELIMINAR ELEMENTO EN CONJUNTO 1: Cadena 5");
        eliminarElemento(ts1, "Cadena 5");
        mostrarElementos(ts1);

        System.out.println("----OBTENER SUBCONJUNTO DEL CONJUNTO 2");
        mostrarElementos(obtenerSubconjunto(ts2, "Cadena 5"));

        System.out.println("----UNION DE LOS CONJUNTOS");
        mostrarElementos(unionConjuntos());

        System.out.println("----DIFERENCIA DE LOS CONJUNTOS");
        mostrarElementos(diferenciaConjuntos());
    }
}
