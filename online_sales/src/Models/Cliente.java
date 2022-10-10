package Models;

import Models.CompositeProd.CompositeProd;
import Models.CompositeProd.Oferta;
import Models.CompositeProd.Producto;
import Models.DB_local.dbLocal;

import java.util.ArrayList;
import java.util.Objects;

public class Cliente {
    private String nombre;
    private String apellido;
    private String mail;
    private Carrito carrito;

    public Cliente(String nombre, String apellido, String mail, Carrito carrito) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.carrito = carrito;
    }

    public void addProductoCarrito(String codigo) {
        carrito.addProd(Local.crearProd(codigo));
    }

    public void calcularPrecioCarrito() {
        System.out.println(carrito.calcularPrecioDelCarrito());
    }

    public void pagarCarrito() {
        System.out.println("pagaste " + carrito.calcularPrecioDelCarrito());
        dbLocal db = dbLocal.getInstance();
        for (int i = 0; i < carrito.getProdsDelCarrito().size(); i++) {
            if (carrito.getProdsDelCarrito().get(i) instanceof Oferta) {
                for (int y = 0; y < db.getProds().size(); y++) {
                    for (int x = 0; x < ((Oferta) carrito.getProdsDelCarrito().get(i)).getOfertas().size(); x++)
                        if ((db.getProds().get(y)).equals(((Oferta) carrito.getProdsDelCarrito().get(i)).getOfertas().get(x))) {
                            ((Producto) db.getProds().get(y)).setStock(((Producto) db.getProds().get(y)).getStock() - 1);
                        }
                }
            }
        }
        for (int n = 0; n < db.getProds().size(); n++) {
            for (int x = 0; x < carrito.getProdsDelCarrito().size(); x++) {
                if (carrito.getProdsDelCarrito().get(x) instanceof Oferta) {
                    carrito.getProdsDelCarrito().remove(x);
                    continue;
                }
                if ((db.getProds().get(n).equals(carrito.getProdsDelCarrito().get(x)))) {
                    ((Producto) db.getProds().get(n)).setStock(((Producto) db.getProds().get(n)).getStock() - 1);
                }
            }
        }
    }
}
