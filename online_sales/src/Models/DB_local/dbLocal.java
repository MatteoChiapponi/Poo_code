package Models.DB_local;

import Models.CompositeProd.CompositeProd;
import Models.CompositeProd.Producto;
import Models.FactoryProds.Exception.FactoryException;
import Models.FactoryProds.FactoryCompProd;

import java.util.ArrayList;
import java.util.List;

public class dbLocal {

    private List<CompositeProd> prods;
    private static dbLocal instance;
    private dbLocal(){
        try {
            prods = new ArrayList<>();
            prods.add(FactoryCompProd.getInstance().crearProd(FactoryCompProd.rastrillo));
            prods.add(FactoryCompProd.getInstance().crearProd(FactoryCompProd.martillo));
            prods.add(FactoryCompProd.getInstance().crearProd(FactoryCompProd.pico));
            prods.add(FactoryCompProd.getInstance().crearProd(FactoryCompProd.pala));

        } catch (FactoryException e) {
            e.printStackTrace();
        }
    }

    public static dbLocal getInstance() {
        if (instance == null)
            instance=new dbLocal();
        return instance;
    }
    public List<String> getProdCod() {
        List<String> codProd = new ArrayList<>();
        for (CompositeProd cp:prods) {
            codProd.add(((Producto)cp).getCodigo());
        }
        return codProd;
    }
    public List<CompositeProd> getProds() {
        return prods;
    }
}
