package com.programacion.boletin1.ejercicio4;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int number;

    public static void entryInterface() {
        System.out.println(" ");
        System.out.println("Escribe un número y vamos a comprobar si es un número Armstrong: ");
        System.out.println("Ej: 153 = 1^3 + 5^3 + 3^3");
        number = sc.nextInt();
    }

    public static void calculateArmstrong() {
        
    }

    public static void showSolution() {

    }

    public static void main(String[] args) {
        entryInterface();
        calculateArmstrong();
        showSolution();
    }
}
