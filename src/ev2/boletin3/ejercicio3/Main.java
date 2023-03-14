package ev2.boletin3.ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    ArrayList<Integer> listaEnteros;

    public static void main(String[] args) {
        Main proyectoReales = new Main();
        proyectoReales.listaEnteros = new ArrayList();
        proyectoReales.leerOpcion();
    }

    public void leerOpcion() {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\nLista de Enteros");
            System.out.println("[1] Agregar");
            System.out.println("[2] Buscar");
            System.out.println("[3] Modificar elemento");
            System.out.println("[4] Eliminar elemento");
            System.out.println("[5] Insertar elemento");
            System.out.println("[6] Mostrar elementos");
            System.out.println("[7] Orden ascendente");
            System.out.println("[8] Orden descendente");
            System.out.println("[9] Salir\n");
            System.out.print("Ingrese opcion (1-9): ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    ingresarValor();
                    break;
                case 2:
                    buscarValor();
                    break;
                case 3:
                    modificarValor();
                    break;
                case 4:
                    eliminarValor();
                    break;
                case 5:
                    insertarValor();
                    break;
                case 6:
                    mostrarLista();
                    break;
                case 7:
                    ordenarAscendente();
                    break;
                case 8:
                    ordenarDescendente();
                    break;
            }
        } while (opcion != 9);
    }

    public void ingresarValor() {
        Scanner entrada = new Scanner(System.in);
        int valor;
        System.out.print("Ingrese valor: ");
        valor = entrada.nextInt();
        listaEnteros.add(valor);
    }

    public void buscarValor() {
        Scanner entrada = new Scanner(System.in);
        double valor;
        int indice;
        System.out.print("Valor a buscar: ");
        valor = entrada.nextInt();
        indice = listaEnteros.indexOf(valor);
        if (indice != -1) {
            System.out.println("Dato se encuentra en posición: " + indice);
        } else {
            System.out.println("Dato no se encuentra");
        }
    }

    public void modificarValor() {
        Scanner entrada = new Scanner(System.in);
        int valor, nuevoValor;
        int indice;
        System.out.print("Valor a modificar: ");
        valor = entrada.nextInt();
        indice = listaEnteros.indexOf(valor);
        if (indice != -1) {
            System.out.print("Nuevo valor: ");
            nuevoValor = entrada.nextInt();
            listaEnteros.set(indice, nuevoValor);
        } else {
            System.out.println("Dato no se encuentra");
        }
    }

    public void eliminarValor() {
        Scanner entrada = new Scanner(System.in);
        double valor;
        int indice;
        System.out.print("Valor a eliminar: ");
        valor = entrada.nextInt();
        indice = listaEnteros.indexOf(valor);
        if (indice != -1) {
            listaEnteros.remove(indice);
            System.out.println("Dato eliminado");
        } else {
            System.out.println("Dato no se encuentra");
        }
    }

    public void insertarValor() {
        Scanner entrada = new Scanner(System.in);
        int valor;
        int indice;
        System.out.print("Valor a insertar: ");
        valor = entrada.nextInt();
        System.out.print("Posición donde desea insertar: ");
        indice = entrada.nextInt();
        listaEnteros.add(indice, valor);
    }

    public void mostrarLista() {
        if (!listaEnteros.isEmpty()) {
            System.out.println("Elementos de la lista:");
            for (int i = 0; i < listaEnteros.size(); i++) {
                System.out.println(listaEnteros.get(i));
            }
        } else {
            System.out.println("No existen valores en la lista");
        }
    }

    public void ordenarAscendente() {
        Collections.sort(listaEnteros);
        mostrarLista();
    }

    public void ordenarDescendente() {
        Comparator<Integer> comparador = Collections.reverseOrder();
        Collections.sort(listaEnteros, comparador);
        mostrarLista();
    }
}
