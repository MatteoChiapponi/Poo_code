package Models.CompositeProd;

import java.util.ArrayList;
import java.util.List;

public class Oferta implements CompositeProd{

    private Double descuento;
    private List<CompositeProd> ofertas;

    public Oferta(Double descuento) {
        ofertas = new ArrayList<>();
        this.descuento = descuento;
    }

    public Oferta() {
        ofertas = new ArrayList<>();
    }

    public void addOfertas(CompositeProd prod){
        ofertas.add(prod);
    }
    @Override
    public Double calcularPrecio() {
        double total = 0.0;
        for (CompositeProd prod:ofertas) {
            total += prod.calcularPrecio();
        }
        total = total - total * descuento/ 100;
        return total;
    }

    public List<CompositeProd> getOfertas() {
        return ofertas;
    }
}
