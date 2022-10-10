import java.util.Date;

public class Articulo {

    String nombre = "";
    int idArticulo = 0;

    Date empaquetado;
    Date vencimiento;

    int financiacion;

    double precio;


    public int getFinanciacion(){

        return financiacion;

    }

    public Articulo ( String nombre, int idArticulo, Date empaquetado, Date vencimiento, int financiacion, double precio){

        this.nombre = nombre;
        this.idArticulo = idArticulo;
        this.empaquetado = empaquetado;
        this.vencimiento = vencimiento;

    }

}
