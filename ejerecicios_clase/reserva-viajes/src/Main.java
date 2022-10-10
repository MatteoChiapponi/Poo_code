import models.Empresa;
import models.Reservation;
import models.Route;

public class Main {
    public static void main(String[] args){

        Route route1 = new Route(Route.buenosAires,Route.bragado);
        Route route2 = new Route("tucuman",Route.alberdi);

        Reservation reservation1 = new Reservation("1234",route1,3);
        Reservation reservation2 = new Reservation("4567",route2,5);

        Empresa empresa1 = new Empresa();
        empresa1.agregarReserva(reservation1);
        empresa1.agregarReserva(reservation2);

        try {
            System.out.println(empresa1.cantidadVecesRecorrida(Route.buenosAires));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println(empresa1.cantidadVecesRecorrida(Route.mercedes));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println(empresa1.cantidadVecesRecorrida("hola"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
