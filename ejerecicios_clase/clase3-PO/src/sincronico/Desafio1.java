package sincronico;

import java.util.Scanner;

public class Desafio1 {

    static int accJugador1 = 0;

    static int accJugador2 = 0;
    private static Scanner teclado = new Scanner(System.in);

    public static String piedraPapelTijera( String jugador1, String jugador2){

        String opcionJ1 = "";
        String opcionJ2 = "";
        while(!opcionJ1.equals("*") && !opcionJ2.equals("*")){

            System.out.println("elegi la opcion del jugador 1");
            opcionJ1 = teclado.nextLine();
            System.out.println("elegi la opcion del jugador 2");
            opcionJ2 = teclado.nextLine();

            System.out.println(cualGana(opcionJ1, opcionJ2));
        }

        return "el ganador fue " + cualGana(opcionJ1, opcionJ2);

    }

    public static String cualGana(String opcionJugador1, String opcionDelJugador2) {


        if ( opcionJugador1.equals("piedra") && opcionDelJugador2.equals("papel")){
            System.out.println("ganador jugador 2");
            accJugador2 = accJugador2 + 1;
        }
        else if (opcionJugador1.equals("papel") && opcionDelJugador2.equals("piedra")){
            System.out.println("ganador jugador 1");
            accJugador1 = accJugador1 + 1;
        }
        else if (opcionJugador1.equals("tijera") && opcionDelJugador2.equals("papel")){
            System.out.println("ganador jugador 1");
            accJugador1 = accJugador1 + 1;
        }
        else if (opcionJugador1.equals("papel") && opcionDelJugador2.equals("tijera")) {

            System.out.println("ganador jugador 2");
            accJugador2 = accJugador2 + 1;
        }
        else if (opcionJugador1.equals("piedra") && opcionDelJugador2.equals("tijera")){
            System.out.println("ganador jugador 1");
            accJugador1 = accJugador1 + 1;

        }

        else if (opcionJugador1.equals("tijera") && opcionDelJugador2.equals("piedra")){
            System.out.println("ganador jugador 2");
            accJugador2 = accJugador2 + 1;
        }
        else System.out.println("ninhuno de las opciones es correcta ");

        System.out.println("puntaje jugador 1:  " + accJugador1);
        System.out.println("puntaje jugador 2:  " + accJugador2);

        if(accJugador1 > accJugador2){

            return "el ganador es el jugador 1 con un total de " + accJugador1;
        }else {

            return "el ganador es el jugador 2 con un total de " + accJugador2;
        }

    }

}
