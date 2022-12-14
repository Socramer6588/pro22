package ev1.bidimensional.ejercicio4;

import java.util.Scanner;

public class Main {

    public static int[][] matrix = new int[4][4];
    static Scanner sc = new Scanner(System.in);

    public static void fillMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Introduce la posición " + "[" + i + "]" + "[" + j + "]");
                matrix[i][j] = sc.nextInt();
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
        while (row < 0 || row >= matrix.length) {
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
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum = sum + matrix[i][i];
        }
        System.out.println("La suma de la diagonal mayor es: " + sum);
        System.out.println();
    }

    public static void sumMinorDiagonal() {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum = sum + matrix[i][matrix.length - 1 - i];
        }
        System.out.println("La suma de la diagonal menor es: " + sum);
        System.out.println();
    }

    public static void mediaMatrix() {
        int cont = 0;
        float sum = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                sum = sum + num;
                cont++;
            }
        }
        System.out.println("La media de la matriz es: " + sum / cont);
        System.out.println();
    }

    public static int[][] randomMatrix() {
        int[][] arrayRandomMatrix = new int[4][4];
        for (int i = 0; i < arrayRandomMatrix.length; i++) {
            for (int j = 0; j < arrayRandomMatrix[i].length; j++) {
                arrayRandomMatrix[i][j] = (int) (Math.random() * 10 + 1);
                if (arrayRandomMatrix[i][j] < 10) System.out.print(" ");
                System.out.print(arrayRandomMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        return arrayRandomMatrix;
    }

    public static int[][] sumMatrix(int[][] arrayRandomMatrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] += arrayRandomMatrix[i][j];
            }
        }
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
