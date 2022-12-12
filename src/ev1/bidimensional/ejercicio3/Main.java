package ev1.bidimensional.ejercicio3;

public class Main {

    static int loopRecursive;
    static int sumNumbers;
    static int sumNumbersTotal;
    static int[][] arrayNum = new int[4][5];

    public static void fillArray() {
        for (int aux = 0; aux < arrayNum[loopRecursive].length; aux++) {
            arrayNum[loopRecursive][aux] = (int) (Math.random() * 100);
        }
        loopRecursive++;
        if (loopRecursive < arrayNum.length) fillArray();
    }

    public static void prepareRecursion() {
        loopRecursive = 0;
        System.out.println();
    }

    public static void showArray() {
        for (int number : arrayNum[loopRecursive]) {
            if (number < 10) System.out.print(" ");
            System.out.print(number + " ");
        }
        System.out.println();
        loopRecursive++;
        if (loopRecursive < arrayNum.length) showArray();
    }

    public static void sumRows() {
        sumNumbers = 0;
        for (int aux = 0; aux < arrayNum[loopRecursive].length; aux++) {
            int number = arrayNum[loopRecursive][aux];
            sumNumbers = sumNumbers + number;
            if (number < 10) System.out.print(" ");
            System.out.print(number + "  ");
            if ((aux + 1) != arrayNum[loopRecursive].length) System.out.print("+ ");
            else System.out.print("= " + sumNumbers);
        }
        System.out.println();
        loopRecursive++;
        if (loopRecursive < arrayNum.length) sumRows();
    }

    public static void sumColumns() {
        sumNumbers = 0;
        System.out.println(" =     =     =     =     =     =");
        for (int aux = 0; aux < arrayNum[0].length; aux++) {
            sumNumbers = 0;
            for (int[] num : arrayNum) {
                sumNumbers = sumNumbers + num[aux];
            }
            sumNumbersTotal = sumNumbersTotal + sumNumbers;
            System.out.print(sumNumbers + " ");
            if ((aux + 1) != arrayNum[0].length) System.out.print("+ ");
            else System.out.print("= " + sumNumbersTotal);
        }
    }

    public static void main(String[] args) {
        fillArray();
        prepareRecursion();
        showArray();
        prepareRecursion();
        sumRows();
        sumColumns();
    }
}
