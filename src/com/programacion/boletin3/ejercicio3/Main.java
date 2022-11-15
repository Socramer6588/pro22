package com.programacion.boletin3.ejercicio3;

public class Main {

    static int loopRecursive;
    static int[][] arrayNum = new int[4][5];

    public static void fillArray() {
        for (int aux = 0; aux < arrayNum[loopRecursive].length; aux++) {
            arrayNum[loopRecursive][aux] = (int) (Math.random() * 100);
        }
        loopRecursive++;
        if (loopRecursive < arrayNum.length) {
            fillArray();
        }
    }

    public static void showArray() {
        for (int number : arrayNum[loopRecursive]) {
            if (number < 10) {
                System.out.print(" " + number + " ");
            } else {
                System.out.print(number + " ");
            }
        }
        System.out.println();
        loopRecursive++;
        if (loopRecursive < arrayNum.length) {
            showArray();
        }
    }

    public static void main(String[] args) {
        fillArray();
        loopRecursive = 0;
        showArray();

    }
}
