package ev1.boletin2.ejercicio10;

public class Main {

    public static int num = 1000;
    static int[] arrayNum = new int[4];
    static int[][] arrayVamp = new int[12][2];

    /*
     * Número Vampiro:
     *
     *   1260 = 21*60
     *
     *   NO ambos con ceros finales
     *   Ninguno con ceros iniciales
     *
     *   1260
     *
     *   1 2 6 0
     *
     *
     *   1-2 3-4
     *   1-2 4-3
     *   2-1 4-3
     *   2-1 3-4
     *
     *   1-3 2-4
     *   1-3 4-2
     *   3-1 4-2
     *   3-1 2-4
     *
     *   1-4 2-3
     *   1-4 3-2
     *   4-1 3-2
     *   4-1 2-3
     *
     *
     *   12 60   12 06   21 60   21 06
     *   16 20   16 02   61 20   61 02
     *   10 26   10 62   01 26   01 62
     *
     *
     */

    public static void separateNumber(int numSP) {
        for (int aux = 0; aux < arrayNum.length; aux++) {
            arrayNum[aux] = numSP % 10;
            numSP = numSP / 10;
        }
    }

    public static void fillArray() {
        arrayVamp[0][0] = 10 * arrayNum[0] + arrayNum[1];
        arrayVamp[0][1] = 10 * arrayNum[2] + arrayNum[3];

        arrayVamp[1][0] = 10 * arrayNum[0] + arrayNum[1];
        arrayVamp[1][1] = 10 * arrayNum[3] + arrayNum[2];

        arrayVamp[2][0] = 10 * arrayNum[1] + arrayNum[0];
        arrayVamp[2][1] = 10 * arrayNum[3] + arrayNum[2];

        arrayVamp[3][0] = 10 * arrayNum[1] + arrayNum[0];
        arrayVamp[3][1] = 10 * arrayNum[2] + arrayNum[3];

        arrayVamp[4][0] = 10 * arrayNum[0] + arrayNum[2];
        arrayVamp[4][1] = 10 * arrayNum[1] + arrayNum[3];

        arrayVamp[5][0] = 10 * arrayNum[0] + arrayNum[2];
        arrayVamp[5][1] = 10 * arrayNum[3] + arrayNum[1];

        arrayVamp[6][0] = 10 * arrayNum[2] + arrayNum[0];
        arrayVamp[6][1] = 10 * arrayNum[3] + arrayNum[1];

        arrayVamp[7][0] = 10 * arrayNum[2] + arrayNum[0];
        arrayVamp[7][1] = 10 * arrayNum[1] + arrayNum[3];

        arrayVamp[8][0] = 10 * arrayNum[0] + arrayNum[3];
        arrayVamp[8][1] = 10 * arrayNum[1] + arrayNum[2];

        arrayVamp[9][0] = 10 * arrayNum[0] + arrayNum[3];
        arrayVamp[9][1] = 10 * arrayNum[2] + arrayNum[1];

        arrayVamp[10][0] = 10 * arrayNum[3] + arrayNum[0];
        arrayVamp[10][1] = 10 * arrayNum[2] + arrayNum[1];

        arrayVamp[11][0] = 10 * arrayNum[3] + arrayNum[0];
        arrayVamp[11][1] = 10 * arrayNum[1] + arrayNum[2];
    }

    public static void findVamp() {
        for (int[] aux : arrayVamp) {
            boolean numVamp = false;
            if (aux[0] / 10 * 10 != aux[0] || aux[1] / 10 * 10 != aux[1]) numVamp = num == aux[0] * aux[1];
            if (numVamp) {
                System.out.println();
                System.out.println("Es vampiro: " + num + " = " + aux[0] + " * " + aux[1]);

                for (int[] aux2 : arrayVamp) {
                    for (int i : aux2) {
                        if (i < 10) System.out.print(" ");
                        System.out.print(i + " ");
                    }
                    System.out.println();
                }
            }
        }
    }

    public static void main(String[] args) {
        while (num < 1E4) {
            separateNumber(num);
            fillArray();
            findVamp();
            num++;
        }

    }
}
