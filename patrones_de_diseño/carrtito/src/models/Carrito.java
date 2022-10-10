package models;
import models.stateCarrito.Vacio;
import java.util.ArrayList;
import java.util.List;

public class Carrito {


    private List<Producto> productos;
    private CarritoState estado;

    public Carrito(Carrito c){
        productos = new ArrayList<>();
        estado = new Vacio(this);
    }

    void agregarProducto(Producto producto){
        estado.agregarProducto(producto);
    }
    void cancelarCarrito(){
        estado.cancelarCarrito();
    }
    void volverEstado(){
        estado.volverEstado();
    }
    void adelantarEstado(){
        estado.adelantarEstado();
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void vaciarCarrito() {
        productos.clear();
    }
    public void setEstado(CarritoState state){
        estado = state;
    }
}
