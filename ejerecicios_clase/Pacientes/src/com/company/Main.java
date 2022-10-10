package com.company;

import com.company.exceptions.PacienteException;


import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {

        LocalDate fechaInternacion = LocalDate.now();
        try {
            Paciente paciente = new Paciente("Juan", "Perez", "12345", fechaInternacion);
        } catch (PacienteException e) {
             e.printStackTrace();
        }
        System.out.println("hola");
    }
}
