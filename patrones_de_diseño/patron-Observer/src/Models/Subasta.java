package Models;

import java.util.ArrayList;
import java.util.List;

public class Subasta implements Observado{
    private Double monto;
    private String descripcion;
    private List<Observador> observadores;

    public Subasta(String descripcion) {
        observadores = new ArrayList<>();
        this.monto = 3000.0;
        this.descripcion = descripcion;
    }

    @Override
    public void agregar(Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void eliminar(Observador observador) {
        System.out.println(((Oferente)observador).getNombre() + " fue eliminado de la subasta correctamente");
        observadores.remove(observador);
    }

    @Override
    public void notificar(Subasta subasta) {
        for (Observador o:observadores) {
                o.actualizar();
        }
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }
}
