package models.stateCarrito;
import models.Carrito;
import models.CarritoState;
import models.Producto;
public class Vacio implements CarritoState {

    private Carrito carrito;

    public Vacio(Carrito carrito) {
        this.carrito = carrito;
    }

    @Override
    public void agregarProducto(Producto producto) {
        carrito.getProductos().add(producto);
        carrito.setEstado(new Cargado(carrito));
    }

    @Override
    public void cancelarCarrito() {
        System.out.println("el carrito ya esta vacio");
    }

    @Override
    public void volverEstado() {
        System.out.println("no se puede volver un estado anterior");
    }

    @Override
    public void adelantarEstado() {
        carrito.setEstado(new Cargado(carrito));
    }
}
