package Sincronico;

public class Sincronico {
    public static boolean esDivisor(int n) {

        int contador = 0;

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                contador++;
            }
        }
        if (contador == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static Integer mayorTresnumero( Integer num1, Integer num2, Integer num3){

        int acc;

        if (num1 > num2){
            acc = num1;
        }else {
            acc = num2;
        }if (acc > num3){
            return acc;
        }else {
            return num3;
        }
    }
    public static boolean cadenasDeTextoDistintas(String string1, String string2){

        if (string1.equals(string2)) {

            return false;
        }else {
            return true;
        }
    }
}
