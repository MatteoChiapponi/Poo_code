package models;

public class Tanque extends SistemaArma implements Luchador{

    public Tanque(Integer energia) {
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

}
