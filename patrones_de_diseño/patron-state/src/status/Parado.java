package status;

import models.Auto;
import models.StateAuto;

public class Parado implements StateAuto {
    private Auto vehiculo;

    public Parado(Auto v){
        this.vehiculo = v;
    }
    @Override
    public void acelerear() {
        if (vehiculo.getCombustibleActual() > 0){
            vehiculo.setState(new EnMarcha(vehiculo));
            System.out.println("el vehiculo esta en movimiento");
            vehiculo.setCombustibleActual(vehiculo.getCombustibleActual()-10);
            vehiculo.setVelocidadActual(vehiculo.getVelocidadActual() + 10);
        }
        else {
            vehiculo.setState(new SinNafta(vehiculo));
            System.out.println("no tenes nafta hno");
        }
    }

    @Override
    public void contacto() {

    }

    @Override
    public void frenar() {

    }
}
