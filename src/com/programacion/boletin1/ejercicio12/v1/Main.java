package com.programacion.boletin1.ejercicio12.v1;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int manyEuros;
    static int[] arrayManyBills = new int[7];

    public static void entryInterface() {
        System.out.println(" ");
        System.out.println("Escribe un número de euros: ");
        manyEuros = sc.nextInt();
        System.out.println(" ");
        System.out.println("Vamos a expresar ese resultado en los billetes más grandes posibles:");
    }

    public static void calculateEuros() {
        arrayManyBills[0] = manyEuros / 500;
        manyEuros = manyEuros - (arrayManyBills[0] * 500);

        arrayManyBills[1] = manyEuros / 200;
        manyEuros = manyEuros - (arrayManyBills[1] * 200);

        arrayManyBills[2] = manyEuros / 100;
        manyEuros = manyEuros - (arrayManyBills[2] * 100);

        arrayManyBills[3] = manyEuros / 50;
        manyEuros = manyEuros - (arrayManyBills[3] * 50);

        arrayManyBills[4] = manyEuros / 20;
        manyEuros = manyEuros - (arrayManyBills[4] * 20);

        arrayManyBills[5] = manyEuros / 10;
        manyEuros = manyEuros - (arrayManyBills[5] * 10);

        arrayManyBills[6] = manyEuros / 5;
        manyEuros = manyEuros - (arrayManyBills[6] * 5);
    }

    public static void showSolution() {
        System.out.println(arrayManyBills[0] + " billetes de 500");
        System.out.println(arrayManyBills[1] + " billetes de 200");
        System.out.println(arrayManyBills[2] + " billetes de 100");
        System.out.println(arrayManyBills[3] + " billetes de 50");
        System.out.println(arrayManyBills[4] + " billetes de 20");
        System.out.println(arrayManyBills[5] + " billetes de 10");
        System.out.println(arrayManyBills[6] + " billetes de 5");
        System.out.println(manyEuros + " euros sueltos");
    }

    public static void main(String[] args) {
        entryInterface();
        calculateEuros();
        showSolution();
    }
}
