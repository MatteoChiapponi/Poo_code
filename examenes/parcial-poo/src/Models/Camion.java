package Models;

import AbsModels.Vehiculo;

import java.time.LocalDate;

public class Camion extends Vehiculo implements Comparable<Camion> {
    private double capacidadCarga;
    private int canrtidadEjes;

    public Camion(Duenio duenio, String marca, String patente, double cotizacion, LocalDate adquirido, boolean esNacional, double capacidadCarga, int canrtidadEjes) {
        super(duenio, marca, patente, cotizacion, adquirido, esNacional);
        this.capacidadCarga = capacidadCarga;
        this.canrtidadEjes = canrtidadEjes;
    }

    @Override
    public int compareTo(Camion o) {
        if (capacidadCarga > o.capacidadCarga)
            return 1;
        else if (capacidadCarga < o.capacidadCarga)
            return -1;
        return 0;
    }
}
