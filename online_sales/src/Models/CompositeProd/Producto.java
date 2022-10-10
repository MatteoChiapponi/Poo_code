package Models.CompositeProd;

import java.util.Objects;

public class Producto implements CompositeProd{

    private int stock;
    private String codigo;
    private String descripcion;
    private Double descuento;
    private Double costo;

    public Producto(int stock, String codigo, String descripcion, Double descuento, Double costo) {
        this.stock = stock;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.descuento = descuento;
        this.costo = costo;
    }

    @Override
    public Double calcularPrecio() {
        if (descuento > 0.0)
            return costo - costo*descuento/100;
        return costo;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        Producto p = (Producto) obj;
        return Objects.equals(codigo, p.codigo);
    }
    public String getCodigo() {
        return codigo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
