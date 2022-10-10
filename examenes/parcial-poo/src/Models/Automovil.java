package Models;

import AbsModels.Vehiculo;

import java.time.LocalDate;

public class Automovil extends Vehiculo {

    private double cantidadCilindros;
    private boolean usaGas;

    public Automovil(Duenio duenio, String marca, String patente, double cotizacion, LocalDate adquirido, boolean esNacional, double cantidadCilindros, boolean usaGas) {
        super(duenio, marca, patente, cotizacion, adquirido, esNacional);
        this.cantidadCilindros = cantidadCilindros;
        this.usaGas = usaGas;
    }

    public boolean esEconomico(){

        if (usaGas || cantidadCilindros < 1200)
            return true;
        else
            return false;

    }
}
