package models;

import state_Articuos.EnPresupuesto;

public class Articulo {

    private StateArticulo estadoDelArticulo;
    private String nombreArticulo;
    private TipoReparacion tipoReparacion;
    private Double presupuesto;
    private String direccionEntrega;

    public Articulo(String nombreArticulo, String direccionEntrega, TipoReparacion tipoReparacion){
        estadoDelArticulo = new EnPresupuesto(this);
        this.nombreArticulo = nombreArticulo;
        this.tipoReparacion = tipoReparacion;
        presupuesto = 0.0;
        this.direccionEntrega = direccionEntrega;
    }

    public void cambiarDireccion(String direccion){
        estadoDelArticulo.cambiarDireccion(direccion);
    }
    public void darPresupuesto(Double presupuesto){
        estadoDelArticulo.darPresupuesto(presupuesto);
    }
    public void agregarRepuestos(Double precioRepuesto){
        estadoDelArticulo.agregarRepuestos(precioRepuesto);
    }
    public void adelantarEstadoProd(){
        estadoDelArticulo.adelantarEstadoProd();
    }

    public TipoReparacion getTipoReparacion() {
        return tipoReparacion;
    }

    public void setPresupuesto(Double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public void setEstadoDelArticulo(StateArticulo estadoDelArticulo) {
        this.estadoDelArticulo = estadoDelArticulo;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public StateArticulo getEstadoDelArticulo() {
        return estadoDelArticulo;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }
}
