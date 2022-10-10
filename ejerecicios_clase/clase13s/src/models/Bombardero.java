package models;

public class Bombardero extends SistemaArma implements Luchador, Volador{
    public Bombardero(Integer energia) {
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
