import models.Auto;

public class Main {
    public static void main(String[] args) {

        Auto miAutoCheto = new Auto(100);

        // HAPPY PATH
        miAutoCheto.contacto(); // pasar parado
        miAutoCheto.acelerar(); // pasa enmarcha
        miAutoCheto.acelerar();
        miAutoCheto.acelerar();
        miAutoCheto.acelerar();
        miAutoCheto.acelerar();
        miAutoCheto.acelerar();
        miAutoCheto.acelerar();
        miAutoCheto.acelerar();
        miAutoCheto.acelerar();
        miAutoCheto.acelerar();
        miAutoCheto.acelerar();

        /* RECORRIDO CON ERRORES
        Auto miAutoChoto = new Auto(200);
        miAutoChoto.acelerar(); // Error
        miAutoChoto.contacto();
        miAutoChoto.frenar(); // Error
        miAutoChoto.acelerar();
        miAutoChoto.acelerar();
        miAutoChoto.acelerar();
        miAutoChoto.contacto(); // Error
        miAutoChoto.frenar();
        miAutoChoto.acelerar(); // pasa sinnafta
        miAutoChoto.acelerar(); // Error
     */
    }
}
