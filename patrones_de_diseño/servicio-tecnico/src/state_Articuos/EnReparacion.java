package state_Articuos;

import models.Articulo;
import models.StateArticulo;

public class EnReparacion implements StateArticulo {
    private Articulo articulo;

    public EnReparacion(Articulo articulo) {
        this.articulo = articulo;
    }

    @Override
    public void cambiarDireccion(String direccion) {
        System.out.println("no podes cambiar la direccion en este estado");
    }

    @Override
    public Double darPresupuesto(Double presupuesto) {
        System.out.println(articulo.getTipoReparacion().getCostoTotal());
        return articulo.getTipoReparacion().getCostoMasRepuestos();
    }

    @Override
    public Double agregarRepuestos(Double precioRepuesto) {
        return articulo.getTipoReparacion().getCostoTotal();
    }

    @Override
    public void adelantarEstadoProd() {
        articulo.setEstadoDelArticulo(new ParaEnvio(articulo));
        System.out.println("adalantaste al siguiente estado " + articulo.getEstadoDelArticulo().getClass().getSimpleName());
    }
}
