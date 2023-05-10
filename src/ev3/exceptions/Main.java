package ev3.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static int a = 0;
    static int b = 5;
    static int c = 0;
    static Scanner sc = new Scanner(System.in);

    public static void metodoOperacion1() {
        try {
            a = sc.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Valor erroneo");
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println(b / a);
        } catch (ArithmeticException ex) {
            throw new HijoArithmeticException("División entre cero");
        }

        System.out.println("Hola metodo 1");
        metodoOperacion2();
    }

    public static void metodoOperacion2() {
        try {
            sc = new Scanner(System.in);
            c = sc.nextInt();
            System.out.println("c");
        } catch (InputMismatchException ex) {
            System.out.println("Valor erroneo");
            System.out.println(ex.getMessage());
        }
        System.out.println("Hola metodo 2");
        metodoOperacion3();
    }

    public static void metodoOperacion3() {
        System.out.println("Hola metodo 3");
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        try {
            metodoOperacion1();
        } catch (HijoArithmeticException h) {
            System.out.println(h.getMessage());
        } catch (ArithmeticException | InputMismatchException i) {
            System.out.println("Error genérico");
        }
        System.out.println("Hola main");
    }
}
