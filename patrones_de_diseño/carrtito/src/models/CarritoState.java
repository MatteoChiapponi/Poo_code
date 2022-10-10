package models;

public interface CarritoState {
    void agregarProducto(Producto producto);
    void cancelarCarrito();
    void volverEstado();
    void adelantarEstado();

}
