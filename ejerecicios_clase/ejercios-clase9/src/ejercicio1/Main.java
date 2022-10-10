package ejercicio1;

import ejercicio2.AvaliablePlayer;
import ejercicio2.President;

public class Main {

    public static void main(String[] args) {

        AvaliablePlayer j = new AvaliablePlayer();
        President p = new President("mariano",123, 1243.00, "nada", 1234, 200000.00);
        p.comprarJugador(j, 12234);
        System.out.println(p.getJugadoresComprados());

    }

}
