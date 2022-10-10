package models;

import models.abs_composite.CompositePizza;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria {
    private String nombre;
    private List<CompositePizza> pizzaList;

    public Pizzeria(String nombre) {
        this.nombre = nombre;
        pizzaList = new ArrayList<>();
    }

    public void addPizza(CompositePizza pizza){
        pizzaList.add(pizza);
    }

    public void mostrarPizzaSiomple(){
        for (CompositePizza pl:pizzaList) {
            System.out.println(pl.getNombre());
            System.out.println(pl.calcularPrecio());
        }
    }
}
