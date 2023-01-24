package ev2.boletin2.cuenta;

public class Cuenta { // TODO: 24/01/2023 return salto de linea

    private String titular;

    private Double cantidad;

    public Cuenta(String titular) {
        this.titular = titular;
        this.cantidad = 0.0;
    }

    public Cuenta(String titular, Double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Titular: " + titular + "\n" + "Cantidad: " + cantidad + "\n";
    }

    public void ingresar(Double cantidad) {
        if (cantidad >= 0) {
            this.cantidad += cantidad;
        }
    }

    public Double retirar(Double cantidad) {
        this.cantidad -= cantidad;
        if (this.cantidad < 0) {
            System.out.print("Se han solicitado " + cantidad + "€ ");
            cantidad = cantidad + this.cantidad;
            System.out.println("pero el máximo a retirar quedando la cuenta a cero será: " + cantidad + "€\n");
            this.cantidad = 0.0;
        }
        return cantidad;
    }
}
