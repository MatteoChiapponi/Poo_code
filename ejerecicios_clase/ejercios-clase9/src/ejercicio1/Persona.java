package ejercicio1;

import java.time.LocalDate;

public class Persona {

    private String nombre;
    private int dni;
    private LocalDate fechaNacimiento;


    public String getNombre() {
        return nombre;
    }

    public void realizarActividad(){

        System.out.println(nombre + "esta realizando su actividad");

    }

    public Persona(String nombre, int dni, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
