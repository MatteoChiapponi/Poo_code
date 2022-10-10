package models;

import models.abs.Product;

public class Pelota extends Product {
    private Double radio;

    public Pelota(Double peso, Double radio) {
        super(peso);
        this.radio = radio;
    }

    @Override
    public double calcularEspacio() {
        double volumenTotal = 0.0;
        volumenTotal = 4d/3d * Math.PI * radio * radio * radio;
        return volumenTotal;
    }
}
