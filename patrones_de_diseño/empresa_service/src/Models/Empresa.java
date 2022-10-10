package Models;

import Models.abs.ServiceComposite;
import Models.abs.factoryException.FactoryServiceException;
import Models.abs.factoryServiceComposite.FactoryServiceComposite;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<ServiceComposite> services;
    private String razonSocial;

    public Empresa(String razonSocial) {
        services = new ArrayList<>();
        this.razonSocial = razonSocial;
    }
    public void mostrarService(){
        for (ServiceComposite sc:services) {
            System.out.println("nombre: "+ sc.getNombre() + "precio: " + sc.calcularPrecio());
        }
    }
    public void addService(String codigo){
        try {
            services.add(FactoryServiceComposite.getInstance().creaService(codigo));
        } catch (FactoryServiceException e) {
            e.printStackTrace();
        }
    }
}
