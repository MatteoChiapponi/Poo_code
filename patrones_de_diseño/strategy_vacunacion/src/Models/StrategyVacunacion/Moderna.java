package Models.StrategyVacunacion;

import Models.Paciente;

public class Moderna extends Vacuna{

    public Moderna(String nombre, String origen, int cantidadDosis) {
        super(nombre, origen, cantidadDosis);
    }

    @Override
    public void vacunacionStrategy(Paciente paciente) {
        super.vacunacionStrategy(paciente);
    }
    @Override
    public void efectoSecundario() {
        System.out.println("fiebre");
    }
}
