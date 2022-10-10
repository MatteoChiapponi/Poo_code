package Models.abs;

public class ServiceSimple extends ServiceComposite{
    private Double precioBase;
    private Boolean necesitaColocacion;

    public ServiceSimple(String nombre, String descripcion, Double precioBase, Boolean necesitaColocacion) {
        super(nombre, descripcion);
        this.precioBase = precioBase;
        this.necesitaColocacion = necesitaColocacion;
    }


    @Override
    public Double calcularPrecio() {
        if (necesitaColocacion)
            return precioBase * 1.1;
        return precioBase;
    }
}
