package ev1.bidimensional.ejercicio5;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int[][] matrixA;
    static int[][] matrixB;
    static float mediaA;
    static float mediaB;

    public static int[][] defineMatrix() {
        int[] length = new int[2];
        System.out.println("Introduce el número de filas de la matriz:");
        length[0] = sc.nextInt();
        System.out.println("Introduce el número de columnas de la matriz:");
        length[1] = sc.nextInt();
        return new int[length[0]][length[1]];
    }

    public static void fillMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static float mediaMatrix(int[][] matrix) {
        float sum = 0, cont = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                sum = sum + num;
                cont++;
            }
        }
        return sum / cont;
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

    public static void multiplyMatrix(int[][] matrix, float media) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] *= media;
            }
        }
    }

    public static void main(String[] args) {
        matrixA = defineMatrix();
        fillMatrix(matrixA);
        mediaA = mediaMatrix(matrixA);
        System.out.println("La media de la matriz es: " + mediaA);
        showMatrix(matrixA);

        matrixB = defineMatrix();
        fillMatrix(matrixB);
        mediaB = mediaMatrix(matrixB);
        System.out.println("La media de la matriz es: " + mediaB);
        showMatrix(matrixB);

        multiplyMatrix(matrixA, mediaB);
        System.out.println("Multiplicamos la primera matriz por la media de la segunda:");
        showMatrix(matrixA);

        multiplyMatrix(matrixB, mediaA);
        System.out.println("Multiplicamos la segunda matriz por la media original de la primera:");
        showMatrix(matrixB);
    }
}
