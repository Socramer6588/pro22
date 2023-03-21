package ev2.boletin3.simulacroexamen;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/*    Crea dos conjuntos ordenados de elementos Integer y realiza lo siguiente;
            -La suma, resta, multiplicacion de sus elementos.
            -Crea un nuevo conjunto que contenga la union de los conjuntos iniciales.
            -Crea otro conjunto que contenga la diferencia de los 2 conjuntos iniciales (eliminar los elementos de c2 en c1).
*/

public class Main {

    static TreeSet<Integer> ts1 = new TreeSet<>();
    static TreeSet<Integer> ts2 = new TreeSet<>();

    public static void llenar(Set set) {
        for (int i = 0; i < 10; i++) {
            int num = (int) (Math.random() * 10);
            set.add(num);
        }
    }

    public static void mostrar(Set set) {
        Iterator<Integer> it = set.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }

    public static void suma(Set set, Set set2) {
        Iterator<Integer> it = set.iterator();
        Iterator<Integer> it2 = set2.iterator();
        int valor;
        int valor2;
        int cont = 0;

        while (it.hasNext() || it2.hasNext()) {
            if (it.hasNext()) {
                valor = it.next();
            } else valor = 0;

            if (it2.hasNext()) {
                valor2 = it2.next();
            } else valor2 = 0;

            System.out.print("Suma elemento " + cont++ + " de los dos conjuntos: ");
            System.out.println(valor + " + " + valor2 + " = " + (valor + valor2));
        }
        System.out.println();
    }

    public static void resta(Set set, Set set2) {
        Iterator<Integer> it = set.iterator();
        Iterator<Integer> it2 = set2.iterator();
        int valor;
        int valor2;
        int cont = 0;

        while (it.hasNext() || it2.hasNext()) {
            if (it.hasNext()) {
                valor = it.next();
            } else valor = 0;

            if (it2.hasNext()) {
                valor2 = it2.next();
            } else valor2 = 0;

            System.out.print("Resta elemento " + cont++ + " de los dos conjuntos: ");
            System.out.println(valor + " - " + valor2 + " = " + (valor - valor2));
        }
        System.out.println();
    }

    public static void multiplicar(Set set, Set set2) {
        Iterator<Integer> it = set.iterator();
        Iterator<Integer> it2 = set2.iterator();
        int valor;
        int valor2;
        int cont = 0;

        while (it.hasNext() || it2.hasNext()) {
            if (it.hasNext()) {
                valor = it.next();
            } else valor = 0;

            if (it2.hasNext()) {
                valor2 = it2.next();
            } else valor2 = 0;

            System.out.print("Multiplicar elemento " + cont++ + " de los dos conjuntos: ");
            System.out.println(valor + " * " + valor2 + " = " + (valor * valor2));
        }
        System.out.println();
    }

    public static void dividir(Set set, Set set2) {
        Iterator<Integer> it = set.iterator();
        Iterator<Integer> it2 = set2.iterator();
        int valor;
        int valor2;
        int cont = 0;

        while (it.hasNext() || it2.hasNext()) {
            if (it.hasNext()) {
                valor = it.next();
            } else valor = 0;

            if (it2.hasNext()) {
                valor2 = it2.next();
            } else valor2 = 0;

            System.out.print("Dividir elemento " + cont++ + " de los dos conjuntos: ");
            System.out.print(valor + " / " + valor2 + " = ");
            if (valor2 != 0) {
                System.out.println(valor / valor2);
            } else System.out.println("#");
        }
        System.out.println();
    }

    public static TreeSet<Integer> union(TreeSet set, TreeSet set2) {
        TreeSet<Integer> clon = (TreeSet<Integer>) set.clone();
        clon.addAll(set2);
        return clon;
    }

    public static TreeSet<Integer> diferencia(TreeSet set, TreeSet set2) {
        TreeSet<Integer> clon = (TreeSet<Integer>) set.clone();
        clon.removeAll(set2);
        return clon;
    }

    public static SortedSet<Integer> subconjunto(TreeSet set, Integer num) {
        SortedSet<Integer> subclon = set.headSet(num);
        return subclon;
    }

    public static void main(String[] args) {
        llenar(ts1);
        llenar(ts2);

        System.out.println(ts1);
        System.out.println(ts2);
        System.out.println();

        mostrar(ts1);
        mostrar(ts2);
        System.out.println();

/*
        suma(ts1, ts2);
        resta(ts1, ts2);
        multiplicar(ts1, ts2);
        dividir(ts1, ts2);
*/

        mostrar(union(ts1, ts2));
        mostrar(diferencia(ts1, ts2));
        mostrar(subconjunto(ts1, 5));
    }
}
