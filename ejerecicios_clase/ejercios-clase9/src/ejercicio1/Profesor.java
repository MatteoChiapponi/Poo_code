package ejercicio1;

import java.time.LocalDate;

public class Profesor extends Persona{

    private String tituloAcademico;
    private LocalDate fechaDeAlta;

    @Override
    public void realizarActividad(){

        System.out.println(getNombre() + " esta realizando la actividad de profesor");

    }

    public LocalDate calcularAtiguedad (LocalDate fechaDeAlta, LocalDate fechaActual){

        return fechaActual;

    }

    public Profesor(String nombre, int dni, LocalDate fechaNacimiento, String tituloAcademico, LocalDate fechaDeAlta) {
        super(nombre, dni, fechaNacimiento);
        this.tituloAcademico = tituloAcademico;
        this.fechaDeAlta = fechaDeAlta;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "tituloAcademico='" + tituloAcademico + '\'' +
                ", fechaDeAlta=" + fechaDeAlta +
                '}';
    }
}
