package Models.StrategyVacunacion;

import Models.Paciente;

public class Soberana extends Vacuna{

    public Soberana(String nombre, String origen, int cantidadDosis) {
        super(nombre, origen, cantidadDosis);
    }

    @Override
    public void vacunacionStrategy(Paciente paciente) {
        super.vacunacionStrategy(paciente);
    }
    @Override
    public void efectoSecundario() {
        System.out.println("te moris si te vacunas con esto");
    }
}
