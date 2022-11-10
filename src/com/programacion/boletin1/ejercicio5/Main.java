package com.programacion.boletin1.ejercicio5;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static String birthDate;
    static int sumRecursive;
    static int luckyNumber;
    static int[] arrayBirthDate = new int[3];
    static String[] arrayForOtherArray;

    public static void entryInterface() {
        System.out.println(" ");
        System.out.println("Escribe tu fecha de nacimiento en el siguiente formato -> 01-01-2022:");
        birthDate = sc.next();
        System.out.println();
    }

    public static void separateDateBirth() {
        arrayForOtherArray = birthDate.split("-");

        for (int aux = 0; aux < arrayForOtherArray.length; aux++) {
            arrayBirthDate[aux] = Integer.parseInt(arrayForOtherArray[aux]);
        }
    }

    public static void sumDateBirth() {

    }

    public static void showSolution() {
        System.out.println("Tu número de la suerte es: " + luckyNumber);
    }

    public static void main(String[] args) {
        entryInterface();
        separateDateBirth();
        sumDateBirth();
        showSolution();

        System.out.println(birthDate);

        for (int aux: arrayBirthDate) {
            System.out.println(aux);
        }

    }
}
