package com.programacion.invenciones_de_nuria.ejercicio1;

public class Main {

    static int[] arrayNum = new int[30];

    public static void main(String[] args) {
        for (int aux = 0; aux < arrayNum.length; aux++) {
            arrayNum[aux] = (int) (Math.random() * 100);
        }

        for (int num : arrayNum) {
            System.out.println(num);
        }
    }
}
