package com.programacion.boletin3.ejercicio2;

public class Main {

    static boolean prime;
    static int[] arrayNum = new int[30];
    static int[] arrayPrime = new int[30];

    public static void fillArray() {
        for (int aux = 0; aux < arrayNum.length; aux++) {
            arrayNum[aux] = (int) (Math.random() * 100);
        }
    }

    public static void findPrime() {
        for (int aux = 0; aux < arrayNum.length; aux++) {
            int cont = 0;

            for (int i = 1; i <= arrayNum[aux]; i++) {
                if (arrayNum[aux] % i == 0) {
                    cont++;
                }
            }

            prime = cont == 2;

            if (prime) {
                arrayPrime[aux] = arrayNum[aux];
            }
        }
    }

    public static void showResult() {
        for (int num : arrayNum) {
            System.out.print(num + " ");
        }

        System.out.println();

        for (int num : arrayPrime) {
            if (num != 0) {
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String[] args) {
        fillArray();
        findPrime();
        showResult();
    }
}
