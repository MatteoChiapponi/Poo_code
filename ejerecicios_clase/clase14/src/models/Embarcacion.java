package models;

import java.time.LocalDate;

public abstract class Embarcacion {
    private Capitan capitan;
    private double precioBase;
    private double valorAdicional;
    private int anioFabricacion;
    private int slora;

    public Embarcacion(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, int slora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.slora = slora;
    }

    public double calcularAlquiler(){
        double total;
        if (anioFabricacion > 2020)
            total = precioBase + valorAdicional;
        else
            total = precioBase;

        return total;
    }
}
