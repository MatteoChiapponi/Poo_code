package Models;

public class CuentaAhorro extends Cuenta{

    private double tasaInteres;


    public CuentaAhorro(double saldo, double tasaInteres) {
        super(saldo);
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void depositarEfectivo(double monto) {
        double actualizarSaldo = getSaldo() + monto;
        setSaldo(actualizarSaldo);
    }

    @Override
    public void extraeEfectivo(double monto) {

        double resta = 0.0;
        if (monto <= getSaldo()) {
            resta = monto - getSaldo();
            setSaldo(resta);
            System.out.println("pudiste extraer lo solicitado: " + monto + "y te quedan dispobibles: " + resta);
        }
            else
            System.out.println("el monto es mayor que tu disponible");

    }
    public void cobrarInteres(){
        double interes = getSaldo() + ((tasaInteres/100)*getSaldo());
        setSaldo(interes);
        System.out.println("interes cobrado correctamente: " + getSaldo());
    }
}
