package models;

public abstract class Mamifero extends Animal{

    private int cantidadCrias;

    public Mamifero(String nombre, int edad) {
        super(nombre, edad);
    }

    public abstract void amantar();

    public void parir() {
        System.out.println("estoy pariendo");
    }


}
