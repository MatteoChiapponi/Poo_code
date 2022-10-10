import models.RobotPesado;
import models.SistemaArma;

public class Main {
    public static void main(String[] args) {

        SistemaArma sistemaArma = new RobotPesado(100);
        ((RobotPesado)sistemaArma).defender();

    }
}
