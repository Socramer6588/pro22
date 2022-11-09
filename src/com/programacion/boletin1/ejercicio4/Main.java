package com.programacion.boletin1.ejercicio4;

import java.util.Scanner;

public class Main { //TODO recursive solution & N Digits

    static Scanner sc = new Scanner(System.in);
    static int number;
    static int sumaArmstrong;
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
        forOtherArray = new int[separateNumber.length];
        System.arraycopy(separateNumber, 0, forOtherArray, 0, separateNumber.length);

        for (int aux = 0; aux < separateNumber.length; aux++) {
            int aux2 = separateNumber.length - (aux + 1);
            separateNumber[aux] = forOtherArray[aux2];
        }
    }

    public static void calculateArmstrong() {
        for (int value : separateNumber) {
            sumaArmstrong = (int) (sumaArmstrong + Math.pow(value, separateNumber.length));
        }
        armstrong = number == sumaArmstrong;
    }

    public static void showSolution() {
        if (armstrong) {
            System.out.println(number + " Es un número Armstrong");
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
