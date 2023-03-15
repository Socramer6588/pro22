/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ev2.boletin3.ejercicio4;

import java.util.ArrayList;

/**
 *
 * @author nccasares
 */
public class Pedido {
    private Cliente cliente;
    private ArrayList<LineaPedido> lineas;

    public Pedido(Cliente cliente, ArrayList<LineaPedido> lineas) {
        this.cliente = cliente;
        this.lineas = lineas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<LineaPedido> getLineas() {
        return lineas;
    }

    public void setLineas(ArrayList<LineaPedido> lineas) {
        this.lineas = lineas;
    }

    @Override
    public String toString() {
        return "Pedido{" + "cliente=" + cliente.toString() + ", lineas=" + lineas.toString() + '}';
    }
    
}
