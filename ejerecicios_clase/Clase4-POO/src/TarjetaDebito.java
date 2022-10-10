import java.util.Date;

public class TarjetaDebito {

    int saldo = 0;
    String nombreTitular = "";
    Date vencimiento;

    public void TarjetaCredito ( int saldo, String nombreTitular, Date vencimiento){

        this.saldo = saldo;
        this.nombreTitular = nombreTitular;
        this.vencimiento = vencimiento;

    }

    public double transaccion(){



        return 1.0;

    }

    public double recibirDeposito( double deposito ){


        return 1.0;
    }

}
