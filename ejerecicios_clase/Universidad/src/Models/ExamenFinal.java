package Models;

import AbsModels.Examen;

public class ExamenFinal extends Examen implements Comparable<ExamenFinal>{

    private String descripcionDelOral;
    private double notaOral;

    private double promedioNota;

    public ExamenFinal(Alumno alumno, String descripcion, String enunciado, double nota, String descripcion1, double notaOral) {
        super(alumno, descripcion, enunciado, nota);
        this.descripcionDelOral = descripcion1;
        this.notaOral = notaOral;
    }

    @Override
    public boolean estaAprobado() {

        if (getNota() >= 4) {
            if (notaOral >= 4) {
                return true;
            } else
                System.out.println("apobaste el escrito pero no el oral");
        } else if (notaOral >= 4)
            System.out.println("aprobaste el oral pero no el escrito");
        else {
            System.out.println("no aprobaste ninguno");
            return false;
        }
    return false;
    }

    @Override
    public int compareTo(ExamenFinal o) {
        if (promedioNota > o.promedioNota)
            return 1;
        else if (promedioNota < o.promedioNota)
            return -1;
        else
            return 0;
    }

    public double calcularPromedioNota() {
        Double total;
        total = (getNota() + notaOral) / 2;
        promedioNota = total;
        return total;
    }


}
