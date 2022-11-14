package com.programacion.boletin3.ejercicio1;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static double numMedia;
    static int numNegative;
    static int numSupMedia;
    static int[] arrayNum;

    public static void entryInterface() {
        System.out.println("Introduce la longitud del array");
        arrayNum = new int[sc.nextInt()];
        for (int aux = 0; aux < arrayNum.length; aux++) {
            System.out.println("Introduce el número de la posición " + aux);
            arrayNum[aux] = sc.nextInt();
            while (arrayNum[aux] < 0) {
                System.out.println("Prueba otra vez:");
                arrayNum[aux] = sc.nextInt();
            }
        }
    }

    public static void media(int[] arrayNumSP) {
        for (int aux : arrayNumSP) {
            numMedia = numMedia + aux;
        }
        numMedia = numMedia / arrayNumSP.length;
    }

    public static void negative(int[] arrayNumSP) {
        for (int aux : arrayNumSP) {
            if (aux < 0) numNegative++;
        }
    }

    public static void showSolution() {
        System.out.println("Elementos: ");
        for (int aux : arrayNum) {
            System.out.print(aux + " ");
        }
        System.out.println();

        System.out.println("Media: " + numMedia);
        System.out.println("Cantidad de números negativos: " + numNegative);
        System.out.print("Números superiores a la media: ");
        for (int aux : arrayNum) {
            if (aux > numMedia) {
                System.out.print(aux + " ");
                numSupMedia++;
            }
        }
        System.out.println();
        System.out.println("Cantidad de números superiores a la media: " + numSupMedia);
    }

    public static void main(String[] args) {
        entryInterface();
        media(arrayNum);
        negative(arrayNum);
        showSolution();
    }
}
