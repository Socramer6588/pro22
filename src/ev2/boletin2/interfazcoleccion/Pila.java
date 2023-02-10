package ev2.boletin2.interfazcoleccion;

public class Pila implements CollectionInterface{

    private int[] array;

    private int contador;

    @Override
    public boolean isEmpty() {
        return contador == 0;
    }
}
