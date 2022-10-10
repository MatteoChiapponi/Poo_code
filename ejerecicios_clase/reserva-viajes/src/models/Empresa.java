package models;

import exceptions.EmpresaException;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    List<Reservation> reservations;

    public Empresa(){
        reservations = new ArrayList<>();
    }

    public void agregarReserva(Reservation r){
        reservations.add(r);
    }

    public double recaudacionTotal(){
        double recaudacionTotal = 0.0;
        for (Reservation r:reservations) {
            recaudacionTotal += r.calcularPrecioReserva();
        }
        return recaudacionTotal;
    }

    public int cantidadVecesRecorrida(String station) throws Exception{

        int acc = 0;
        for (Reservation r:reservations) {
            if (!r.getRoute().getAvaibleRoute().contains(station))
               throw new EmpresaException("no ingresaste una estacion valida");

            if(r.getRoute().getDepartureStation().equals(station) || r.getRoute().getDestinationStation().equals(station))
                acc += 1;
        }
        return acc;
    }


}
