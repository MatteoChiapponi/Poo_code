public class Cliente {

    String nombreTitular = "";
    boolean tarjetaCredito;
    boolean tarjetaDebito;

    public Cliente (String nombreTitular, boolean tarjetaCredito, boolean tarjetaDebito) {
        this.nombreTitular = nombreTitular;
        this.tarjetaCredito = tarjetaCredito;
        this.tarjetaDebito = tarjetaDebito;
    }

    public double consultarSaldo(String nombreTitular){



        return 1.0;

    }
    public void consultarFinanciacion(){

        System.out.println();

    }
    public void consultarInteres(){


        System.out.println();
    }

    public void realizarDeposito(){


    }

    public String comprarArticulo(String nombreArticulo){

        return nombreArticulo;
    }
}
