package com.programacion.boletin2.ejercicio6;

public class Main {

    public static void showSolution() {
        for (int aux = 1; aux <= 10; aux++) {
            System.out.println();
            System.out.println("Tabla del " + aux);
            System.out.println("************");
            for (int i = 1; i <= 10; i++) {
                System.out.println(aux + " x " + i + " = " + aux * i);
            }
        }
    }

    public static void main(String[] args) {
        showSolution();
    }
}
