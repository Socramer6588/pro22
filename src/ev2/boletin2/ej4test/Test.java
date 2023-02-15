package ev2.boletin2.ej4test;

/*
 * Realiza una clase Test con 2 métodos, uno que tome por teclado dos números y otro que muestre la suma,
 * multiplicación, división y módulo. En el caso de que el segundo número sea 0, el programa deberá atrapar las
 * excepciones que se puedan producir.
 *
 * Además, contará con un método main para comprobar su funcionamiento.
 *
 * Para la resolución de este problema necesitarás utilizar wrappers.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    int num1, num2;

    public static void main(String[] args) {
        Test t = new Test();
        t.leeNumeros();
        t.muestraNumeros();
    }

    public void leeNumeros() {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(isr);
        try {
            System.out.print("Introduzca el primer número:");
            String ln = buff.readLine();
            num1 = Integer.parseInt(ln);
            System.out.print("Introduzca el segundo número:");
            ln = buff.readLine();
            num2 = Integer.parseInt(ln);
        } catch (IOException e) {
            System.err.println("Se ha producido una IOException");
            e.printStackTrace();
        } catch (Throwable e) {
            System.err.println("Error de programa: " + e);
            e.printStackTrace();
        }
    }

    public void muestraNumeros() {
        try {
            System.out.println(num1 + num2);
            System.out.println(num1 * num2);
            System.out.println(num1 / num2);
            System.out.println(num1 % num2);
        } catch (ArithmeticException e) {
            System.out.println("División por cero");
        } catch (Exception e) {
            System.out.println("Se produjo un error en el programa");
        }
    }
}
