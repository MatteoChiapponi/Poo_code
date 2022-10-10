package models;

public class RobotPesado extends SistemaArma implements Volador, Luchador{

    public RobotPesado(Integer energia) {
        super(energia);
    }

    @Override
    public void atacar() {
        System.out.println("atacando");
    }

    @Override
    public void defender() {

        System.out.println("defendiedno");
    }

    @Override
    public void volar() {
        System.out.println("volando");
    }
}
