package models;

import java.util.ArrayList;

public class Route {

    private String destinationStation;
    private String departureStation;
    private  ArrayList<String> avaibleRoute = new ArrayList<>();

    public Route(String destinationStation, String departureStation) {

        avaibleRoute.add(buenosAires);
        avaibleRoute.add(lujan);
        avaibleRoute.add(mercedes);
        avaibleRoute.add(suipacha);
        avaibleRoute.add(chivilcoy);
        avaibleRoute.add(alberdi);
        avaibleRoute.add(bragado);
        this.destinationStation = destinationStation;
        this.departureStation = departureStation;

    }
    public boolean esCabeceraAcabecera(){

            if (departureStation.equals(buenosAires) && destinationStation.equals(bragado))
                return true;
            if (destinationStation.equals(buenosAires) && departureStation.equals(bragado))
                return true;
            else
                 return false;
    }

    public String getDestinationStation() {
        return destinationStation;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public ArrayList<String> getAvaibleRoute() {
        return avaibleRoute;
    }

    public static final String buenosAires = "buenos aires";
    public static final String lujan = "lujan";
    public static final String mercedes = "mercedes";
    public static final String suipacha = "suipacha";
    public static final String chivilcoy = "chivilcoy";
    public static final String alberdi = "alberdi";
    public static final String bragado = "bragado";



}
