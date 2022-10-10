package models.abs;

public class Rectangulo extends Figura{
    public Rectangulo(String codigo, Double alto, Double largo) {
        super(codigo);
        this.alto = alto;
        this.largo = largo;
    }

    private Double alto;
    private Double largo;
    @Override
    public Double calcularArea() {
        return alto * largo;
    }
}
