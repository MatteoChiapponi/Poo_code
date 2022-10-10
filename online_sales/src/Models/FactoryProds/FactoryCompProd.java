package Models.FactoryProds;

import Models.CompositeProd.CompositeProd;
import Models.CompositeProd.Oferta;
import Models.CompositeProd.Producto;
import Models.FactoryProds.Exception.FactoryException;

public class FactoryCompProd {
    public static final String pala = "pala";
    public static final String martillo = "martillo";
    public static final String pico = "pico";
    public static final String rastrillo = "rastrillo";
    public static final String combo1 = "pala y pico";
    public static final String combo2 = "martillo y rastrillo";
    public static final String comboCompleto = "combo completo";
    private static FactoryCompProd instance;
    private FactoryCompProd(){

    }
    public static FactoryCompProd getInstance() {
        if (instance == null)
            instance = new FactoryCompProd();
        return instance;
    }
    public CompositeProd crearProd(String codigo) throws FactoryException{
        switch (codigo){
            case rastrillo:
                return new Producto(100,"rastrillo","rastrillo", 0.0, 2500.0);
            case pico:
                return new Producto(100,"pico","pico", 0.0, 3500.0);
            case pala:
                return new Producto(100,"pala","pala", 0.0, 3000.0);
            case martillo:
                return new Producto(100,"martillo","martillo", 0.0, 1500.0);
            case combo1:
                Oferta palaPico = new Oferta(10.0);
                palaPico.addOfertas(FactoryCompProd.getInstance().crearProd(pala));
                palaPico.addOfertas(FactoryCompProd.getInstance().crearProd(pico));
                return palaPico;
            case combo2:
                Oferta martilloRastrillo = new Oferta(10.0);
                martilloRastrillo.addOfertas(FactoryCompProd.getInstance().crearProd(martillo));
                martilloRastrillo.addOfertas(FactoryCompProd.getInstance().crearProd(rastrillo));
                return martilloRastrillo;

            case comboCompleto:
                Oferta comboCompleto = new Oferta(20.0);
                comboCompleto.addOfertas(FactoryCompProd.getInstance().crearProd(rastrillo));
                comboCompleto.addOfertas(FactoryCompProd.getInstance().crearProd(martillo));
                comboCompleto.addOfertas(FactoryCompProd.getInstance().crearProd(pico));
                comboCompleto.addOfertas(FactoryCompProd.getInstance().crearProd(pala));
                return comboCompleto;
            default:
                throw new FactoryException("ingresaste un codigo invalido");
        }
    }
}
