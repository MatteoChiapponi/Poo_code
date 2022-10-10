import AbsModels.Examen;
import Models.Alumno;
import Models.ExamenFinal;

public class Main {
    public static void main(String[] args) {

        Alumno alumno1 = new Alumno(1, "chiapponi", "matteo");
        Examen examenFinal = new ExamenFinal(alumno1,"rendi mi primer examen", "nada", 6,"me fue bien en el oral", 3);
        System.out.println(examenFinal.estaAprobado());
        System.out.println(((ExamenFinal)examenFinal).calcularPromedioNota());

    }
}
