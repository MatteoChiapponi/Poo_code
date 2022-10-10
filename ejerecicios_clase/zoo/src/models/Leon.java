package models;

public class Leon extends Felino{

    public Leon(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void amantar() {
        System.out.println("esto amamantando como un leon");
    }
}
