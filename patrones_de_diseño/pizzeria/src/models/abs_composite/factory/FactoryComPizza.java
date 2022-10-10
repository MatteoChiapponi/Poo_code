package models.abs_composite.factory;

import models.abs_composite.CompositePizza;
import models.abs_composite.PizzaSimple;

public class FactoryComPizza {

    public static final String pizzaAnana = "anana";
    public static final String pizzaMuzza = "muzza";
    public static final String pizaEspecial = "jamon";
    public static final String pizaFuga = "cebolla";
    private static FactoryComPizza instance;

    private FactoryComPizza() {
    }

    public static FactoryComPizza getInstance(){
        if (instance == null)
            return new FactoryComPizza();
        return instance;
    }

    public CompositePizza crearPizza(String codigo) {
        switch (codigo){
            case pizaEspecial: return new PizzaSimple("especial","es de jamon y ta rica",false, 850.0);
            case pizzaAnana: return new PizzaSimple("anana","es de anana", false,950.0);
            case pizzaMuzza:return new PizzaSimple("muzzarela", "es de queso", false,700.0);
            case pizaFuga: return new PizzaSimple("fugazzetta", "es de cebolla",true,1200.0);
            default: throw new RuntimeException("ingresaste un codugo invalido");
        }
    }
}
