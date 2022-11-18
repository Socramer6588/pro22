package com.programacion.boletin2.ejercicio7;

import java.util.Random;

public class Main {

    public static void showSolution() {
        Random rnd = new Random();
        int valor = rnd.nextInt(101) + 100;

        if (valor % 2 == 0) {
            System.out.println(valor + " Es par");
        } else {
            System.out.println(valor + " Es impar");
        }
    }

    public static void main(String[] args) {
        showSolution();
    }
}
