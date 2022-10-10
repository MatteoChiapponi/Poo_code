package models;

public class RoborLiviano extends SistemaArma implements Volador, Luchador{

    public RoborLiviano(Integer energia) {
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
