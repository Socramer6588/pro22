package ev2.boletin2.ej8cuenta;

/*
 * Crea una clase Cuenta que tendrá los siguientes atributos:
 * titular
 * cantidad (puede tener decimales).
 *
 * El titular será obligatorio y la cantidad opcional.
 * Crea dos constructores que cumpla lo anterior.
 *
 * Crea sus métodos get, set y toString.
 *
 * Tendrá dos métodos especiales:
 *
 * ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad
 * introducida es negativa, no se hará nada.
 * retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad
 * actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.
 *
 * */
public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta(String titular) {
        this(titular, 0);
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        //Si la cantidad es menor que cero, lo ponemos a cero
        if (cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad = cantidad;
        }
    }

    public static void main(String[] args) {

        Cuenta cuenta_1 = new Cuenta("Pepe");
        Cuenta cuenta_2 = new Cuenta("Fernando", 300);

        cuenta_1.ingresar(300); // Pepe tiene 300
        cuenta_2.ingresar(400); // Fernando tiene 700

        cuenta_1.retirar(500); // Pepe tiene 0
        cuenta_2.retirar(100); // Fernando tiene 600

        System.out.println(cuenta_1); // 0 euros
        System.out.println(cuenta_2); // 600 euros

    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
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
        return "El titular " + titular + " tiene " + cantidad + " euros en la cuenta";
    }
}
