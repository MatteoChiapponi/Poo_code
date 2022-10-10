package factory;

import exceptions.FacotyException;
import models.Caja;
import models.Pelota;
import models.abs.Product;

public class ProductFactory {

    public static final String caja10x10 = "CAJA10X10";
    public static final String pelotaFutbol = "PELOTAFUTBOL";
    public static final String pelotaTenis = "PELOTATENIS";

    // singleton
    private static ProductFactory instance;

    private ProductFactory(){

    }

    public static ProductFactory getInstance(){
        if (instance == null)
            instance = new ProductFactory();
        return instance;
    }

    // factory method

    public static Product construir(String tipoProducto) throws Exception{

     switch (tipoProducto){
         case caja10x10:
             return new Caja(123.3,10.0,10.0,10.0);
         case pelotaFutbol:
             return new Pelota(10.9,11.0);
         case pelotaTenis:
             return new Pelota(5.8,0.32);
         default:
             throw new FacotyException("no ingtresaste un producto habilitado");
        }
    }
}
