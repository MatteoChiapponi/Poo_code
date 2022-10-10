package models.factoryfiguras;

import models.abs.Circulo;
import models.abs.Figura;
import models.abs.Rectangulo;
import models.abs.TrianguloR;
import models.factoryfiguras.execption.FactoryFigurasException;

public class FactoryFiguras {

    private static FactoryFiguras instance;
    public static final String codCirculo = "1233";
    public static final String codReactangulo = "4567";
    public static final String codTriangulo = "8910";

    private FactoryFiguras() {}

    public static FactoryFiguras getInstance(){
        if (instance == null)
            return new FactoryFiguras();
        return instance;
    }

    public Figura crearFiguras(String codigo) throws Exception{
        switch (codigo){
            case codCirculo : return new Circulo(codCirculo,1.0);
            case codReactangulo: return new Rectangulo(codReactangulo,5.0,4.0);
            case codTriangulo: return new TrianguloR(codTriangulo,2.0,2.0);
            default : throw new FactoryFigurasException("no ingresaste un codigo valido");
        }
    }
}
