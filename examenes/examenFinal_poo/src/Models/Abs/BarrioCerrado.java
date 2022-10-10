package Models.Abs;

import java.util.ArrayList;
import java.util.List;

public class BarrioCerrado extends Propiedad{

    private List<Propiedad> propiedades;
    private Integer factorMultiplicador;

    public BarrioCerrado(String calle, Integer numero, Integer factorMultiplicador) {
        super(calle, numero);
        this.factorMultiplicador = factorMultiplicador;
        propiedades = new ArrayList<>();
    }

    @Override
    public Double calcularImpuesto() {
        double impuestoTotal = 0.0;
        for (Propiedad p:propiedades) {
            impuestoTotal += p.calcularImpuesto();
        }
        impuestoTotal *= factorMultiplicador;
        return impuestoTotal;
    }

    public void addPropiedad(Propiedad propiedad){
        propiedades.add(propiedad);
    }
}
