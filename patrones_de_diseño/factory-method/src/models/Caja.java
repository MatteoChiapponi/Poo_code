package models;

import models.abs.Product;

public class Caja extends Product {
    private Double longuitud;
    private Double ancho;
    private Double altura;

    public Caja(Double peso, Double longuitud, Double ancho, Double altura) {
        super(peso);
        this.longuitud = longuitud;
        this.ancho = ancho;
        this.altura = altura;
    }

    @Override
    public double calcularEspacio() {
        double volumenTotal = 0.0;
        volumenTotal = longuitud * ancho * altura;
        return volumenTotal;
    }
}
