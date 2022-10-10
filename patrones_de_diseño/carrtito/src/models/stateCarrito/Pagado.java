package models.stateCarrito;
import models.Carrito;
import models.CarritoState;
import models.Producto;

public class Pagado implements CarritoState {
    private Carrito carrito;

    public Pagado(Carrito carrito) {
        this.carrito = carrito;
    }

    @Override
    public void agregarProducto(Producto producto) {
        System.out.println("no podes agregar mas productos");
    }

    @Override
    public void cancelarCarrito() {
        carrito.vaciarCarrito();
        carrito.setEstado(new Vacio(carrito));
    }

    @Override
    public void volverEstado() {
        carrito.setEstado(new Cargado(carrito));
    }

    @Override
    public void adelantarEstado() {
        carrito.setEstado(new Cerrado(carrito));
    }
}
