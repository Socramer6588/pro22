package ev2.boletin2.ej8cuenta;

/*
 * Vamos a definir ahora una “Cuenta Joven”, para ello vamos a crear una nueva clase CuentaJoven que deriva de la anterior.
 * Cuando se crea esta nueva clase, además del titular y la cantidad se debe guardar una bonificación que estará expresada
 * en tanto por ciento y la edad del titular de la cuenta joven.
 * Construye los siguientes métodos para la clase:
 *
 * Un constructor.
 * Los setters y getters para el nuevo atributo.
 * En esta ocasión los titulares de este tipo de cuenta tienen que ser mayor de edad., por lo tanto hay que crear un método
 * esTitularValido() que devuelve verdadero si el titular es mayor de edad pero menor de 25 años y falso en caso contrario.
 * Además la retirada de dinero sólo se podrá hacer si el titular es válido.
 * El método mostrar() debe devolver el mensaje de “Cuenta Joven” y la bonificación de la cuenta.
 * Piensa los métodos heredados de la clase madre que hay que reescribir.
 *
 * */

public class CuentaJoven extends Cuenta {

    private int bonificacion;
    private int edad;

    CuentaJoven(String titular, double cantidad, int bonificacion, int edad) {
        super(titular, cantidad);
        this.bonificacion = bonificacion;
        this.edad = edad;
    }

    CuentaJoven(String titular, int bonificacion, int edad) {
        super(titular);
        this.bonificacion = bonificacion;
        this.edad = edad;
    }

    public static void main(String[] args) {

        CuentaJoven cuenta_1 = new CuentaJoven("Pepe", 20, 22);
        CuentaJoven cuenta_2 = new CuentaJoven("Fernando", 300, 10, 26);

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean esTitularValido() {
        return this.edad > 18 && this.edad < 25;
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
