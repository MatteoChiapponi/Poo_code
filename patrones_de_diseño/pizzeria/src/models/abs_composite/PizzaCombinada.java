package models.abs_composite;

import java.util.ArrayList;
import java.util.List;

public class PizzaCombinada extends CompositePizza{
    private List<CompositePizza> pizzas;

    public PizzaCombinada(String nombre, String descripcion) {
        super(nombre, descripcion);
        pizzas = new ArrayList<>();
    }

    public void addPizza(CompositePizza pizza){
        pizzas.add(pizza);
    }

    @Override
    public Double calcularPrecio() {
        double total = 0.0;
        for (CompositePizza cp: pizzas) {
            total += cp.calcularPrecio();
        }
        total = total / pizzas.size();
        return total;
    }
}
