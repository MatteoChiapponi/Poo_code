package ejercicio2;

public class Player extends Employed{

    private boolean titular;
    private int numeroCamiseta;

    private Double precio;

    private String posicion;

    public Player(String nombre, int dni, Double sueldo, boolean titular, int numeroCamiseta, Double precio, String posicion) {
        super(nombre, dni, sueldo);
        this.titular = titular;
        this.numeroCamiseta = numeroCamiseta;
        this.precio = precio;
        this.posicion = posicion;
    }


    public boolean isTitular() {
        return titular;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }


    public Double getPrecio() {
        return precio;
    }

    public String getPosicion() {
        return posicion;
    }

    @Override
    public String toString() {
        return "Player{" +
                "titular=" + titular +
                ", numeroCamiseta=" + numeroCamiseta +
                ", precio=" + precio +
                ", posicion='" + posicion + '\'' +
                '}'+
                super.getNombre()+
                super.getDni();
    }
}
