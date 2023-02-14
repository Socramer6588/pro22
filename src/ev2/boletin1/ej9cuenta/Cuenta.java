package ev2.boletin1.ej9cuenta;

/*
 *
 * Clase Cuenta con los siguientes atributos: titular y cantidad (puede tener decimales).
 * El titular será obligatorio y la cantidad es opcional
 * Tendrá dos métodos:
 * ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no hará nada.
 * retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan es
 * negativa, la cantidad de la cuenta pasa a ser 0
 *
 * */

public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        if (cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad = cantidad;
        }
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

class Principal {

    public static void main(String[] args) {

        Cuenta c1 = new Cuenta("Maria", 0);
        Cuenta c2 = new Cuenta("Pepe", 500);

        c1.ingresar(300);
        c2.ingresar(200);

        c1.retirar(450);
        c2.retirar(100);

        System.out.println(c1);
        System.out.println(c2);

    }
}
