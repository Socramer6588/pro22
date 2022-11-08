package com.programacion.boletin1.ejercicio12.v1;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int manyEuros;
    static int[] arrayEuros = new int[7];

    public static void entryInterface() {
        System.out.println(" ");
        System.out.println("Escribe un número de euros: ");
        manyEuros = sc.nextInt();
        System.out.println(" ");
        System.out.println("Vamos a expresar ese resultado en los billetes más grandes posibles:");
    }

    public static void calculateEuros() {
        arrayEuros[0] = manyEuros / 500;
        manyEuros = manyEuros - arrayEuros[0] * 500;

        arrayEuros[1] = manyEuros / 200;
        manyEuros = manyEuros - arrayEuros[1] * 200;

        arrayEuros[2] = manyEuros / 100;
        manyEuros = manyEuros - arrayEuros[2] * 100;

        arrayEuros[3] = manyEuros / 50;
        manyEuros = manyEuros - arrayEuros[3] * 50;

        arrayEuros[4] = manyEuros / 20;
        manyEuros = manyEuros - arrayEuros[4] * 20;

        arrayEuros[5] = manyEuros / 10;
        manyEuros = manyEuros - arrayEuros[5] * 10;

        arrayEuros[6] = manyEuros / 5;
        manyEuros = manyEuros - arrayEuros[6] * 5;
    }

    public static void showSolution() {
        System.out.println(arrayEuros[0] + " billetes de 500");
        System.out.println(arrayEuros[1] + " billetes de 200");
        System.out.println(arrayEuros[2] + " billetes de 100");
        System.out.println(arrayEuros[3] + " billetes de 50");
        System.out.println(arrayEuros[4] + " billetes de 20");
        System.out.println(arrayEuros[5] + " billetes de 10");
        System.out.println(arrayEuros[6] + " billetes de 5");
        System.out.println(manyEuros + " euros sueltos");
    }

    public static void main(String[] args) {
        entryInterface();
        calculateEuros();
        showSolution();
    }
}
