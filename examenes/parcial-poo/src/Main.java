import AbsModels.Vehiculo;
import Models.Automovil;
import Models.Camion;
import Models.Duenio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate fechaAdquiridoV1 = LocalDate.now();
        LocalDate fechaAdquiridoV2 = LocalDate.parse("2010-09-23");
        Duenio duenio1 = new Duenio("matteo","chiapponi", 208);
        Vehiculo vehiculo1 = new Automovil(duenio1,"Renault","uox 925", 100000.67, fechaAdquiridoV1, false,1100,true);
        vehiculo1.esNacional();
        System.out.println(((Automovil)vehiculo1).esEconomico());
        Duenio duenio2 = new Duenio("ramon","lentini",209);
        Vehiculo vehiculo2 = new Camion(duenio2, "merecedez", "lng 784", 2000000,fechaAdquiridoV2,false,10, 6 );
        Duenio duenio3 = new Duenio("ramon","lentini",209);
        Vehiculo vehiculo3 = new Camion(duenio2, "merecedez", "asd 345", 2000000,fechaAdquiridoV2,false,12, 6 );
        System.out.println(((Camion)vehiculo2).compareTo(((Camion)vehiculo3)));
    }
}
