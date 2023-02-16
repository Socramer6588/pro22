package ev2.boletin2.ej8cuenta.contitular;

public class CuentaJoven2 extends Cuenta2 {

    private int bonificacion;

    CuentaJoven2(Titular titular, double cantidad, int bonificacion) {
        super(titular, cantidad);
        this.bonificacion = bonificacion;
    }

    CuentaJoven2(Titular titular, int bonificacion) {
        super(titular);
        this.bonificacion = bonificacion;
    }

    public static void main(String[] args) {

        Titular t1 = new Titular("Pepe", 22, "11111111A");

        CuentaJoven2 cuenta_1 = new CuentaJoven2(t1, 20);
        CuentaJoven2 cuenta_2 = new CuentaJoven2(new Titular("Fernando", 26, "22222222B"), 300, 10);

        cuenta_1.ingresar(300); // Pepe tiene 300
        cuenta_2.ingresar(400); // Fernando tiene 700

        cuenta_1.retirar(500); // Pepe tiene 0
        cuenta_2.retirar(100); // Fernando no puede reirar

        System.out.println(cuenta_1); // 0 euros
        System.out.println(cuenta_2); // 700 euros

    }

    public int getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(int bonificacion) {
        this.bonificacion = bonificacion;
    }

    public boolean esTitularValido() {
        return super.getTitular().getEdad() > 18 && super.getTitular().getEdad() < 25;
    }

    public void retirar(double cantidad) {
        if (!esTitularValido()) {
            System.out.println("No puedes retirar dinero. Titular no válido");
        } else if (cantidad > 0) {
            super.retirar(cantidad);
        }
    }

    public void mostrar() {
        System.out.println("Cuenta joven: " + this.bonificacion);
    }
}
