package models;

public class Yate extends Embarcacion implements Comparable<Yate>{
    private int cantidadCamarotes;

    public Yate(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, int slora, int cantidadCamarotes) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, slora);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    @Override
    public int compareTo(Yate o) {
        return cantidadCamarotes - o.cantidadCamarotes;
    }
}
