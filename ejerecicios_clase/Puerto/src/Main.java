import Models.Container;
import Models.Port;

public class Main {
    public static void main(String[] args) {

        Port port1 = new Port();
        Container container1 = new Container(1, "desconocido", true);
        Container container2 = new Container(2, "china", true);
        Container container3 = new Container(3, "eeuu", false);
        Container container4 = new Container(4, "francia", false);
        port1.addContainer(container1);
        port1.addContainer(container4);
        port1.addContainer(container3);
        port1.addContainer(container2);
        System.out.println(port1.numberDangerousLoad());
        System.out.println(port1.numberUnknown());
        port1.showContainers();
    }
}
