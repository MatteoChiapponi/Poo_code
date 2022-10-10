package models;

public abstract class Animal implements Comparable<Animal>{
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public int compareTo(Animal o) {
        int resta = this.edad - o.edad;
        return resta;
    }


    public String getNombre() {
        return nombre;
    }
}
