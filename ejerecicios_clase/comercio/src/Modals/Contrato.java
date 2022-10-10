package Modals;

import java.time.LocalDate;

public abstract class Contrato {
    private int duracion;
    private LocalDate fechaInicio;
    private boolean estaSellado;

    public Contrato(int duracion, LocalDate fechaInicio, boolean estaSellado) {
        this.duracion = duracion;
        this.fechaInicio = fechaInicio;
        this.estaSellado = estaSellado;
    }

    public boolean puedeTrabajar(){

        if (estaSellado)
            return true;
        else
            return false;
    }
    public abstract double calcularSueldo();

}
