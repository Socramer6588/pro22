package ev2.boletin1.ej5numero;

/*
 *
 * Realiza una clase número que almacene un número entero y tenga las siguientes características:
 * Constructor por defecto que inicializa a 0 el número interno.
 * Constructor que inicializa el número interno.
 * Método aniade que permite sumarle un número al valor interno.
 * Método resta que resta un número al valor interno.
 * Método getValor. Devuelve el valor interno.
 * Método getDoble. Devuelve el doble del valor interno.
 * Método getTriple. Devuelve el triple del valor interno.
 * Método setNumero. Inicializa de nuevo el valor interno.
 *
 * */

public class Numero {
    private int dato;

    public Numero() {
        dato = 0;
    }

    public Numero(int dato) {
        this.dato = dato;
    }

    public static void main(String[] args) {
        Numero m = new Numero();
        m.setNumero(5);
        m.aniade(5);
        System.out.println(m.getDoble());
        System.out.println(m.getTriple());
        System.out.println(m.getValor());
    }

    public void aniade(int num) {
        dato = dato + num;
    }

    public void resta(int num) {
        dato = dato - num;
    }

    public int getValor() {
        return dato;
    }

    public int getDoble() {
        return 2 * dato;
    }

    public int getTriple() {
        return 3 * dato;
    }

    public void setNumero(int num) {
        dato = num;
    }
}
