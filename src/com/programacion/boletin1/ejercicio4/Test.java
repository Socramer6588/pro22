package com.programacion.boletin1.ejercicio4;

public class Test {

    static int[] arrayNumber = {1,2,3,4,5,6};
    static int[] otherArray = new int[0];

    public static void ordenateArray() {

        otherArray = arrayNumber;
        //otherArray = new int[arrayNumber.length];
        //System.arraycopy(arrayNumber, 0, otherArray, 0, arrayNumber.length);



        for (int i : arrayNumber) {
            System.out.print(i);
        }
        System.out.println("");
        for (int i : otherArray) {
            System.out.print(i);
        }
        System.out.println("");



        for (int aux = 0; aux < arrayNumber.length; aux++) {
            int aux2 = otherArray.length - (aux + 1);
            arrayNumber[aux] = otherArray[aux2];
        }




        for (int i : arrayNumber) {
            System.out.print(i);
        }
        System.out.println("");
        for (int i : otherArray) {
            System.out.print(i);
        }
        System.out.println("");

    }

    public static void main(String[] args) {
        ordenateArray();
    }
}
