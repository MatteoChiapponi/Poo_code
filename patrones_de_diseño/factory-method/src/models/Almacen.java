package models;

import models.abs.Product;

import java.util.ArrayList;
import java.util.List;

public class Almacen {

    private List<Product> products;

    public Almacen() {
        products = new ArrayList<>();
    }

    public void addProduct(Product p){
        products.add(p);
    }

    public Double calcularEspacioNecesario(){

        double espacioNecesario = 0.0;

        for (Product p:products) {
            espacioNecesario += p.calcularEspacio();
        }
        return espacioNecesario;
    }
}
