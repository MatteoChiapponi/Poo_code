package Models.abs.factoryServiceComposite;

import Models.abs.ServiceCombinado;
import Models.abs.ServiceComposite;
import Models.abs.ServiceSimple;
import Models.abs.factoryException.FactoryServiceException;

public class FactoryServiceComposite {
    public static final String aireAcondicionado = "aire";
    public static final String colocacionAire = "aire-colocacion";
    public static final String fullAire = "airefull";

    private static FactoryServiceComposite instance;
    private FactoryServiceComposite(){

    }
    public static FactoryServiceComposite getInstance(){
        if (instance == null)
            instance = new FactoryServiceComposite();
        return instance;
    }
    public ServiceComposite creaService(String codigo) throws FactoryServiceException {
        switch (codigo) {
            case aireAcondicionado:
                return new ServiceSimple("aire acondicionado", "es de 10000 frigorias", 65000.0, false);
            case colocacionAire:
                return new ServiceSimple("colocar aire", "es solo la colocacion", 10000.0, true);
            case fullAire:
                ServiceComposite aire = FactoryServiceComposite.instance.creaService(aireAcondicionado);
                ServiceComposite colocacion = FactoryServiceComposite.instance.creaService(colocacionAire);
                ServiceCombinado fullservice = new ServiceCombinado("fullservice", "este esta cariéla bro", 10);
                fullservice.addService(aire);
                fullservice.addService(colocacion);
                return fullservice;
            default:
                throw new FactoryServiceException("hola");
        }
    }
}
