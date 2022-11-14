package com.programacion.boletin3.ejercicio1;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int numMedia;
    static int numNegative;
    static int[] arrayNum;

    public static void entryInterface() {
        System.out.println("Introduce la longitud del array");
        arrayNum = new int[sc.nextInt()];
        for (int aux = 0; aux < arrayNum.length; aux++) {
            System.out.println("Introduce el número de la posición " + (aux + 1));
            arrayNum[aux] = sc.nextInt();
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
        for (int aux : arrayNum) {
            System.out.print(aux + " ");
        }
        System.out.println();

        System.out.println("Media: " + numMedia);
        System.out.println("Números negativos: " + numNegative);
    }

    public static void main(String[] args) {
        entryInterface();
        media(arrayNum);
        negative(arrayNum);
        showSolution();
    }
}
