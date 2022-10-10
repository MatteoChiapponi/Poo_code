package Models;

import Models.CompositeProd.CompositeProd;
import Models.FactoryProds.Exception.FactoryException;
import Models.FactoryProds.FactoryCompProd;

import java.util.ArrayList;
import java.util.List;

public class Local {
    private String nombre;
    private String mail;
    private String telefonoContacto;
    private List<Carrito> ventasTotales;

    public Local(String nombre, String mail, String telefonoContacto) {
        ventasTotales = new ArrayList<>();
        this.nombre = nombre;
        this.mail = mail;
        this.telefonoContacto = telefonoContacto;
    }

    public void addCarrito(Carrito carrito){
        ventasTotales.add(carrito);
    }
    public Double ventasTotales(){
        double total = 0.0;
        for (Carrito carrito:ventasTotales) {
            total += carrito.calcularPrecioDelCarrito();
        }
        return total;
    }
    public static CompositeProd crearProd(String codigo){

        try {
            return FactoryCompProd.getInstance().crearProd(codigo);
        } catch (FactoryException e) {
            e.printStackTrace();
        }
        return null;
    }
}
