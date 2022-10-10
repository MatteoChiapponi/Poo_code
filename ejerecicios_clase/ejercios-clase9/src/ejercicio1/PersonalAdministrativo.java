package ejercicio1;

import java.time.LocalDate;

public class PersonalAdministrativo extends Persona{

    private String cargo;

    @Override
    public void realizarActividad(){

        System.out.println(getNombre() + " esta realizando la actividadad de un " + cargo + " .");

    }

    public PersonalAdministrativo(String nombre, int dni, String fechaNacimiento, String cargo) {
        super(nombre, dni, LocalDate.parse(fechaNacimiento));
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "PersonalAdministrativo{" +
                "cargo='" + cargo + '\'' +
                '}';
    }
}
