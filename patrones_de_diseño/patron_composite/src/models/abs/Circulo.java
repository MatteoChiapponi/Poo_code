package models.abs;

public class Circulo extends Figura {

    public Circulo(String codigo, Double radio) {
        super(codigo);
        this.radio = radio;
    }

    private Double radio;

    @Override
    public Double calcularArea() {
        return Math.pow(radio,2) * Math.PI;
    }
}
