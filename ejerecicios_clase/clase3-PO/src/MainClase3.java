import java.util.Scanner;

public class MainClase3 {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {


        // DistribuidoraAlimentos
       /*
        System.out.println("ingresa el nombre de tu perro: ");
        String nombrePerro = teclado.nextLine();
        System.out.println("ingresa la cantidad de alimento que necesitas en kg: ");
        int cantidadAlimento = teclado.nextInt();
        System.out.println(cuantoCome(nombrePerro, cantidadAlimento));

        // Desafio1

        System.out.println("ingresa los nombres de los jugadores: ");
        System.out.println(piedraPapelTijera(teclado.nextLine(), teclado.nextLine()));
        */

        // Desafio3

        mostradorPrimos(teclado.nextInt());


    }
    public static void  mostradorPrimos ( int maxMostrar ){


        for (int i= 0; i <= maxMostrar; i++){

            if (i >= maxMostrar){
                return;
            }

            for (int j = 0; j <= maxMostrar; j+=2){

                System.out.println(j);

            }

        }

    }

}
