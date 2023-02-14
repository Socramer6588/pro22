package ev2.boletin1.persona;
/*
 * Clase Persona:
 * Atributos: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura.
 * Asignar valores por defecto a todos los atributos según su tipo.
 * Sexo será hombre por defecto, se deberá usar una constante para ello.
 * Constructores:
 * Uno por defecto.
 * Uno que reciba nombre, edad y sexo, resto por defecto.
 * Otro con todos los atributos como parámetro.
 * Métodos:
 * int calcularIMC(): calcula si la persona está en su peso ideal (peso en kg/(altura^2  en m)).
 * Si el resultado es un valor menor que 20, la función devuelve un -1, si es un número entre 20 y 25 (incluidos),
 * está por debajo de su peso ideal y la función devuelve un 0 y si da un valor mayor que 25 significa que tiene sobrepeso,
 * la función devuelve un 1.
 * boolean esMayorDeEdad()
 * void comprobarSexo(char sexo): comprueba que el sexo introducido sea correcto. Si es incorrecto correcto, asignará H.
 * toString()
 * generaDNI(): genera un número aleatorio de 8 cifras, y a partir de este, su letra correspondiente. Se invocará desde el constructor
 *
 * */

import java.util.Scanner;

public class Persona {
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;

    public Persona() {
        this("", 0, 'H', 0, 0);
    }

    public Persona(String nombre, int edad, char sexo) {
        this(nombre, edad, sexo, 0, 0);
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        generarDni();
        this.sexo = sexo;
        comprobarSexo();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    private void comprobarSexo() {
        if (sexo != 'H' && sexo != 'M') {
            this.sexo = 'H';
        }
    }

    private void generarDni() {
        int numero = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int posLetra = numero % 23;

        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        char letra = letras.charAt(posLetra);

        DNI = Integer.toString(numero) + letra;
    }

    public int calcularIMC() {
        double pesoActual = peso / (Math.pow(altura, 2));
        if (pesoActual >= 20 && pesoActual <= 25) {
            return 0;
        } else if (pesoActual < 20) {
            return -1;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad() {
        boolean mayor = edad >= 18;
        return mayor;
    }

    public String toString() {
        String sexo;
        if (this.sexo == 'H') {
            sexo = "hombre";
        } else {
            sexo = "mujer";
        }
        return "Datos personales:\n" + "Nombre: " + nombre + "\n" + "Sexo: " + sexo + "\n" + "Edad: " + edad + " años\n" + "DNI: " + DNI + "\n" + "Peso: " + peso + " kg\n" + "Altura: " + altura + " metros\n";
    }
}

class Principal2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre");
        String nombre = sc.nextLine();

        sc = new Scanner(System.in);
        System.out.println("Introduce la edad");
        int edad = sc.nextInt();

        sc = new Scanner(System.in);
        System.out.println("Introduce el sexo");
        char sexo = sc.nextLine().charAt(0);

        sc = new Scanner(System.in);
        System.out.println("Introduce el peso");
        double peso = sc.nextDouble();

        System.out.println("Introduce la altura");
        double altura = sc.nextDouble();

        Persona p = new Persona(nombre, edad, sexo, peso, altura);

        System.out.println("** Datos:");
        MuestraResultadoIMC(p);
        MuestraMayorDeEdad(p);
        System.out.println(p);
    }

    public static void MuestraResultadoIMC(Persona p) {
        int IMC = p.calcularIMC();
        switch (IMC) {
            case 0:
                System.out.println("La persona está en su peso ideal");
                break;
            case -1:
                System.out.println("La persona está por debajo de su peso ideal");
                break;
            case 1:
                System.out.println("La persona está por encima de su peso ideal");
                break;
        }
    }

    public static void MuestraMayorDeEdad(Persona p) {

        if (p.esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona no es mayor de edad");
        }
    }

}
