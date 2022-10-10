package status;

import models.Auto;
import models.StateAuto;

public class SinNafta implements StateAuto {

    private Auto sinNafta;

    public SinNafta(Auto v){
        this.sinNafta = v;
    }
    @Override
    public void acelerear() {
        System.out.println("no tenes nafta maestro");
    }
    @Override
    public void contacto() {
        System.out.println("no tenes nafta maestro");
    }
    @Override
    public void frenar() {
        System.out.println("no tenes nafta maestro como queres frenar");
    }
}
