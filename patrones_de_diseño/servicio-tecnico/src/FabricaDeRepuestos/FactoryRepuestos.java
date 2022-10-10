package FabricaDeRepuestos;
import models.Repuesto;
import models.TipoReparacion;
import java.util.ArrayList;
public class FactoryRepuestos {

    private static FactoryRepuestos instance;

    private FactoryRepuestos(){}

    public static FactoryRepuestos getInstance() {
        if (instance == null)
            instance = new FactoryRepuestos();
        return instance;
    }

    public void constriurRepuestos(TipoReparacion tipoReparacion){
        ArrayList<Repuesto> repuestos = new ArrayList<>();
        if (tipoReparacion.getCostoReparacion() == 1000.0){
            repuestos.add(new Repuesto("display nuevo",400.0));
        }
        else if (tipoReparacion.getCostoReparacion() == 600.0){
           repuestos.add(new Repuesto("pantalla nueva", 500.0));
           repuestos.add(new Repuesto("vidrio Templado", 50.0));
        }
        else if (tipoReparacion.getCostoReparacion() == 400.0){
            repuestos.add(new Repuesto("parlate nueva", 400.0));
        }
        else if (tipoReparacion.getCostoReparacion() == 500.0){
            repuestos.add(new Repuesto("microfono nueva", 500.0));
        }
        else
            System.out.println("el tipo de reparicion que solicitas no necesita repuesto");

        tipoReparacion.agregarRepuestos(repuestos);
    }

}
