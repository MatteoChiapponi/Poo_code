package Models;

import Models.CompositeProd.CompositeProd;
import Models.CompositeProd.Producto;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<CompositeProd> prodsDelCarrito;
    private int idCarrito;

    static int acc = 0;
    public Carrito() {
        acc++;
        this.idCarrito = acc;
        prodsDelCarrito = new ArrayList<>();
    }
    public void addProd(CompositeProd prod){
        prodsDelCarrito.add(prod);
    }
    public Double calcularPrecioDelCarrito(){
        double total = 0.0;
        for (CompositeProd compositeProd:prodsDelCarrito) {
            total += compositeProd.calcularPrecio();
        }
        return total;
    }

    public List<CompositeProd> getProdsDelCarrito() {
        return prodsDelCarrito;
    }

    public ArrayList<String> getCodigoProd(){
        ArrayList<String> codigosProd = new ArrayList<>();
        for (CompositeProd cp:prodsDelCarrito) {
            codigosProd.add(((Producto)cp).getCodigo());
        }
        return codigosProd;
    }
}
