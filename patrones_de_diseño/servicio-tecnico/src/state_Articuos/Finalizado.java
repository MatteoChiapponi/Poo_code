package state_Articuos;

import models.Articulo;
import models.StateArticulo;

public class Finalizado implements StateArticulo {
    private Articulo articulo;

    public Finalizado(Articulo articulo) {
        this.articulo = articulo;
    }

    @Override
    public void cambiarDireccion(String direccion) {
        System.out.println("no podes hacer nada capo");
    }

    @Override
    public Double darPresupuesto(Double presupuesto) {
        System.out.println("no podes hacer nada capo");
        return null;
    }

    @Override
    public Double agregarRepuestos(Double precioRepuesto) {
        System.out.println("no podes hacer nada capo");
        return null;
    }

    @Override
    public void adelantarEstadoProd() {
        System.out.println("no podes hacer nada capo");
    }
}
