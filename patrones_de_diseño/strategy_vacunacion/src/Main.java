import Models.Paciente;
import Models.StrategyVacunacion.Moderna;

public class Main {
    public static void main(String[] args) {

        Paciente paciente = new Paciente("matteo",0);
        Moderna moderna = new Moderna("vacuna moderna","eeuu", 2);
        paciente.vacunarse(moderna,paciente);
        paciente.vacunarse(moderna,paciente);
        paciente.vacunarse(moderna,paciente);
        paciente.verEfectoSecundarioVacuna(moderna);

        

    }
}
