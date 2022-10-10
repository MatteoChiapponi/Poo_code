package Modals;

public class Empleado {
    private String nombre;
    private  String apellido;
    private int dni;
    private int edad;
    private Contrato contratoEmpleado;

    public Empleado(String nombre, String apellido, int dni, int edad, Contrato contratoEmpleado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.contratoEmpleado = contratoEmpleado;
    }
}
