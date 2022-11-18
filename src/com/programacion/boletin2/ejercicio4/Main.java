package com.programacion.boletin2.ejercicio4;

public class Main {

    public static void showSolution() {
        for (int aux = 0; aux <= 3; aux++) {
            int astrx = 2 * aux - 1;
            int oblx = 3 - aux;
            for (int i = 1; i <= oblx; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int i = 1; i <= astrx; i++) {
                System.out.print(" ");
            }
            if (aux != 0) System.out.print("*");
            System.out.println();
            System.out.println();
        }
        for (int aux = 2; aux >= 0; aux--) {
            int astrx = 2 * aux - 1;
            int oblx = 3 - aux;
            for (int i = 1; i <= oblx; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int i = 1; i <= astrx; i++) {
                System.out.print(" ");
            }
            if (aux != 0) System.out.print("*");
            System.out.println();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        showSolution();
    }
}
