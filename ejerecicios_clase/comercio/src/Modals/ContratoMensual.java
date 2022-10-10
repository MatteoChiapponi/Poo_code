package Modals;

import java.time.LocalDate;

public class ContratoMensual extends Contrato{

    private double salarioMensaual;
    private String cargo;

    public ContratoMensual(int duracion, LocalDate fechaInicio, boolean estaSellado, double salarioMensaual, String cargo) {
        super(duracion, fechaInicio, estaSellado);
        this.salarioMensaual = salarioMensaual;
        this.cargo = cargo;
    }

    @Override
    public double calcularSueldo() {
        return 0;
    }

    public boolean esJEfe(){
        if (cargo.equals("jefe"))
            return true;
        else
            System.out.println("no es jefe es: "+cargo);
            return false;
    }
}
