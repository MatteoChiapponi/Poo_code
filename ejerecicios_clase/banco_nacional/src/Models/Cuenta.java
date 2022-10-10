package Models;

public abstract class Cuenta {

    private double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public abstract void depositarEfectivo(double monto);
    public abstract void extraeEfectivo(double monto);
    public double getSaldo() {return saldo;}

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
