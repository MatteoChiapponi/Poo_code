package sincronico;

import java.util.Scanner;

public class Desafio3 {

    public static Scanner teclado = new Scanner(System.in);

    public static void  mostradorPrimos ( int maxMostrar ){

        maxMostrar = teclado.nextInt();

        for (int i= 0; i <= 100; i++){

            if (i <= maxMostrar){
                return;
            }

         for (int j = 1; j < maxMostrar; j+=2){

             System.out.println(j);

         }

            }

        }

    }

