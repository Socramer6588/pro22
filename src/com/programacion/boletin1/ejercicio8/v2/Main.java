package com.programacion.boletin1.ejercicio8.v2;

import java.util.Scanner;

import static java.lang.Math.random;

public class Main { //TODO Update for to use array.lenth

    static Scanner sc = new Scanner(System.in);
    static int numLetters;
    static char letterRandom;

    public static void entryInterface() {
        System.out.println(" ");
        System.out.println("Escribe un número: ");
        numLetters = sc.nextInt();
        System.out.println(" ");
        System.out.println("Vamos a generar " + numLetters + " letras aleatorias y decir si son vocales o consonantes:");
    }

    public static void showSolution() {
        for (int aux = 1; aux <= numLetters; aux++) {
            letterRandom = (char) (random() * 26 + 65);
            switch (letterRandom) {
                case 'A', 'E', 'I', 'O', 'U' -> System.out.println(letterRandom + " -> Es vocal");
                default -> System.out.println(letterRandom + " -> Es consonante");
            }
        }
    }

    public static void main(String[] args) {
        entryInterface();
        showSolution();
    }
}

