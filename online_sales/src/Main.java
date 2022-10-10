import Models.Carrito;
import Models.Cliente;
import Models.CompositeProd.CompositeProd;
import Models.CompositeProd.Producto;
import Models.DB_local.dbLocal;
import Models.FactoryProds.FactoryCompProd;

public class Main {
    public static void main(String[] args) {

        Carrito carrito = new Carrito();

        Cliente mateo = new Cliente("mateeo","chiapponi","mate@gmail.com",carrito);

        mateo.addProductoCarrito(FactoryCompProd.pico);
        mateo.addProductoCarrito(FactoryCompProd.pala);
        mateo.addProductoCarrito(FactoryCompProd.rastrillo);
        mateo.addProductoCarrito(FactoryCompProd.martillo);
        mateo.addProductoCarrito(FactoryCompProd.martillo);
        mateo.addProductoCarrito(FactoryCompProd.combo1);
        mateo.addProductoCarrito(FactoryCompProd.combo2);
        mateo.addProductoCarrito(FactoryCompProd.comboCompleto);

        mateo.calcularPrecioCarrito();
        mateo.pagarCarrito();

        for (CompositeProd cp:dbLocal.getInstance().getProds()) {
            System.out.println("el producto: "+((Producto)cp).getCodigo()+" tiene un stock de: "+((Producto)cp).getStock());
        }
    }
}
