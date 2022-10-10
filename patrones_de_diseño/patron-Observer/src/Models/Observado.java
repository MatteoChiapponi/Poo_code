package Models;

public interface Observado {
    void agregar(Observador observador);
    void eliminar(Observador observador);
    void notificar(Subasta subasta);
}
