import Models.Cliente;
import Models.Cuenta;
import Models.CuentaAhorro;

public class Main {

    public static void main(String[] args) {

        Cuenta cuenta = new CuentaAhorro(10000, 20.5);
        Cliente cliente = new Cliente(1,"chiapponi",123456,201234568);
        cliente.agregarCuenta(cuenta);
        cuenta.depositarEfectivo(200);
        ((CuentaAhorro) cuenta).cobrarInteres();
        System.out.println(cuenta.getSaldo());



    }

}
