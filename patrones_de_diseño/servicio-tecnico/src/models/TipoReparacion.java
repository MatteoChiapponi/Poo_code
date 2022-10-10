package models;

import java.util.ArrayList;
import java.util.List;

public class TipoReparacion {
    private Double costoReparacion;
    private Double costoMasRepuestos;
    private String codigoDeReparacion;
    private List<Repuesto> repuestos;

    public TipoReparacion(Double costoReparacion, String codigoDeReparacion) {
        this.costoReparacion = costoReparacion;
        this.codigoDeReparacion = codigoDeReparacion;
    }
    public Double getCostoReparacion() {
        return costoReparacion;
    }
    public Double getCostoTotal(){
        double acc = 0.0;
        Double total = 0.0;

        for (Repuesto r:repuestos) {
            acc += r.getPrecioRepuesto();
        }
        total = costoReparacion + acc;
        costoMasRepuestos= total;
        return total;
    }

    public Double getCostoMasRepuestos() {
        return costoMasRepuestos;
    }

    public void agregarRepuestos(ArrayList<Repuesto> repuestos){
        this.repuestos = repuestos;
    }

}
