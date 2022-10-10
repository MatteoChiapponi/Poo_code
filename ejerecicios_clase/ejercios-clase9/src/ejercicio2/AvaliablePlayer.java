package ejercicio2;

import java.util.ArrayList;

public class AvaliablePlayer {


    private ArrayList<Player> jugadores;

    public AvaliablePlayer(){

        jugadores = new ArrayList<>();
        jugadores.add(new Player("mateo", 12234, 200000.0, true, 10, 2000.00, "delantero" ));
        jugadores.add(new Player("jesu", 12334, 100000.0, false, 2 , 2000.00, "central" ));
        jugadores.add(new Player("teo", 12354, 20000.0, false, 3 , 2000.00, "medio campista" ));
        jugadores.add(new Player("nico", 12634, 300000.0, true, 9, 2000.00, "lateral"  ));

    }

   public Player getJugador(int dni){

       for (Player j:jugadores) {

           if (j.getDni() == dni)

               return j;

       }
       return null;

   }


}
