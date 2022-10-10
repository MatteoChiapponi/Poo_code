package ejercicio2;

import java.util.ArrayList;

public class President extends Employed{

    private String titulo;
    private int extraSueldo;

    private double disponibleCompraJugadores;


    private ArrayList<Player> jugadoresComprados;


    public President(String nombre, int dni, Double sueldo, String titulo, int extraSueldo, double disponibleCompraJugadores) {
        super(nombre, dni, sueldo);
        jugadoresComprados = new ArrayList<>();
        this.titulo = titulo;
        this.extraSueldo = extraSueldo;
        this.disponibleCompraJugadores = disponibleCompraJugadores;
        this.jugadoresComprados = jugadoresComprados;
    }


    @Override

    public void cobrarSueldo(double sueldo){

       double sueldoAcobrar = sueldo + ((extraSueldo/100) * sueldo);
        System.out.println(sueldoAcobrar);

    }


    public void comprarJugador(AvaliablePlayer jugadoresDisponibles, int dni){

        Player jugador = jugadoresDisponibles.getJugador(dni);

        if (jugador.getPrecio() <= disponibleCompraJugadores) {
            double resta = disponibleCompraJugadores - jugador.getPrecio();
            System.out.println("felicitaciones te alcanzo para fichar a " + jugador.getNombre() + " y te sobran " + resta + " para seguir fichado jugadores");
            jugadoresComprados.add(jugador);
        }else
            System.out.println("no te alcanzo para ficar a nadie");


    }

    public ArrayList<Player> getJugadoresComprados() {
        return jugadoresComprados;
    }
}
