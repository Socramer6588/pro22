package ev1.boletin1.ejercicio11;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int t;
    static int[] arrayTime = new int[3];

    public static void entryInterface() {
        System.out.println(" ");
        System.out.println("Escribe un número de segundos: ");
        t = sc.nextInt();
        System.out.println(" ");
        System.out.println("Vamos a expresar esa cifra en horas, minutos y segundos:");
    }

    public static void calculateTime() {
        arrayTime[0] = t / 3600;
        t = t - (arrayTime[0] * 3600);
        arrayTime[1] = t / 60;
        t = t - (arrayTime[1] * 60);
        arrayTime[2] = t;
    }

    public static void showSolution() {
        System.out.println(arrayTime[0] + " horas, " + arrayTime[1] + " minutos y " + arrayTime[2] + " segundos");
    }

    public static void main(String[] args) {
        entryInterface();
        calculateTime();
        showSolution();
    }
}
