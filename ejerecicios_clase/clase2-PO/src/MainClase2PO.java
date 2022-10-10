import java.sql.SQLOutput;
import java.util.Scanner;

import static Sincronico.Sincronico.*;

public class MainClase2PO {

    public static void main(String[] args) {

        Scanner numUsuario = new Scanner(System.in);
        System.out.println("ingrese un numero para ver si es primo: ");
        System.out.println( esDivisor(numUsuario.nextInt()));
        Scanner numerosUsuario = new Scanner(System.in);
        System.out.println("ingrese los 3 valores: ");
        System.out.println(mayorTresnumero(numerosUsuario.nextInt(),numerosUsuario.nextInt(),numerosUsuario.nextInt()));
        Scanner stringsUsuario = new Scanner(System.in);
        System.out.println("ingrese los 2 strings ");
        System.out.println(cadenasDeTextoDistintas(stringsUsuario.nextLine(), stringsUsuario.nextLine()));
    }

}

