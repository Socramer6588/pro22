package com.programacion.boletin2.ejercicio12;

public class Main {

    static int num = 1;

    public static void showSolution() {
        while (num <= 100) {
            if (num % 5 != 0) {
                System.out.println(num);
            }
            num++;
        }
    }

    public static void main(String[] args) {
        showSolution();
    }
}
