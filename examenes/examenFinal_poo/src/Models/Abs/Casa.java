package Models.Abs;

import java.util.Objects;

public class Casa extends Propiedad{
    private Double impuestoBase;

    public Casa(String calle, Integer numero, Double impuestoBase) {
        super(calle, numero);
        this.impuestoBase = impuestoBase;
    }

    @Override
    public Double calcularImpuesto() {
        if (this.getCalle().equals( "Av. San Martín"))
            return impuestoBase * 1.1;
        return impuestoBase;
    }

}
