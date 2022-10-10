package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {

    private String codigo;
    private LocalDate fecha;
    private ArrayList<Articulo> articulos;

    public Pedido(String codigo, LocalDate fecha) {
        this.codigo = codigo;
        this.fecha = fecha;
        articulos = new ArrayList<>();

    }
    public void agregarPedido (Articulo articulo){

        articulos.add(articulo);

    }

}
