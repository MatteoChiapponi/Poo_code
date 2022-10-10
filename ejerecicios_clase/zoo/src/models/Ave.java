package models;

public abstract class Ave extends Oviparo implements PonerHuevos, RomperCascaron {
    public Ave(String nombre, int edad) {
        super(nombre, edad);
    }
    public void volar(){
        System.out.println("estoy volando");
    }

    @Override
    public void romperCascaron() {
        System.out.println("estoy rompiendo el cascaron");
    }

    @Override
    public void ponerHuevos() {
        System.out.println("estoy poniendo huevos");
    }
}
