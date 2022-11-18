package com.programacion.boletin2.ejercicio2;

public class Main {

    public static void showSolution() {
        for (int aux = 1; aux <= 5; aux++) {
            for (int i = 1; i <= aux; i++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        showSolution();
    }
}
