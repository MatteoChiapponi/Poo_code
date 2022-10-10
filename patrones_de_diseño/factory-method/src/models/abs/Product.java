package models.abs;

public abstract class Product {

    private Double peso;

    public abstract double calcularEspacio();

    public Product(Double peso) {
        this.peso = peso;
    }

}
