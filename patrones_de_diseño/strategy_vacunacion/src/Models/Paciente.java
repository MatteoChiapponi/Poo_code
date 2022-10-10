package Models;

import Models.StrategyVacunacion.Vacuna;

public class Paciente {
    private String nombre;
    private int cantidadDosisAplicadas;

    public Paciente(String nombre, int cantidadDosisAplicadas) {
        this.nombre = nombre;
        this.cantidadDosisAplicadas = cantidadDosisAplicadas;
    }
    public void vacunarse(Vacuna vacuna, Paciente paciente){
        vacuna.vacunacionStrategy(paciente);
    }

    public int getCantidadDosisAplicadas() {
        return cantidadDosisAplicadas;
    }

    public void setCantidadDosisAplicadas(int cantidadDosisAplicadas) {
        this.cantidadDosisAplicadas = cantidadDosisAplicadas;
    }
    public void verEfectoSecundarioVacuna(Vacuna vacuna){
        vacuna.efectoSecundario();
    }
}
