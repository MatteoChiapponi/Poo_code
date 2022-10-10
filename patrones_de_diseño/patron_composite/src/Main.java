import models.Tren;
import models.Vagon;
import models.abs.Circulo;
import models.abs.Figura;
import models.abs.Rectangulo;
import models.abs.TrianguloR;
import models.composite.VagonCompuesto;
import models.factoryfiguras.FactoryFiguras;

public class Main {
    public static void main(String[] args) {

        FactoryFiguras factoryFiguras = FactoryFiguras.getInstance();
        try {
            VagonCompuesto circulo = factoryFiguras.crearFiguras(FactoryFiguras.codCirculo);
            VagonCompuesto rectangulo =factoryFiguras.crearFiguras(FactoryFiguras.codReactangulo);
            VagonCompuesto triangulo =factoryFiguras.crearFiguras(FactoryFiguras.codTriangulo);
            Vagon vagon1 = new Vagon();
            vagon1.addVagonCompuesto(circulo);
            vagon1.addVagonCompuesto(rectangulo);
            vagon1.addVagonCompuesto(triangulo);

            Tren tren1 = new Tren();
            tren1.addVagonCompuesto(vagon1);
            tren1.addVagonCompuesto(circulo);
            tren1.addVagonCompuesto(rectangulo);
            tren1.addVagonCompuesto(triangulo);

            System.out.println(circulo.calcularArea());
            System.out.println(rectangulo.calcularArea());
            System.out.println(triangulo.calcularArea());

            System.out.println(vagon1.calcularArea());

            System.out.println(tren1.calcularArea());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
