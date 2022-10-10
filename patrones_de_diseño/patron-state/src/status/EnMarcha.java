package status;

import models.Auto;
import models.StateAuto;

public class EnMarcha implements StateAuto {
    private final int velocidadMaxima = 200;
    private Auto vehiculo;
    public EnMarcha(Auto v){
        this.vehiculo = v;
    }
    @Override
    public void acelerear() {
        if (vehiculo.getCombustibleActual() > 0){
            if (vehiculo.getVelocidadActual() >= velocidadMaxima){
                System.out.println("no podes acelerar mas");
            }
            else{
            vehiculo.setCombustibleActual(vehiculo.getCombustibleActual()- 10);
            vehiculo.setVelocidadActual(vehiculo.getVelocidadActual() + 10);
                System.out.println("te vas franchesca " + vehiculo.getState().getClass().getSimpleName());
            }
        }
        else {
            vehiculo.setState(new SinNafta(vehiculo));
            System.out.println("no tenes nafta hno " + vehiculo.getState().getClass().getSimpleName());
        }
    }
    @Override
    public void contacto() {
        System.out.println("ya estas andando hno no podes volver al contacto");
    }
    @Override
    public void frenar() {
        vehiculo.setVelocidadActual(vehiculo.getVelocidadActual() - 10);
        System.out.println("estas frenando");
        if (vehiculo.getVelocidadActual() <= 0){
            vehiculo.setState(new Parado(vehiculo));
            System.out.println("te franaste del todo hno ahora estas parado");
        }
    }
}
