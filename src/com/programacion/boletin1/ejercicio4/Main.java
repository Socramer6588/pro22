package com.programacion.boletin1.ejercicio4;

import java.util.Scanner;

public class Main { //TODO recursive solution & N Digits

    static Scanner sc = new Scanner(System.in);
    static int number;
    static int[] separateNumber = new int[1];
    static int[] forOtherArray;
    static boolean armstrong;

    public static void entryInterface() {
        System.out.println(" ");
        System.out.println("Escribe un número y vamos a comprobar si es un número Armstrong: ");
        System.out.println("Ej: 153 = 1^3 + 5^3 + 3^3");
        number = sc.nextInt();
    }

    public static void fillArray(int numberRecursive) {
        separateNumber[separateNumber.length - 1] = numberRecursive % 10;
        numberRecursive = numberRecursive / 10;

        if (numberRecursive > 0) {
            forOtherArray = separateNumber;
            separateNumber = new int[separateNumber.length + 1];
            System.arraycopy(forOtherArray, 0, separateNumber, 0, forOtherArray.length);
            fillArray(numberRecursive);
        }
    }

    public static void ordenateArray() {

        for (int i : separateNumber) {
            System.out.print(i);
        }
        System.out.println("");
        for (int i : forOtherArray) {
            System.out.print(i);
        }
        System.out.println("");





        forOtherArray = separateNumber;
        //forOtherArray = new int[forOtherArray.length + 1];
        //System.arraycopy(separateNumber, 0, forOtherArray, 0, separateNumber.length);

        for (int i : separateNumber) {
            System.out.print(i);
        }
        System.out.println("");
        for (int i : forOtherArray) {
            System.out.print(i);
        }
        System.out.println("");



        for (int aux = 0; aux < separateNumber.length; aux++) {
            int aux2 = forOtherArray.length - (aux + 1);
            separateNumber[aux] = forOtherArray[aux2];
        }




        for (int i : separateNumber) {
            System.out.print(i);
        }
        System.out.println("");
        for (int i : forOtherArray) {
            System.out.print(i);
        }
        System.out.println("");

    }

    public static void calculateArmstrong() {
        armstrong = number == Math.pow(separateNumber[0], 3) + Math.pow(separateNumber[1], 3) + Math.pow(separateNumber[2], 3);
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
