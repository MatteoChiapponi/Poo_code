package Models;

public interface Observador {
    void pujar(Subasta subasta, Double monto);
    void actualizar();
}
