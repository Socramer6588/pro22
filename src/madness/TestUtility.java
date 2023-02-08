package madness;

import static madness.Utility.*;

public class TestUtility {

    public static void main(String[] args) {

        int a = 153;

        System.out.println(findPrime(a));

        int[] array = fromNumToArray(a);

        for (int num : array) {
            System.out.print(num);
        }
        System.out.println();

        array = expandArrayToTheRight(array);

        for (int num : array) {
            System.out.print(num);
        }
        System.out.println();

        array = shrinkArrayFromTheRight(array);

        for (int num : array) {
            System.out.print(num);
        }
        System.out.println();

        array = expandArrayToTheLeft(array);

        for (int num : array) {
            System.out.print(num);
        }
        System.out.println();

        array = shrinkArrayFromTheLeft(array);

        for (int num : array) {
            System.out.print(num);
        }
        System.out.println();

        array = inverseArray(array);

        for (int num : array) {
            System.out.print(num);
        }
        System.out.println();

        System.out.println(findHappy(71));
    }
}
