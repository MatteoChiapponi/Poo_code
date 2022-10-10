package models.stateCarrito;
import models.Carrito;
import models.Producto;
import models.CarritoState;

public class Cerrado implements CarritoState {
    private Carrito carrito;

   public Cerrado(Carrito c){
        this.carrito = c;
    }

    @Override
    public void agregarProducto(Producto producto) {

        System.out.println("nopodes agregar prod");
    }

    @Override
    public void cancelarCarrito() {
        System.out.println("ya no podes cancelar cagate");
    }

    @Override
    public void volverEstado() {
        System.out.println("paula dice que no podes hacer nada en este estado solo esperar tus prod");
    }

    @Override
    public void adelantarEstado() {
        System.out.println("estas en el ultimo estado");
    }
}
