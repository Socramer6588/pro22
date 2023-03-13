package ev2.boletin3.ejercicio1;

import java.util.*;

public class Main {
    static HashSet<String> hsPos = new HashSet<>();
    static LinkedHashSet<String> lhsPos = new LinkedHashSet<>();
    static TreeSet<String> tPos = new TreeSet<>();

    public static void insercionHashSet() {
        HashSet<String> hsPos = new HashSet<>();

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                hsPos.add("Cadena " + i);
            } else {
                hsPos.add("Cadena " + (i - 10));
            }
        }

        mostrarElementos(hsPos);
    }

    public static void insercionLinkedHashSet() {
        LinkedHashSet<String> lhsPos = new LinkedHashSet<>();

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                lhsPos.add("Cadena " + i);
            } else {
                lhsPos.add("Cadena " + (i - 10));
            }
        }
        mostrarElementos(lhsPos);
    }

    public static void insercionTreeSet() {
        TreeSet<String> tPos = new TreeSet<>();

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                tPos.add("Cadena " + i);
            } else {
                tPos.add("Cadena " + (i - 10));
            }
        }
        mostrarElementos(tPos);
    }

    // CON MÉTODO COMÚN PARA LAS 3 ESTRUCTURAS
    public static void insercionComun(Set set) {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                set.add("Cadena " + i);
            } else {
                set.add("Cadena " + (i - 10));
            }
        }
    }

    public static boolean comprobarElementoExiste(Set set, String cad) {
        return set.contains(cad);
    }

    public static boolean eliminarElemento(Set set, String cad) {
        boolean res = set.remove(cad);
//        mostrarElementos(set);
        return res;
    }

    public static void mostrarElementos(Set set) {
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void inserciones() {
        /*
        insercionHashSet();
        insercionLinkedHashSet();
        insercionTreeSet();
         */
        long t_comienzo;
        long t_fin;
        long t_total;

        System.out.println("-------------INSERCIONES");
        // CON MÉTODO COMÚN PARA LAS 3 ESTRUCTURAS
        // INSERCIONES HASHSET
        t_comienzo = System.currentTimeMillis(); // CAPTURO INSTANTE INICIAL
        insercionComun(hsPos);
        t_fin = System.currentTimeMillis(); // CAPTURO INSTANTE FINAL
        t_total = t_fin - t_comienzo; // RESTO TIEMPO Y OBTENGO MS TOTALES
//        mostrarElementos(hsPos);
        System.out.println("TIEMPO HASHSET: " + t_total);

        // INSERCIONES LINKEDHASHSET
        t_comienzo = System.currentTimeMillis(); // CAPTURO INSTANTE INICIAL
        insercionComun(lhsPos);
        t_fin = System.currentTimeMillis(); // CAPTURO INSTANTE FINAL
        t_total = t_fin - t_comienzo; // RESTO TIEMPO Y OBTENGO MS TOTALES
//        mostrarElementos(lhsPos);
        System.out.println("TIEMPO LINKEDHASHSET: " + t_total);

        // INSERCIONES TREESET
        t_comienzo = System.currentTimeMillis(); // CAPTURO INSTANTE INICIAL
        insercionComun(tPos);
        t_fin = System.currentTimeMillis(); // CAPTURO INSTANTE FINAL
        t_total = t_fin - t_comienzo; // RESTO TIEMPO Y OBTENGO MS TOTALES
//        mostrarElementos(tPos);
        System.out.println("TIEMPO TREESET: " + t_total);
    }

    public static void comprobaciones() {
        long t_comienzo;
        long t_fin;
        long t_total;

        System.out.println("-------------COMPROBACIONES");
        // HASHSET
        t_comienzo = System.currentTimeMillis(); // CAPTURO INSTANTE INICIAL
        System.out.println(comprobarElementoExiste(hsPos, "Cadena 100"));
        System.out.println(comprobarElementoExiste(hsPos, "Cadena 101"));
        t_fin = System.currentTimeMillis(); // CAPTURO INSTANTE FINAL
        t_total = t_fin - t_comienzo; // RESTO TIEMPO Y OBTENGO MS TOTALES
        System.out.println("TIEMPO HASHSET: " + t_total);

        // LINKEDHASHSET
        t_comienzo = System.currentTimeMillis(); // CAPTURO INSTANTE INICIAL
        System.out.println(comprobarElementoExiste(lhsPos, "Cadena 100"));
        System.out.println(comprobarElementoExiste(lhsPos, "Cadena 101"));
        t_fin = System.currentTimeMillis(); // CAPTURO INSTANTE FINAL
        t_total = t_fin - t_comienzo; // RESTO TIEMPO Y OBTENGO MS TOTALES
        System.out.println("TIEMPO LINKEDHASHSET: " + t_total);

        // TREESET
        t_comienzo = System.currentTimeMillis(); // CAPTURO INSTANTE INICIAL
        System.out.println(comprobarElementoExiste(tPos, "Cadena 100"));
        System.out.println(comprobarElementoExiste(tPos, "Cadena 101"));
        t_fin = System.currentTimeMillis(); // CAPTURO INSTANTE FINAL
        t_total = t_fin - t_comienzo; // RESTO TIEMPO Y OBTENGO MS TOTALES
        System.out.println("TIEMPO TREESET: " + t_total);
    }

    public static void borrados() {
        long t_comienzo;
        long t_fin;
        long t_total;

        System.out.println("-------------BORRADOS");
        // HASHSET
        t_comienzo = System.currentTimeMillis(); // CAPTURO INSTANTE INICIAL
        eliminarElemento(hsPos, "Cadena 100");
        t_fin = System.currentTimeMillis(); // CAPTURO INSTANTE FINAL
        t_total = t_fin - t_comienzo; // RESTO TIEMPO Y OBTENGO MS TOTALES
        System.out.println("TIEMPO HASHSET: " + t_total);

        // LINKEDHASHSET
        t_comienzo = System.currentTimeMillis(); // CAPTURO INSTANTE INICIAL
        eliminarElemento(lhsPos, "Cadena 100");
        t_fin = System.currentTimeMillis(); // CAPTURO INSTANTE FINAL
        t_total = t_fin - t_comienzo; // RESTO TIEMPO Y OBTENGO MS TOTALES
        System.out.println("TIEMPO LINKEDHASHSET: " + t_total);

        // TREESET
        t_comienzo = System.currentTimeMillis(); // CAPTURO INSTANTE INICIAL
        eliminarElemento(tPos, "Cadena 100");
        t_fin = System.currentTimeMillis(); // CAPTURO INSTANTE FINAL
        t_total = t_fin - t_comienzo; // RESTO TIEMPO Y OBTENGO MS TOTALES
        System.out.println("TIEMPO TREESET: " + t_total);
    }

    public static void main(String[] args) {
        inserciones();
        comprobaciones();
        borrados();
    }
}
