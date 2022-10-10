package ejercicio2;

import java.util.ArrayList;

public class Employed {

    private String nombre;
    private int dni;
    private Double sueldo;
    
    private ArrayList<AvaliablePlayer> jugadoresComprados;

    public Employed(String nombre, int dni, Double sueldo) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = sueldo;
        jugadoresComprados = new ArrayList<>();
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void cobrarSueldo(double sueldo){

        System.out.println("tenes disponibe para cobrar: "+ sueldo);

    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }
}
