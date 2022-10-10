package AbsModels;

import Models.Alumno;

public abstract class Examen {
    private Alumno alumno;
    private String descripcion;
    private String enunciado;
    private double nota;

    public Examen(Alumno alumno, String descripcion, String enunciado, double nota) {
        this.alumno = alumno;
        this.descripcion = descripcion;
        this.enunciado = enunciado;
        this.nota = nota;
    }
    public abstract boolean estaAprobado();

    public double getNota() {
        return nota;
    }
}
