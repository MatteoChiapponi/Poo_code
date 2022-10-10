
import Models.Abs.FactoryPropiedad.PropiedadFactory;
import Models.Municipio;

public class Main {
    public static void main(String[] args) {
        Municipio municipio = new Municipio();
        municipio.addPropiedad(PropiedadFactory.casa1);
        municipio.addPropiedad(PropiedadFactory.casa2);
        municipio.addPropiedad(PropiedadFactory.barrioCerrado1);
        municipio.mostrarPropiedades();
    }
}
