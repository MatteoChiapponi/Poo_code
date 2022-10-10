package AbsModels;

import Models.Duenio;

import java.time.LocalDate;

public abstract class Vehiculo {

    private Duenio duenio;
    private String marca;
    private String patente;
    private double cotizacion;
    private LocalDate Adquirido;
    private boolean esNacional;

    public Vehiculo(Duenio duenio, String marca, String patente, double cotizacion, LocalDate adquirido, boolean esNacional) {
        this.duenio = duenio;
        this.marca = marca;
        this.patente = patente;
        this.cotizacion = cotizacion;
        Adquirido = adquirido;
        this.esNacional = esNacional;
    }

    public boolean esNacional(){

        if (esNacional) {
            System.out.println("si tu auto es de una industria nacional");
            return true;
        }else {
            System.out.println("tu auto no es de una industria nacional");
            return false;
        }
    }
}
