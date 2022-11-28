public class HappyNumber {

    public static int num;
    static boolean happy;
    static int auxRecursive;
    static int[] arrayNum = new int[1];
    static int[] forOtherArray;

    public static void findHappy(int numSP) {
        separateNum(numSP);
        numSP = 0;
        for (int aux : arrayNum) {
            numSP = (int) (numSP + Math.pow(aux, 2));
        }
        auxRecursive++;
        if (auxRecursive < 8 && numSP != 1) {
            arrayNum = new int[1];
            findHappy(numSP);
        } else happy = numSP == 1;
    }

    public static void separateNum(int numSP) {
        arrayNum[arrayNum.length - 1] = numSP % 10;
        numSP = numSP / 10;

        if (numSP > 0) {
            forOtherArray = arrayNum;
            arrayNum = new int[arrayNum.length + 1];
            System.arraycopy(forOtherArray, 0, arrayNum, 0, forOtherArray.length);
            separateNum(numSP);
        }
    }

    public static void showSolution() {
        if (happy) System.out.println("Es feliz: " + num);
    }

    public static void loop() {
        happy = false;
        auxRecursive = 0;
        arrayNum = new int[1];
        num++;
    }

    public static void main(String[] args) {
        while (num < 1E3) {
            findHappy(num);
            showSolution();
            loop();
        }
    }
}
