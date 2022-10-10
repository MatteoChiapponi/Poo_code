package Models;

import AbsModels.Examen;

public class Parcial extends Examen {
    private int numeroUnidad;
    private int vecesReintentadas;

    public Parcial(Alumno alumno, String descripcion, String enunciado, double nota, int numeroUnidad, int vecesReintentadas) {
        super(alumno, descripcion, enunciado, nota);
        this.numeroUnidad = numeroUnidad;
        this.vecesReintentadas = vecesReintentadas;
    }

    @Override
    public boolean estaAprobado() {
        return false;
    }
    public boolean rendirParcial(){
        return true;
    }
}
