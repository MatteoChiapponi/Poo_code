package status;

import models.Auto;
import models.StateAuto;

public class Apagado implements StateAuto {

    private Auto vehiculo;

    public Apagado(Auto auto) {
        this.vehiculo = auto;
    }

    @Override
    public void acelerear() {
        System.out.println("no puede acelerar porque el auto esta apagado");
    }

    @Override
    public void contacto() {
        if (vehiculo.getCombustibleActual() >  0) {
            vehiculo.setState(new Parado(vehiculo));
            System.out.println("el auto esta encendido " + vehiculo.getState().getClass().getSimpleName());
            vehiculo.setVelocidadActual(0);
        }
        else {
            vehiculo.setState(new SinNafta(vehiculo));
            System.out.println("no tenes nafta hno " + vehiculo.getState().getClass().getSimpleName());
        }
    }
    @Override
    public void frenar() {
        System.out.println("no puede frenar porque esta apagado");
    }
}
