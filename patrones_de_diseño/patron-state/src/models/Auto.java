package models;

import status.Apagado;

public class Auto {
    private StateAuto state;
    private int velocidadActual = 0;
    private int combustibleActual = 0;

    public Auto(int combustibleActual) {

        this.combustibleActual = combustibleActual;
        state = new Apagado(this);
    }

    public void acelerar() {
        state.acelerear();
    }
    public void frenar(){
        state.frenar();
    }
    public void contacto(){
        state.contacto();
    }

    public StateAuto getState() {
        return state;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public int getCombustibleActual() {
        return combustibleActual;
    }
    public void setState(StateAuto state) {
        this.state = state;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public void setCombustibleActual(int combustibleActual) {
        this.combustibleActual = combustibleActual;
    }


}
