package Modals;

import java.time.LocalDate;

public class ContratoXhora extends Contrato implements Comparable<ContratoXhora>{

    private int cantidadHoras;
    private double valorHora;

    public ContratoXhora(int duracion, LocalDate fechaInicio, boolean estaSellado, int cantidadHoras, double valorHora) {
        super(duracion, fechaInicio, estaSellado);
        this.cantidadHoras = cantidadHoras;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSueldo() {
        return 0;
    }

    @Override
    public int compareTo(ContratoXhora o) {
        return cantidadHoras - o.cantidadHoras;
    }
}
