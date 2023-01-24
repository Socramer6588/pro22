package ev2.boletin2.cuenta;

public class Main {

    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Héctor", 100.0);
        System.out.println(c1);

        Cuenta c2 = new Cuenta("Gon", c1.retirar(50.0));
        System.out.println(c2);
        System.out.println(c1);

        c1.ingresar(1000.0);
        System.out.println(c1);

        c1.ingresar(c2.retirar(200.0));
        System.out.println(c1);
        System.out.println(c2);

    }
}
