package state_Articuos;

import models.Articulo;
import models.StateArticulo;

public class ParaEnvio implements StateArticulo {
    private Articulo articulo;

    public ParaEnvio(Articulo articulo) {
        this.articulo = articulo;
    }

    @Override
    public void cambiarDireccion(String direccion) {
        articulo.setDireccionEntrega(direccion);
        System.out.println("camabiaste la direccion a " + direccion);
    }
    @Override
    public Double darPresupuesto(Double presupuesto) {
        System.out.println("no podes dar el presupuesyo en esta etapa");
        return null;
    }
    @Override
    public Double agregarRepuestos(Double precioRepuesto) {
        System.out.println("no podes dar el presupuesyo en esta etapa");
        return null;
    }

    @Override
    public void adelantarEstadoProd() {
        articulo.setEstadoDelArticulo(new Finalizado(articulo));
        System.out.println("adalantaste al siguiente estado " + articulo.getEstadoDelArticulo().getClass().getSimpleName());
    }
}
