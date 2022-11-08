package com.programacion.boletin1.ejercicio4;

import java.util.Scanner;

public class Main { //TODO recursive solution & N Digits

    static Scanner sc = new Scanner(System.in);
    static int number;
    static int contFillArray;
    static int[] arraySeparateNumber = new int[1];
    static int[] arrayForResizeOtherArray;
    static boolean armstrong;

    public static void entryInterface() {
        System.out.println(" ");
        System.out.println("Escribe un número y vamos a comprobar si es un número Armstrong: ");
        System.out.println("Ej: 153 = 1^3 + 5^3 + 3^3");
        number = sc.nextInt();
    }

    public static void fillArray(int numberRecursive) {

        arraySeparateNumber[contFillArray] = numberRecursive % 10;
        numberRecursive = numberRecursive / 10;
        contFillArray++;

        if (numberRecursive > 0) {
            arrayForResizeOtherArray = new int[arraySeparateNumber.length];
            System.arraycopy(arraySeparateNumber, 0, arrayForResizeOtherArray, 0, arraySeparateNumber.length);
            arraySeparateNumber = new int[arraySeparateNumber.length + 1];
            System.arraycopy(arrayForResizeOtherArray, 0, arraySeparateNumber, 0, arrayForResizeOtherArray.length);
            fillArray(numberRecursive);
        }
    }

    public static void ordenateArray() {

    }

    public static void calculateArmstrong() {
        armstrong = number == Math.pow(arraySeparateNumber[0], 3) + Math.pow(arraySeparateNumber[1], 3) + Math.pow(arraySeparateNumber[2], 3);
    }

    public static void showSolution() {
        if (armstrong) {
            System.out.println("Es un número Armstrong");
        } else {
            System.out.println("No es un número Armstrong");
        }
    }

    public static void main(String[] args) {
        entryInterface();
        fillArray(number);
        ordenateArray();
        calculateArmstrong();
        showSolution();
    }
}
