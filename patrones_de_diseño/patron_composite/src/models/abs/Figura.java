package models.abs;

import models.composite.VagonCompuesto;

public abstract class Figura implements VagonCompuesto {

    private String codigo;

    public Figura(String codigo) {
        this.codigo = codigo;
    }
    @Override
    public abstract Double calcularArea();
}
