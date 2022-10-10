package models.stateCarrito;
import models.Carrito;
import models.CarritoState;
import models.Producto;
public class Cargado implements CarritoState {
    private Carrito carrito;

    public Cargado(Carrito carrito) {
        this.carrito = carrito;
    }

    @Override
    public void agregarProducto(Producto producto) {
        carrito.getProductos().add(producto);
    }

    @Override
    public void cancelarCarrito() {
        carrito.vaciarCarrito();
        carrito.setEstado(new Vacio(carrito));
    }

    @Override
    public void volverEstado() {
        carrito.vaciarCarrito();
        carrito.setEstado(new Vacio(carrito));
    }

    @Override
    public void adelantarEstado() {
        carrito.setEstado(new Pagado(carrito));
    }
}
