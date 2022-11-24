package ev1.boletin1.ejercicio12;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int manyEuros;
    static int[] arrayBills = {500, 200, 100, 50, 20, 10, 5};
    static int[] arrayManyBills = new int[7];

    public static void entryInterface() {
        System.out.println(" ");
        System.out.println("Escribe un número de euros: ");
        manyEuros = sc.nextInt();
        System.out.println(" ");
        System.out.println("Vamos a expresar ese resultado en los billetes más grandes posibles:");
    }

    public static void calculateEuros() {
        for (int aux = 0; aux < arrayBills.length; aux++) {
            if (manyEuros >= arrayBills[aux]) {
                arrayManyBills[aux] = manyEuros / arrayBills[aux];
                manyEuros = manyEuros - (arrayBills[aux] * arrayManyBills[aux]);
            }
        }
    }

    public static void showSolution() {
        int auxForEach = 0;
        for (int manyBills : arrayManyBills) {
            if (manyBills > 0) {
                System.out.println(manyBills + " billetes de " + arrayBills[auxForEach] + " euros");
            }
            auxForEach++;
        }

        if (manyEuros > 0) {
            System.out.println("Sobran " + manyEuros + " euros");
        }
    }

    public static void main(String[] args) {
        entryInterface();
        calculateEuros();
        showSolution();
    }
}
