package ev2.boletin1.minumero;

/*
 * Realiza una clase minumero que proporcione el doble, triple y cuádruple de un número
 * proporcionado en su
 * constructor (realiza un método para doble, otro para triple y otro para cuádruple).
 * Haz que la clase tenga un
 * método main y comprueba los distintos métodos.
 * */
public class MiNumero {
    private int numero;

    public MiNumero(int numero) {
        this.numero = numero;
    }

    public static void main(String[] args) {
        MiNumero dato = new MiNumero(10);
        System.out.println(dato.getDoble() + " " + dato.getTriple() + " " + dato.getCuadruple());
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDoble() {
        return numero * 2;
    }

    public int getTriple() {
        return numero * 3;
    }

    public int getCuadruple() {
        return numero * 4;
    }
}
