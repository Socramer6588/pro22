package com.programacion.boletin2.ejercicio9;

public class Main {

    static boolean prime;
    static int num;
    static int inverseNum;
    static int[] arrayNum = new int[1];
    static int[] forOtherArray;

    public static void findPrime(int numSP) {
        int contador = 0;
        for (int aux = 1; aux <= numSP; aux++) {
            if (numSP % aux == 0) {
                contador++;
            }
        }
        prime = contador == 2;
    }

    public static void separateNum(int numSP) {
        arrayNum[arrayNum.length - 1] = numSP % 10;
        numSP = numSP / 10;

        if (numSP > 0) {
            forOtherArray = arrayNum;
            arrayNum = new int[arrayNum.length + 1];
            System.arraycopy(forOtherArray, 0, arrayNum, 0, forOtherArray.length);
            separateNum(numSP);
        }
    }

    public static void setInverseNum() {
        int cont = arrayNum.length - 1;
        for (int aux : arrayNum) {
            inverseNum = (int) (inverseNum + aux * Math.pow(10, cont));
            cont--;
        }
    }

    public static void showResult() {
        if (prime) System.out.println("Es Omirp: " + num);
    }

    public static void loop() {
        num++;
        inverseNum = 0;
        arrayNum = new int[1];
    }

    public static void main(String[] args) {
        while (num < 1E3) {
            findPrime(num);
            if (prime) {
                separateNum(num);
                setInverseNum();
                if (num != inverseNum) {
                    findPrime(inverseNum);
                    showResult();
                }
            }
            loop();
        }
    }
}
