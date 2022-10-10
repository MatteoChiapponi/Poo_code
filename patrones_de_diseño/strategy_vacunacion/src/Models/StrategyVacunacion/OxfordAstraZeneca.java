package Models.StrategyVacunacion;

import Models.Paciente;

public class OxfordAstraZeneca extends Vacuna{
    private int hola;
    public OxfordAstraZeneca(String nombre, String origen, int cantidadDosis) {
        super(nombre, origen, cantidadDosis);
    }

    @Override
    public void vacunacionStrategy(Paciente paciente) {
        super.vacunacionStrategy(paciente);
    }

    @Override
    public void efectoSecundario() {
        System.out.println("tos");
    }

}
