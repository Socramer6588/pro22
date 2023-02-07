package madness;

public final class Utility {

    private Utility() {
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

    public static int[] expandArrayToTheRight(int[] array) {
        int[] forOtherArray = array;
        array = new int[array.length + 1];
        System.arraycopy(forOtherArray, 0, array, 0, forOtherArray.length);
        return array;
    }

    public static int[] expandArrayToTheLeft(int[] array) {
        int[] forOtherArray = new int[array.length+1];
        System.arraycopy(array, 0, forOtherArray, 1, array.length);
        return forOtherArray;
    }

    public static int[] shrinkArrayFromTheRight(int[] array) {
        int[] forOtherArray = new int[array.length - 1];
        System.arraycopy(array, 0, forOtherArray, 0, forOtherArray.length);
        array = forOtherArray;
        return array;
    }

    public static int[] inverseArray(int[] array) {
        int[] forOtherArray = new int[array.length];
        for (int aux = 0; aux < array.length; aux++) {
            forOtherArray[aux]=array[array.length-aux-1];
        }
        return forOtherArray;
    }

    public static int[] fromNumToArray(int num) { // TODO: 07/02/2023 ordenate array & find happy & left shrink
        int[] array = new int[1];
        while (true) {
            array[array.length - 1] = num % 10;
            num = num / 10;
            if (num > 0) array = expandArrayToTheRight(array);
            else return inverseArray(array);
        }
    }


}
