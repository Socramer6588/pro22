package ev2.boletin3.ejercicio14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Almacen {

    private HashMap<Integer, Producto> productos;
    private final int TAMANHO;
    private int idSiguiente = 0;

    Almacen(int tamanho) {
        productos = new HashMap<>();
        this.TAMANHO = tamanho;
    }

    Almacen() {
        productos = new HashMap<>();
        this.TAMANHO = 20;
    }

    public void agregarProducto(Producto p) {
        if (!existeProducto(p) && idSiguiente < TAMANHO) {
            productos.put(idSiguiente, p);
            idSiguiente++;
        } else {
            System.out.println("El producto ya existe o la colección está llena");
        }
    }

    public boolean existeProducto(Producto p) {//(int id)
        Iterator claves = productos.keySet().iterator();
        Producto prod;
        while (claves.hasNext()) {
            Integer codigo = (Integer) claves.next();
            prod = productos.get(codigo);
            if (prod.getIdentificador() == p.getIdentificador()) {
                return true;
            }
        }
        return false;
    }

    public void mostrarProductos() {
        System.out.println("ELEMENTOS EN ALMACÉN:");
        Iterator claves = productos.keySet().iterator();
        while (claves.hasNext()) {
            Integer codigo = (Integer) claves.next();
            System.out.println(codigo + ": " + productos.get(codigo).toString());
        }
    }

    public void eliminarProducto(int id) {
        Iterator claves = productos.keySet().iterator();
        Producto prod;
        while (claves.hasNext()) {
            Integer codigo = (Integer) claves.next();
            prod = productos.get(codigo);
            if (prod.getIdentificador() == id) {
                productos.remove(codigo);
                System.out.println("Producto " + id + " eliminado");
                return;
            }
        }
        System.out.println("No se ha encontrado el elemento");
    }
}
