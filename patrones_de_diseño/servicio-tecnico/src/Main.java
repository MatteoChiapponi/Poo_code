import FabricaDeRepuestos.FactoryRepuestos;
import FabricaDeTiposDeReparacion.FactoryTipoReparacion;
import models.Articulo;
import models.TipoReparacion;

public class Main {
    public static void main(String[] args) {
        FactoryTipoReparacion.getInstance();
        try {
            TipoReparacion tipoReparacion = FactoryTipoReparacion.crearReparacion(FactoryTipoReparacion.codigoArreglarDisplay);
            FactoryRepuestos.getInstance().constriurRepuestos(tipoReparacion);
            Articulo articulo1 = new Articulo("iphone 34", "andate a la mierda 1024", tipoReparacion);
            articulo1.darPresupuesto(1000.0);// setea el valor en la propiedad presupuesto
            articulo1.agregarRepuestos(100.0);// sout
            articulo1.adelantarEstadoProd();// pasa reparacion
            articulo1.darPresupuesto(10.0);// no se como no hacer que utilice parametros pero no hace nada xd
            articulo1.adelantarEstadoProd();
            articulo1.cambiarDireccion("anda la puta que lo pario 1023");
            System.out.println(articulo1.getDireccionEntrega());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
