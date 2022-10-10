package Models;

import java.util.ArrayList;
import java.util.List;

public class Port {

    private List<Container> containersPort;

    public Port() {
        containersPort = new ArrayList<>();
    }

    public void addContainer(Container container){containersPort.add(container);}
    public void showContainers(){
        ArrayList<Container> sortedContainers = new ArrayList<>();
        for (Container c:containersPort) {
            sortedContainers.add(c);
        }

        sortedContainers.sort(Container::compareTo);

        for (Container container:sortedContainers) {
            System.out.println(container.toString());
        }
    }
    public int numberDangerousLoad(){
    int acc = 0;
        for (Container c:containersPort) {
            if (c.getDangerousLoad())
                acc += 1;
        }

    return acc;
    }
    public int numberUnknown(){
        int acc = 0;
        for (Container c:containersPort) {
            if (c.getOriginCountry().equals("desconocido"))
            acc += 1;
        }
        return acc;
    }
}
