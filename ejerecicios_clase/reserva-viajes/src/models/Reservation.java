package models;

public class Reservation {

    private String code;
    private Route route;
    private Integer numberPeople;
    private double precioBoleto;


    public Reservation(String code, Route route, Integer numberPeople) {
        this.code = code;
        this.route = route;
        this.numberPeople = numberPeople;
    }

    public double calcularPrecioReserva(){

        precioBoleto = 50.0;
        double totalReserva;

        if (route.esCabeceraAcabecera()) {

            precioBoleto = precioBoleto * 0.8;
            totalReserva = precioBoleto * numberPeople;
            return totalReserva;
        }
        else
            totalReserva = precioBoleto * numberPeople;
            return totalReserva;
    }

    public Route getRoute() {
        return route;
    }
}
