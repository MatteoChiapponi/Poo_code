package Models;

import Models.Abs.FactoryPropiedad.ExceptioFactory.FactoryException;
import Models.Abs.FactoryPropiedad.PropiedadFactory;
import Models.Abs.Propiedad;

import java.util.ArrayList;
import java.util.List;

public class Municipio {

    private List<Propiedad> propiedades;

    public Municipio() {
        propiedades = new ArrayList<>();
    }

    public void mostrarPropiedades(){
        for (Propiedad p:propiedades) {
            System.out.println("calle: " + p.getCalle() + " impuesto: " + p.calcularImpuesto());
        }
    }
    public void addPropiedad(String codigo){
        try {
            propiedades.add(PropiedadFactory.getInstance().construirPropiedad(codigo));
        } catch (FactoryException e) {
            e.printStackTrace();
        }
    }
}
