package ejercicio1;

import java.time.LocalDate;

public class Estudiante extends Persona{

    private int curso;

    @Override
    public void realizarActividad(){

        System.out.println(getNombre() + " esta realizando la actividad de un estudiante.");

    }

    public Estudiante(String nombre, int dni, LocalDate fechaNacimiento, int curso) {
        super(nombre, dni, fechaNacimiento);
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "curso=" + curso +
                '}';
    }
}
