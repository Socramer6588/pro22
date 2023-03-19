package ev2.boletin3.ejercicio10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Almacena en un HashMap los códigos postales de las provincias de Galicia.
 * a. Muestra por pantalla los datos introducidos
 * b. Pide un código postal y muestra la provincia asociada si existe sino avisa al usuario
 * c. Elimina las provincias de Lugo y Pontevedra
 * d. Muestra por pantalla los datos
 * */

public class Ej1_Provincias {
    static HashMap<Integer, String> provincias = new HashMap();

    private static void inserciones(){
        provincias.put(32, "Ourense");
        provincias.put(36, "Vigo");
        provincias.put(15, "A Coruña");
        provincias.put(27, "Lugo");
    }

    private static void borradoClave(int cp) {
        provincias.remove(cp);
    }

    private static void borradoValor(String provincia) {
        Iterator claves = provincias.keySet().iterator();

        String pro = "";
        while (claves.hasNext()) {
            Integer codigo = (Integer) claves.next();
            pro = provincias.get(codigo);
            if (pro.equals(provincia)) {
                provincias.replace(codigo, "");
            }
        }
    }

    private static void existeProvincia(int cp) {
        if (provincias.containsKey(cp)) { // También se podría hacer con un get
            System.out.println("Provincia: " + provincias.get(cp));
        } else {
            System.out.println("No existe");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        inserciones();
        System.out.println(provincias);

        System.out.print("CP a buscar:");
        existeProvincia(sc.nextInt());

        // Borrado Pontevedra mediante CP
        System.out.println("Borrado Pontevedra");
        borradoClave(36);

        // Borrado Lugo mediante nombre de provincia
        System.out.println("Borrado Lugo");
        borradoValor("Lugo");
        System.out.println(provincias);
    }
}
