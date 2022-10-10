package models;

import models.composite.VagonCompuesto;

import java.util.ArrayList;
import java.util.List;

public class Tren implements VagonCompuesto{
    private List<VagonCompuesto> vagonCompuestoList;

    public Tren() {
        vagonCompuestoList =  new ArrayList<>();
    }

    public void addVagonCompuesto(VagonCompuesto vg){
        vagonCompuestoList.add(vg);
    }

    @Override
    public Double calcularArea() {
        double areaTotal = 0.0;
        for (VagonCompuesto vc:vagonCompuestoList) {
            areaTotal += vc.calcularArea();
        }
        return areaTotal;
    }
}
