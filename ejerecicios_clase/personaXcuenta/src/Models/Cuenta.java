package Models;

public class Cuenta implements Comparable<Cuenta> {
    private Integer nroCuenta;
    private Double saldo;

    public Cuenta(Integer nroCuenta, Double saldo) {
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }

    @Override
    public int compareTo(Cuenta o) {
        return nroCuenta.compareTo(o.nroCuenta);
    }

    public Double getSaldo() {
        return saldo;
    }

    public Integer getNroCuenta() {
        return nroCuenta;
    }
}
