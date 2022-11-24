package ev1.boletin2.ejercicio1;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int numA;
    static int numB;
    static int numC;
    static int numHigh;
    static int numLow;

    public static void entryInterface() {
        System.out.println("Introduce un número");
        numA = sc.nextInt();
        System.out.println("Introduce un segundo número");
        numB = sc.nextInt();
        System.out.println("Introduce un tercer número");
        numC = sc.nextInt();
    }

    public static void calculateHigh() {
        if (numA > numB && numA > numC) {
            numHigh = numA;
        } else if (numB > numA && numB > numC) {
            numHigh = numB;
        } else numHigh = numC;
    }

    public static void calculateLow() {
        if (numA < numB && numA < numC) {
            numLow = numA;
        } else if (numB < numA && numB < numC) {
            numLow = numB;
        } else numLow = numC;
    }

    public static void showSolution() {
        System.out.println("El número mayor es " + numHigh);
        System.out.println("El número menor es " + numLow);
    }

    public static void main(String[] args) {
        entryInterface();
        calculateHigh();
        calculateLow();
        showSolution();
    }
}
