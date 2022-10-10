import models.Animal;
import models.Leon;
import models.Ornitorinco;
import models.Zoologico;

public class Main {
    public static void main(String[] args) {
        Zoologico zoologico = new Zoologico();
        Animal animal = new Ornitorinco("perri", 23);
        Animal animal1 = new Leon("simba", 21);
        ((Ornitorinco) animal).ponerHuevos();
        zoologico.agregarAnimal(animal);
        System.out.println(animal.compareTo(animal1));
    }

}
