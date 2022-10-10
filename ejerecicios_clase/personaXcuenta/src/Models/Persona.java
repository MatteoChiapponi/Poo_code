package Models;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private String apellido;
    private Integer edad;
    private List<Cuenta> cantidadCuentas;

    public Persona(String nombre, String apellido, Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        cantidadCuentas = new ArrayList<>();
    }
    public void agregarCuenta(Cuenta cuenta){
        cantidadCuentas.add(cuenta);
    }
    public String getNombreCompleto(){
        return nombre + " " + apellido;
    }
    public boolean esMayorDeEdad(){
        if (edad > 60)
            return true;
        return false;
    }
    public double getSaldoTotal(){
        double saldoTotal = 0.0;
        for (Cuenta c:cantidadCuentas) {
            saldoTotal += c.getSaldo();
        }
        return saldoTotal;
    }
    public void mostrarCuenta(){
        ArrayList<Cuenta> cuentasOrdenadas = new ArrayList<>();
        for (Cuenta cuenta:cantidadCuentas) {
            cuentasOrdenadas.add(cuenta);
        }
        cuentasOrdenadas.sort(Cuenta::compareTo);
        for (Cuenta c:cuentasOrdenadas) {
            System.out.println(c.getSaldo());
        }
    }

}
