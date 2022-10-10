import models.abs_composite.CompositePizza;
import models.abs_composite.PizzaCombinada;
import models.abs_composite.factory.FactoryComPizza;

public class Main {
    public static void main(String[] args) {
        FactoryComPizza factoryPizzas = FactoryComPizza.getInstance();
        CompositePizza pizza1 = factoryPizzas.crearPizza(FactoryComPizza.pizzaAnana);
        CompositePizza pizza2 = factoryPizzas.crearPizza(FactoryComPizza.pizaEspecial);
        System.out.println(factoryPizzas.crearPizza(FactoryComPizza.pizzaMuzza).calcularPrecio());
        System.out.println(factoryPizzas.crearPizza(FactoryComPizza.pizaFuga).calcularPrecio());
        PizzaCombinada pizzaCombinada = new PizzaCombinada("especial mateo","anana y especial");
        pizzaCombinada.addPizza(pizza1);
        pizzaCombinada.addPizza(pizza2);
        System.out.println(pizzaCombinada.calcularPrecio());


    }
}
