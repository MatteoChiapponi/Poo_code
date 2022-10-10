import java.util.Date;

public class MainClase4 {

    public static void main(String[] args) {

    Articulo articulo1 = new Articulo("computadora",1, new Date(116,12,21),new Date(126,12,22), 12, 1000);
    Cliente cliente1 = new Cliente("Matteo Chiapponi", true, false);

    cliente1.comprarArticulo("computadora");



    }

}
