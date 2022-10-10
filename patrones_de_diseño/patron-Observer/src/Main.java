import Models.Oferente;
import Models.Subasta;

public class Main {
    public static void main(String[] args) {

        Subasta subasta = new Subasta("subastando un auto");

        Oferente oferente1 = new Oferente("matteo","chiapponi",123456,10000.0, subasta);
        Oferente oferente2 = new Oferente("maxi","lopez",121313,30000.0,subasta);

        subasta.agregar(oferente1);
        subasta.agregar(oferente2);

        oferente1.pujar(subasta,6000.0);
        oferente2.pujar(subasta,5000.0);
        oferente2.pujar(subasta,6500.0);
        oferente1.pujar(subasta,9000.0);
        oferente1.pujar(subasta,10000.1);
        oferente2.pujar(subasta,11000.0);
        oferente2.pujar(subasta,30000.1);

        subasta.notificar(subasta);

        subasta.eliminar(oferente1);
        subasta.eliminar(oferente2);
    }
}
