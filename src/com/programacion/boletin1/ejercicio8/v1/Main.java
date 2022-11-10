package com.programacion.boletin1.ejercicio8.v1;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static char[] arrayAbecedary = new char[26]; //Son vocales las posiciones 0/4/8/14/20
    static int numLetters;
    static int numRandom;

    public static void fillArrayAbecedary() {
        for (int aux = 0; aux < arrayAbecedary.length; aux++) {
            arrayAbecedary[aux] = (char) (aux + 65);
            //System.out.println(arrayAbecedary[aux]); //Debug Purposes
        }
    }

    public static void entryInterface() {
        System.out.println(" ");
        System.out.println("Escribe un número: ");
        numLetters = sc.nextInt();
        System.out.println(" ");
        System.out.println("Vamos a generar " + numLetters + " letras aleatorias y decir si son vocales o consonantes:");
    }

    public static void showSolution() {
        for (int aux = 1; aux <= numLetters; aux++) {
            numRandom = (int) (Math.random() * 26);
            //System.out.println(numRandom); //Debug Purposes
            switch (numRandom) {
                case 0, 4, 8, 14, 20 -> System.out.println(arrayAbecedary[numRandom] + " -> Es vocal");
                default -> System.out.println(arrayAbecedary[numRandom] + " -> Es consonante");
            }
        }
    }

    public static void main(String[] args) {
        fillArrayAbecedary();
        entryInterface();
        showSolution();
    }
}

