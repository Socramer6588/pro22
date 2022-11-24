package ev1.boletin1.ejercicio8;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int numLetters;
    static char letterRandom;

    public static void entryInterface() {
        System.out.println(" ");
        System.out.println("Escribe un número: ");
        numLetters = sc.nextInt();
        System.out.println(" ");
        System.out.println("Vamos a generar " + numLetters + " letras aleatorias y decir si son vocales o consonantes:");
    }

    public static void showSolution() {
        for (int aux = 1; aux <= numLetters; aux++) {
            letterRandom = (char) (Math.random() * 26 + 65);
            switch (letterRandom) {
                case 'A', 'E', 'I', 'O', 'U' -> System.out.println(letterRandom + " -> Es vocal");
                default -> System.out.println(letterRandom + " -> Es consonante");
            }
        }
    }

    public static void main(String[] args) {
        entryInterface();
        showSolution();
    }
}

