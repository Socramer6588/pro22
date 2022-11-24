package ev1.boletin1.ejercicio5;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static String birthDate;
    static int luckyNumber;
    static int[] arrayBirthDate = new int[3];
    static int[] forOtherArray;
    static String[] arrayString;

    public static void entryInterface() {
        System.out.println(" ");
        System.out.println("Escribe tu fecha de nacimiento en el siguiente formato -> 01-01-2022:");
        birthDate = sc.next();
        System.out.println();
    }

    public static void separateBirthDate() {
        arrayString = birthDate.split("-");

        for (int aux = 0; aux < arrayString.length; aux++) {
            arrayBirthDate[aux] = Integer.parseInt(arrayString[aux]);
        }
    }

    public static void sumBirthDate() {
        for (int aux : arrayBirthDate) {
            luckyNumber = luckyNumber + aux;
        }

        if (luckyNumber > 9) {
            arrayBirthDate = new int[1];

            while (luckyNumber > 0) {
                arrayBirthDate[arrayBirthDate.length - 1] = luckyNumber % 10;
                luckyNumber = luckyNumber / 10;

                if (luckyNumber > 0) {
                    forOtherArray = arrayBirthDate;
                    arrayBirthDate = new int[arrayBirthDate.length + 1];
                    System.arraycopy(forOtherArray, 0, arrayBirthDate, 0, forOtherArray.length);
                }
            }
            sumBirthDate();
        }
    }

    public static void showSolution() {
        System.out.println("Tu número de la suerte es: " + luckyNumber);
    }

    public static void main(String[] args) {
        entryInterface();
        separateBirthDate();
        sumBirthDate();
        showSolution();
    }
}
