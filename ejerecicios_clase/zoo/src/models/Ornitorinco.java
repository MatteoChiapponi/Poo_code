package models;

public class Ornitorinco extends Mamifero implements PonerHuevos, RomperCascaron{

    public Ornitorinco(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void amantar() {
        System.out.println("estoy amamantando como un ornitorinco");
    }

    @Override
    public void ponerHuevos() {
        System.out.println("estoy poniendo huevos como un ornitorinco");
    }

    @Override
    public void romperCascaron() {
        System.out.println("estoy rompiendo el cascaron como un ornitorinco");
    }
}
