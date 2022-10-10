import Modals.Contrato;
import Modals.ContratoMensual;
import Modals.Empleado;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate fechaInicio = LocalDate.parse("2015-07-23");

        Contrato contrato1 = new ContratoMensual(12,fechaInicio, true, 123000,"jefe" );
        Empleado empleado1 = new Empleado("mateo", "chiapponi", 45184390,18, contrato1);
        System.out.println(((ContratoMensual)contrato1).esJEfe());
    }
}
