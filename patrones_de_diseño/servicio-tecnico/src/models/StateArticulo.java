package models;

public interface StateArticulo {

    void cambiarDireccion(String direccion);
    Double darPresupuesto(Double presupuesto);
    Double agregarRepuestos(Double precioRepuesto);
    void adelantarEstadoProd();


}
