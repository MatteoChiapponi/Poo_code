package Models.abs;

import java.util.ArrayList;
import java.util.List;

public class ServiceCombinado extends ServiceComposite{

    private Integer descuento;
    private List<ServiceComposite> services;

    public ServiceCombinado(String nombre, String descripcion, Integer descuento) {
        super(nombre, descripcion);
        this.descuento = descuento;
        services = new ArrayList<>();
    }
    public void addService(ServiceComposite serviceComposite){
        services.add(serviceComposite);
    }

    @Override
    public Double calcularPrecio() {
        double total = 0.0;
        for (ServiceComposite sc:services) {
            total += sc.calcularPrecio();
        }
        total = total - (total*descuento/100);
        return total;
    }
}
