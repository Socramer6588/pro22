package ev1.boletin1.ejercicio6;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int number;
    static String numRoman = "";
    static int[] romanValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    static String[] romanLetters = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static void entryInterface() {
        System.out.println("Escribe un número para traducir a romano");
        number = sc.nextInt();
    }

    public static void decimalToRoman() {
        for (int aux = 0; aux < romanValues.length; aux++) {
            while (number >= romanValues[aux]) {
                number = number - romanValues[aux];
                numRoman = "%s%s".formatted(numRoman, romanLetters[aux]);
            }
        }
    }

    public static void showSolution() {
        System.out.println(numRoman);
    }

    public static void main(String[] args) {
        entryInterface();
        decimalToRoman();
        showSolution();
    }
}
