package sincronico;
import java.util.Scanner;
public class DistribuidoraAlimento {
    private static Scanner teclado = new Scanner(System.in);
    public static String cuantoCome(String nombre, int cantidadAlimento){

        int acc2 = 0;
        double resta = 0.0;
        double acc = 0.0;

        while (acc <= cantidadAlimento){
            System.out.println("ingresa la cantidad en KG de cada paquete que neceitas: ");
            acc += teclado.nextDouble();
            acc2++;
        }
        if ( acc > cantidadAlimento){

            resta = acc - cantidadAlimento;

        }

        return nombre + " necesita " + acc2 + " paquetes pero te pasaste " + resta + " kg";
    }

    /*
    Hacé un programa que te permita jugar a “Piedra, papel o tijera”. En primer lugar, la
aplicación solicita el nombre de cada gamer, después empieza el juego. El juego consiste
en pedir qué opción elije cada uno y sumar puntos al winner —si lo hay—. Definí y utilizá
una función llamada cualGana con dos parámetros con las jugadas de cada uno, que
devuelve 0 en caso de empate, 1 si gana el primero, 2 si gana el segundo. El juego termina
cuando el primero elije “*” como indicador de final.
*/



    /*

Desafío 4

Por cuestiones laborales, se pueden trabajar hasta 40 horas semanales, si se trabajan más
horas las mismas se consideran horas extras cuyo valor es un 50% más que las horas de
trabajo normales. Crear un programa que pueda informar si el sueldo semanal de la
programadora Julieta. Ella trabajó en la última semana “x” cantidad de horas y el valor de la
hora semanal es de 875.
¡Ahora es tu turno!
¡Hasta la próxima!

     */



}
