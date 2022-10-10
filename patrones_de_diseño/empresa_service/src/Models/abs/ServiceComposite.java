package Models.abs;

public abstract class ServiceComposite {

    private String nombre;
    private String descripcion;

    public ServiceComposite(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public abstract Double calcularPrecio();

    public String getNombre() {
        return nombre;
    }
}
