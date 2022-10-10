package models.abs_composite;

public abstract class CompositePizza {
    private String nombre;
    private String descripcion;

    public CompositePizza(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public abstract Double calcularPrecio();

    public String getNombre() {
        return nombre;
    }
}
