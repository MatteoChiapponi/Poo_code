package models;

public class Velero extends Embarcacion{
    private int cantidadMastiles;

    public Velero(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, int slora, int cantidadMastiles) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, slora);
        this.cantidadMastiles = cantidadMastiles;
    }
    public boolean esGrande(){
        if (cantidadMastiles > 4)
            return true;
        else
            return false;
    }
}
