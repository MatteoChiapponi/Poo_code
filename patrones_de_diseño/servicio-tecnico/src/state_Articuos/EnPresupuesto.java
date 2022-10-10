package state_Articuos;

import models.Articulo;
import models.StateArticulo;

public class EnPresupuesto implements StateArticulo {

    private Articulo articulo;
    public EnPresupuesto(Articulo articulo) {
        this.articulo = articulo;
    }

    @Override
    public void cambiarDireccion(String direccion) {
        System.out.println("no podes cambiar la direccion en este estado " + this.getClass().getSimpleName());
    }

    @Override
    public Double darPresupuesto(Double presupuesto) {
        Double costo;
        costo = articulo.getTipoReparacion().getCostoReparacion();
        articulo.setPresupuesto(costo);
        return costo;

    }

    @Override
    public Double agregarRepuestos(Double precioRepuesto) {
        System.out.println("no podes agregar repuestos en esta etapa");
        return null;
    }

    @Override
    public void adelantarEstadoProd() {
        articulo.setEstadoDelArticulo(new EnReparacion(articulo));
        System.out.println("cambiaste al estado en reparacion " + articulo.getEstadoDelArticulo().getClass().getSimpleName());
    }
}
