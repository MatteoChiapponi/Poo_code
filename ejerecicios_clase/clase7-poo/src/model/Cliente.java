package model;

import java.util.ArrayList;

public class Cliente {

    private String nombre;
    private String telefono;
    private String domicilio;

    private ArrayList<Pedido> pedidos;

    public Cliente(String nombre, String telefono, String domicilio) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.domicilio = domicilio;
        pedidos = new ArrayList<>();
    }

    public void agregarPedido (Pedido pedido){

        pedidos.add(pedido);

    }
}
