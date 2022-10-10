import factory.ProductFactory;
import models.Almacen;

public class Main {
    public static void main(String[] args) {

        Almacen almacen = new Almacen();
        ProductFactory.getInstance();

        try {
            almacen.addProduct(ProductFactory.construir(ProductFactory.caja10x10));
            almacen.addProduct(ProductFactory.construir(ProductFactory.pelotaFutbol));
            almacen.addProduct(ProductFactory.construir(ProductFactory.pelotaTenis));

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(almacen.calcularEspacioNecesario());
    }
}
