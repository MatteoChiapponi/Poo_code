import models.Capitan;
import models.Embarcacion;
import models.Yate;

public class Main {
    public static void main(String[] args) {
        Capitan capitan1 = new Capitan("mateo", "chiapponi", 123456);
        Capitan capitan2 = new Capitan("leandro", "gimenez", 678910);
        Embarcacion yate1 = new Yate(capitan1, 1233.9,334.8, 2021, 5,6);
        Embarcacion yate2 = new Yate(capitan2, 234234.5,200, 2019, 4, 4);
        System.out.println(yate1.calcularAlquiler());
        System.out.println(yate2.calcularAlquiler());
        System.out.println(((Yate)yate1).compareTo(((Yate) yate2)));


    }
}
