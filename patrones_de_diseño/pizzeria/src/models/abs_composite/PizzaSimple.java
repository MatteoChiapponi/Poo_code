package models.abs_composite;

public class PizzaSimple extends CompositePizza{
    private Boolean esGrande;
    private Double precioBase;

    public PizzaSimple(String nombre, String descripcion, Boolean esGrande, Double precioBase) {
        super(nombre, descripcion);
        this.esGrande = esGrande;
        this.precioBase = precioBase;
    }

    @Override
    public Double calcularPrecio() {
        if (esGrande)
            return precioBase * 2;
        return precioBase;
    }

    public Double getPrecioBase() {
        return precioBase;
    }
}
