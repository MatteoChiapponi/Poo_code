package models.abs;

public class TrianguloR extends Figura{
    public TrianguloR(String codigo, Double base, Double altura) {
        super(codigo);
        this.base = base;
        this.altura = altura;
    }

    private Double base;
    private Double altura;

    @Override
    public Double calcularArea() {
        return base * altura / 2;
    }
}
