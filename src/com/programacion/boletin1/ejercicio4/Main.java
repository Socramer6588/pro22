package com.programacion.boletin1.ejercicio4;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Main { //TODO recursive solution & N Digits

    static Scanner sc = new Scanner(System.in);
    static int number;
    static int numberCopyForMethods;
    static int auxArray;
    static int[] arraySeparateNumber = new int[3];
    static boolean armstrong;

    public static void entryInterface() {
        System.out.println(" ");
        System.out.println("Escribe un número y vamos a comprobar si es un número Armstrong: ");
        System.out.println("Ej: 153 = 1^3 + 5^3 + 3^3");
        number = sc.nextInt();
    }

    public static void fillArray() {
        arraySeparateNumber[auxArray] = numberCopyForMethods % 10;
        numberCopyForMethods = numberCopyForMethods / 10;
        auxArray++;
        if (numberCopyForMethods > 0) {
            fillArray();
        }
    }

    public static void ordenateArray() {

    }

    public static void calculateArmstrong() {
        armstrong = (pow(arraySeparateNumber[0], 3) + pow(arraySeparateNumber[1], 3) + pow(arraySeparateNumber[2], 3)) == number;
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
        numberCopyForMethods = number;
        fillArray();
        ordenateArray();
        calculateArmstrong();
        showSolution();
    }
}
