package Models.StrategyVacunacion;

import Models.Paciente;

public abstract class Vacuna {
    private String nombre;
    private String origen;
    private int cantidadDosis;

    public Vacuna(String nombre, String origen, int cantidadDosis) {
        this.nombre = nombre;
        this.origen = origen;
        this.cantidadDosis = cantidadDosis;
    }
    public  void vacunacionStrategy(Paciente paciente){
        if (paciente.getCantidadDosisAplicadas() < cantidadDosis){
            System.out.println("el paciente se puede vacunar");
            paciente.setCantidadDosisAplicadas(paciente.getCantidadDosisAplicadas()+1);
        }
        else
            System.out.println("ya tenes todas las dosis aplicadas");
    }
    public abstract void efectoSecundario();
}
