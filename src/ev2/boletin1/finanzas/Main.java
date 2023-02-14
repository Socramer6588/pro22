package ev2.boletin1.finanzas;

public class Main {

    public static void main(String[] args) {
        Finanzas f1 = new Finanzas();
        Finanzas f2 = new Finanzas(1.1);
        System.out.println(f1.dolaresToEuros(10));
        System.out.println(f1.eurosToDolares(10));
        System.out.println();
        System.out.println(f2.dolaresToEuros(10));
        System.out.println(f2.eurosToDolares(10));
    }
}
