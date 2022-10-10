package Models.Abs.FactoryPropiedad;

import Models.Abs.BarrioCerrado;
import Models.Abs.Casa;
import Models.Abs.FactoryPropiedad.ExceptioFactory.FactoryException;
import Models.Abs.Propiedad;

public class PropiedadFactory {
    public static final String casa1 = "calle san martin";
    public static final String casa2 = "calle mitre";
    public static final String barrioCerrado1 = "calle gutierrez";

    private static PropiedadFactory instance;
    private PropiedadFactory(){
    }
    public static PropiedadFactory getInstance(){
        if (instance == null)
            instance = new PropiedadFactory();
        return instance;
    }
    public Propiedad construirPropiedad(String codigo) throws FactoryException {
        switch (codigo){
            case casa1:
                return new Casa("Av. San Martín", 1 ,500.0);
            case casa2:
                return new Casa("Mitre",2,700.0);
            case barrioCerrado1:
                BarrioCerrado barrio = new BarrioCerrado("Gutierres", 1,2);
                barrio.addPropiedad(PropiedadFactory.getInstance().construirPropiedad(casa1));
                barrio.addPropiedad(PropiedadFactory.getInstance().construirPropiedad(casa2));
                return barrio;
            default:
                throw new FactoryException("ingresaste un codigo invalido " + codigo);
        }
    }
}
