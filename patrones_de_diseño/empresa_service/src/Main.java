import Models.Empresa;
import Models.abs.factoryServiceComposite.FactoryServiceComposite;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("ninguna");
        empresa.addService(FactoryServiceComposite.colocacionAire);
        empresa.addService(FactoryServiceComposite.aireAcondicionado);
        empresa.addService(FactoryServiceComposite.fullAire);
        empresa.addService("hola");
        empresa.mostrarService();
    }
}
