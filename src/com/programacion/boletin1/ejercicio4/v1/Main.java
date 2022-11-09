package com.programacion.boletin1.ejercicio4.v1;

public class Main {

    static int number;
    static int sumArmstrong;
    static int[] separateNumber = new int[1];
    static int[] forOtherArray;
    static boolean armstrong;

    public static void fillArray(int numberRecursive) {
        separateNumber[separateNumber.length - 1] = numberRecursive % 10;
        numberRecursive = numberRecursive / 10;

        if (numberRecursive > 0) {
            forOtherArray = separateNumber;
            separateNumber = new int[separateNumber.length + 1];
            System.arraycopy(forOtherArray, 0, separateNumber, 0, forOtherArray.length);
            fillArray(numberRecursive);
        }
    }

    public static void ordenateArray() {
        forOtherArray = new int[separateNumber.length];
        System.arraycopy(separateNumber, 0, forOtherArray, 0, separateNumber.length);

        for (int aux = 0; aux < separateNumber.length; aux++) {
            int aux2 = separateNumber.length - (aux + 1);
            separateNumber[aux] = forOtherArray[aux2];
        }
    }

    public static void calculateArmstrong() {
        for (int value : separateNumber) {
            sumArmstrong = (int) (sumArmstrong + Math.pow(value, separateNumber.length));
        }
        armstrong = number == sumArmstrong;
    }

    public static void showSolution() {
        if (armstrong) {
            System.out.print("Es un número Armstrong: ");

            for (int value : separateNumber) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void loop() {
        number++;
        sumArmstrong = 0;
        separateNumber = new int[1];
    }

    public static void main(String[] args) {

        while (number < 1E9) {
            fillArray(number);
            ordenateArray();
            calculateArmstrong();
            showSolution();
            loop();
        }
    }
}
