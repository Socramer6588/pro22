/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ev2.boletin3.ejercicio4;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author nccasares
 */
public class Principal {

    public static void main(String[] args) {

        LinkedList<Pedido> pedidos = new LinkedList<>();
        Producto p1 = new Producto(0, "Producto1", "Descripcion del producto 1");
        Producto p2 = new Producto(1, "Producto2", "Descripcion del producto 2");
        Producto p3 = new Producto(2, "Producto3", "Descripcion del producto 3");
        Cliente c1 = new Cliente("1111111A", "Cliente 1");
        Cliente c2 = new Cliente("2111111B", "Cliente 2");

        // GENERO PRIMER PEDIDO
        ArrayList<LineaPedido> lineas = new ArrayList<>();
        lineas.add(new LineaPedido(2, p1));
        lineas.add(new LineaPedido(3, p2));
        lineas.add(new LineaPedido(1, p3));
        pedidos.add(new Pedido(c1, lineas));

        // GENERO SEGUNDO PEDIDO
        lineas = new ArrayList<>();
        lineas.add(new LineaPedido(3, p1));
        lineas.add(new LineaPedido(1, p2));
        lineas.add(new LineaPedido(5, p3));
        pedidos.add(new Pedido(c2, lineas));

        // GENERO TERCER PEDIDO
        lineas = new ArrayList<>();
        lineas.add(new LineaPedido(6, p1));
        lineas.add(new LineaPedido(4, p2));
        lineas.add(new LineaPedido(2, p3));
        pedidos.add(new Pedido(c2, lineas));

        System.out.println("PRIMER PEDIDO:");
        System.out.println(pedidos.peek().toString());

        listarPedidos(pedidos);

        System.out.println("ÚLTIMO PEDIDO:");
        System.out.println(pedidos.getLast().toString());

        System.out.println("ELIMINAR ÚLTIMO PEDIDO:");
        System.out.println(pedidos.removeLast().toString());

        listarPedidos(pedidos);
    }

    private static void listarPedidos(LinkedList<Pedido> pedidos) {
        System.out.println("LISTADO PEDIDOS:");
        for (Pedido p : pedidos) {
            System.out.println(p.toString());
        }
    }
}
