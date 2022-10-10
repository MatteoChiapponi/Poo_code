package ejercicio2;

public class Fisioterapeuta extends Employed{

    private int matricula;


    public Fisioterapeuta(String nombre, int dni, Double sueldo, int matricula) {
        super(nombre, dni, sueldo);
        this.matricula = matricula;
    }
}
