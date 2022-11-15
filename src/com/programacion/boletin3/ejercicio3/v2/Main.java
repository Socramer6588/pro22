package com.programacion.boletin3.ejercicio3.v2;

public class Main { //TODO V1 without recursion

    static int loopRecursive;
    static int sumNumbers;
    static int[][] arrayNum = new int[4][5];

    public static void fillArray() {
        for (int aux = 0; aux < arrayNum[loopRecursive].length; aux++) {
            arrayNum[loopRecursive][aux] = (int) (Math.random() * 100);
        }
        loopRecursive++;
        if (loopRecursive < arrayNum.length) fillArray();
    }

    public static void prepareRecursion() {
        loopRecursive = 0;
        System.out.println();
    }

    public static void showArray() {
        for (int number : arrayNum[loopRecursive]) {
            if (number < 10) System.out.print(" ");
            System.out.print(number + " ");
        }
        System.out.println();
        loopRecursive++;
        if (loopRecursive < arrayNum.length) showArray();
    }

    public static void sumRows() {
        sumNumbers = 0;
        for (int aux = 0; aux < arrayNum[loopRecursive].length; aux++) {
            int number = arrayNum[loopRecursive][aux];
            sumNumbers = sumNumbers + number;
            if (number < 10) System.out.print(" ");
            System.out.print(number + " ");
            if ((aux + 1) != arrayNum[loopRecursive].length) System.out.print("+ ");
            else System.out.print("= " + sumNumbers);
        }
        System.out.println();
        loopRecursive++;
        if (loopRecursive < arrayNum.length) sumRows();
    }

    public static void main(String[] args) {
        fillArray();
        prepareRecursion();
        showArray();
        prepareRecursion();
        sumRows();

    }
}
