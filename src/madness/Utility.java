package madness;

public final class Utility {

    private Utility() {
    }

    public static int[] expandArrayToTheRight(int[] array) {
        int[] forOtherArray = new int[array.length + 1];
        System.arraycopy(array, 0, forOtherArray, 0, array.length);
        return forOtherArray;
    }

    public static int[] expandArrayToTheLeft(int[] array) {
        int[] forOtherArray = new int[array.length + 1];
        System.arraycopy(array, 0, forOtherArray, 1, array.length);
        return forOtherArray;
    }

    public static int[] shrinkArrayFromTheRight(int[] array) {
        int[] forOtherArray = new int[array.length - 1];
        System.arraycopy(array, 0, forOtherArray, 0, forOtherArray.length);
        return forOtherArray;
    }

    public static int[] shrinkArrayFromTheLeft(int[] array) {
        int[] forOtherArray = new int[array.length - 1];
        System.arraycopy(array, 1, forOtherArray, 0, forOtherArray.length);
        return forOtherArray;
    }

    public static int[] inverseArray(int[] array) {
        int[] forOtherArray = new int[array.length];
        for (int aux = 0; aux < array.length; aux++) {
            forOtherArray[aux] = array[array.length - aux - 1];
        }
        return forOtherArray;
    }

    public static int[] fromNumToArray(int num) {
        int[] array = new int[1];
        while (true) {
            array[0] = num % 10;
            num = num / 10;
            if (num > 0) array = expandArrayToTheLeft(array);
            else return array;
        }
    }

    public static boolean findPrime(int num) {
        int cont = 0;
        for (int aux = 1; aux <= num; aux++) {
            if (num % aux == 0) {
                cont++;
            }
        }
        return cont == 2;
    }

    public static boolean findHappy(int num) {
        while (num != 4 && num != 1) {
            int[] array = fromNumToArray(num);
            num = 0;
            for (int auxNum : array) {
                num = (int) (num + Math.pow(auxNum, 2));
            }
        }
        return num == 1;
    }
}
