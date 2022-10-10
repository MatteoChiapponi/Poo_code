package models;

import models.composite.VagonCompuesto;

import java.util.ArrayList;
import java.util.List;

public class Vagon implements VagonCompuesto {
    private List<VagonCompuesto> vagonCompuestos;

    public Vagon() {
        vagonCompuestos = new ArrayList<>();
    }
    public void addVagonCompuesto(VagonCompuesto vg){
        vagonCompuestos.add(vg);
    }

    @Override
    public Double calcularArea() {
        double areaTotal = 0.0;
        for (VagonCompuesto vc:vagonCompuestos) {
            areaTotal += vc.calcularArea();
        }
        return areaTotal;
    }
}
