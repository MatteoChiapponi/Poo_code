package Models;

import java.util.ArrayList;

public class Cliente {

    private int numeroCliente;
    private String apellido;
    private int dni;
    private int cuit;
    private ArrayList<Cuenta> cuentaCliente;

    public Cliente(int numeroCliente, String apellido, int dni, int cuit) {
        cuentaCliente = new ArrayList<>();
        this.numeroCliente = numeroCliente;
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;
    }
    public void agregarCuenta(Cuenta cuenta){
        cuentaCliente.add(cuenta);
    }

}
