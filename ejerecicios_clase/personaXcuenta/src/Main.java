import Models.Cuenta;
import Models.Persona;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Matteo", "Chiapponi", 18);
        Cuenta cuenta1 = new Cuenta(1,1001.0);
        Cuenta cuenta2 = new Cuenta(2,1002.0);
        Cuenta cuenta3 = new Cuenta(3,1003.0);
        persona1.agregarCuenta(cuenta3);
        persona1.agregarCuenta(cuenta1);
        persona1.agregarCuenta(cuenta2);
        System.out.println(persona1.getNombreCompleto());
        System.out.println(persona1.esMayorDeEdad());
        System.out.println(persona1.getSaldoTotal());
        persona1.mostrarCuenta();
    }
}
