package Models;

public class Oferente implements Observador{

    private Subasta subasta;
    private String nombre;
    private String apellido;
    private Integer dni;
    private Double maximoDisponible;

    public Oferente(String nombre, String apellido, Integer dni, Double maximoDisponible, Subasta subasta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.maximoDisponible = maximoDisponible;
        this.subasta = subasta;
    }

    @Override
    public void pujar(Subasta subasta, Double monto) {
        if (monto>maximoDisponible)
            System.out.println(monto + " excede tu monto maximo");
        else if (subasta.getMonto() > monto)
            System.out.println("tu monto de puja tiene que ser mayor a " + subasta.getMonto());
        else {
            subasta.setMonto(monto);
            System.out.println("puja exitosa");
        }
    }

    @Override
    public void actualizar() {
        System.out.println("el oferente: " + nombre + " fue notificado del monto de la subasta " + subasta.getMonto());
    }

    public String getNombre() {
        return nombre;
    }

    public Double getMaximoDisponible() {
        return maximoDisponible;
    }
}
