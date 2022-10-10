public class TarjetaCredito {

    int maxCoutas = 0;
    String nombreTitular = "";
    double saldoImpago = 0.0;
    double saldoConsumido = 0.0;

    public TarjetaCredito (int maxCoutas, String nombreTitular, double saldoImpago, double saldoConsumido){

        this.maxCoutas = maxCoutas;
        this.nombreTitular = nombreTitular;
        this.saldoImpago = saldoImpago;
        this.saldoConsumido = saldoConsumido;

    }
    public double interes( double totalGastado ){

        return 1.0;
    }


    public static void financiacion(Articulo articulo){



    }


}
