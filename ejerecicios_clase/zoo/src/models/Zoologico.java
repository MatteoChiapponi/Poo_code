package models;

import java.util.ArrayList;

public class Zoologico {

    private ArrayList<Animal> animalesZoo;

    public Zoologico() {
        animalesZoo = new ArrayList<Animal>();
    }
    public void agregarAnimal(Animal animal){

        animalesZoo.add(animal);

    }
}
