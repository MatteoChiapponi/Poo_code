package com.company;

import com.company.exceptions.PacienteException;

import java.time.LocalDate;
import java.util.Date;

public class Paciente {
    String nombre;
    String apellido;
    String historiaClinica;
    LocalDate fechaInternacion;
    LocalDate fechaAlta;


    Paciente(String nombre, String apellido, String historiaClinica, LocalDate fechaInternacion) throws PacienteException {
        LocalDate fechaHoy = LocalDate.now();
        if (fechaInternacion.isEqual(fechaHoy))
            throw new PacienteException("no podes ingresar una fecha despues de hoy");

        this.nombre=nombre;
        this.apellido=apellido;
        fechaAlta=null;

    }


    public void darAlta(LocalDate fechaAlta)
    {
        if (fechaAlta.isAfter(fechaInternacion))
            System.out.println("Ok");
        else
            System.out.println("No se puede");
    }

}
