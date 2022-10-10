package models;

public class Repuesto {

    private String nombreRepuesto;
    private Double precioRepuesto;

    public Repuesto(String nombreRepuesto, Double precioRepuesto) {
        this.nombreRepuesto = nombreRepuesto;
        this.precioRepuesto = precioRepuesto;
    }
    public Double getPrecioRepuesto() {
        return precioRepuesto;
    }
}
