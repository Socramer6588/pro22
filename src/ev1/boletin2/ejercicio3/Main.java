package ev1.boletin2.ejercicio3;

public class Main {

    public static void showSolution() {
        for (int aux = 1; aux <= 4; aux++) {
            int astrx = 2 * aux - 1;
            int oblx = 4 - aux;
            for (int i = 1; i <= oblx; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= astrx; i++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.println();
        }
        for (int aux = 3; aux >= 1; aux--) {
            int astrx = 2 * aux - 1;
            int oblx = 4 - aux;
            for (int i = 1; i <= oblx; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= astrx; i++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        showSolution();
    }
}
