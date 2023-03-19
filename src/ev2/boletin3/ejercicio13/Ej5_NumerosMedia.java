package ev2.boletin3.ejercicio13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/*
* Programa Java que lea una serie de valores numéricos enteros desde el teclado y los guarde en un ArrayList
* de tipo Integer. La lectura de números enteros termina cuando se introduzca el valor -99. Este valor no se guarda
* en el ArrayList. A continuación el programa mostrará por pantalla el número de valores que se han leído, su suma y su
* media. Por último se mostrarán todos los valores leídos, indicando cuántos de ellos son mayores que la media.
*
* */

public class Ej5_NumerosMedia {
    static ArrayList<Integer> lista = new ArrayList<>();
    static LinkedList<Integer> l1 = new LinkedList<>();


    public static void rellenarLista() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca número:");
        int lectura = sc.nextInt();
        while(lectura != -99) {
            System.out.println("Introduzca número:");
            lista.add(lectura);
        }
        System.out.println(lista);
    }
    public static double obtenerMedia() {
        double suma = 0, media;
        int cont = 0;

        for (int i = 0; i < lista.size(); i++) {
            suma += lista.get(i);
            cont++;
        }

        System.out.println("Se han leído " + cont + " números");
        System.out.println("Su suma es: " + suma);
        media = suma/cont;
        System.out.println("Y su media: " + media);

        return media;
    }

    public static int superioresMedia(double media) {
        int cont = 0;

        Iterator listaIt = lista.iterator();
        while (listaIt.hasNext()) {
            Integer num = (Integer) listaIt.next();
            if (num > media)
                cont++;
        }

        return cont;
    }

    public static void main(String args[]) {
        rellenarLista();
        double media = obtenerMedia();
        System.out.println("Existen " + superioresMedia(media) + " números superiores a la media: " + media);
    }
}
