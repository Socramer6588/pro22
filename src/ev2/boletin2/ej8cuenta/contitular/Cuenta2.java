package ev2.boletin2.ej8cuenta.contitular;

public class Cuenta2 {
    private Titular titular;
    private double cantidad;

    public Cuenta2(Titular titular) {
        this(titular, 0);
    }

    public Cuenta2(Titular titular, double cantidad) {
        this.titular = titular;
        //Si la cantidad es menor que cero, lo ponemos a cero
        if (cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad = cantidad;
        }
    }

    public static void main(String[] args) {

        Titular t1 = new Titular("Pepe", 22, "11111111A");
        Cuenta2 cuenta_1 = new Cuenta2(t1);
        Cuenta2 cuenta_2 = new Cuenta2(new Titular("Fernando", 26, "22222222B"), 300);

        cuenta_1.ingresar(300); // Pepe tiene 300
        cuenta_2.ingresar(400); // Fernando tiene 700

        cuenta_1.retirar(500); // Pepe tiene 0
        cuenta_2.retirar(100); // Fernando tiene 600

        System.out.println(cuenta_1); // 0 euros
        System.out.println(cuenta_2); // 600 euros

    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (this.cantidad - cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad -= cantidad;
        }
    }

    public String toString() {
        return "El titular " + titular.getNombre() + " tiene " + cantidad + " euros en la cuenta";
    }
}
