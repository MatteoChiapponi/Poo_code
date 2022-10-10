package FabricaDeTiposDeReparacion;

import FabricaDeTiposDeReparacion.exceptions.ReparacionException;
import models.TipoReparacion;

public class FactoryTipoReparacion {
    private static FactoryTipoReparacion instance;

    public static final String codigoArreglarPantalla = "arreglarPantalla";
    public static final String codigoArreglarMicrofono = "arreglarMicrofono";
    public static final String codigoArreglarDisplay = "arreglarDisplay";
    public static final String codugoArreglarParlante = "arreglarParlante";

    private FactoryTipoReparacion() {

    }

    public static FactoryTipoReparacion getInstance() {
        if (instance == null)
            instance = new FactoryTipoReparacion();
        return instance;
    }

    public static TipoReparacion crearReparacion(String codigo) throws Exception {
        switch (codigo) {
            case codigoArreglarDisplay:
                return new TipoReparacion(1000.0, codigoArreglarDisplay);
            case codigoArreglarMicrofono:
                return new TipoReparacion(500.0, codigoArreglarMicrofono);
            case codigoArreglarPantalla:
                return new TipoReparacion(600.0, codigoArreglarPantalla);
            case codugoArreglarParlante:
                return new TipoReparacion(400.0, codugoArreglarParlante);
            default:
                throw new ReparacionException("ingresaste un codugo invalido " + codigo);
        }
    }
}
