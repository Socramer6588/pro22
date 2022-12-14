package ev1.bidimensional.ejercicio4;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    public static int[][] matrix = new int[4][4];

    public static void fillMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Introduce la posición " + "[" + i + "]" + "[" + j + "]");
                matrix[i][j] = (int) (Math.random() * 100 + 1);// TODO: 14/12/2022 Update with requirements
            }
        }
        System.out.println();
    }

    public static void showMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                if (num < 10) System.out.print(" ");
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void sumRow() {
        int sum = 0;
        int row;
        System.out.println("Introduce un número de fila:");
        row = sc.nextInt();
        while (row < 0 || row > 3) {
            System.out.println("Introduce un número de fila válido:");
            row = sc.nextInt();
        }
        for (int i = 0; i < matrix[row].length; i++) {
            sum = sum + matrix[row][i];
        }
        System.out.println("La suma de la fila es: " + sum);
        System.out.println();
    }

    public static void sumMajorDiagonal() {

    }

    public static void sumMinorDiagonal() {

    }

    public static void mediaMatrix() {

    }

    public static int[][] randomMatrix() {
        int[][] auxMatrix=new int[4][4];

        return auxMatrix;
    }

    public static int[][] sumMatrix(int[][] randomMatrix) {

        return matrix;
    }

    public static void main(String[] args) {
        fillMatrix();
        showMatrix(matrix);
        sumRow();
        sumMajorDiagonal();
        sumMinorDiagonal();
        mediaMatrix();
        showMatrix(sumMatrix(randomMatrix()));
    }
}
