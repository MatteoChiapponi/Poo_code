package Models;

public class Player implements Comparable<Player>{
    private String name;
    private boolean esTitular;
    private boolean isInjured;
    private Integer nroCamiseta;

    public Player(String name, boolean esTitular, boolean isInjured, Integer nroCamiseta) {
        this.name = name;
        this.esTitular = esTitular;
        this.isInjured = isInjured;
        this.nroCamiseta = nroCamiseta;
    }


    @Override
    public int compareTo(Player o) {
        return nroCamiseta.compareTo(o.nroCamiseta);
    }

    public boolean isEsTitular() {
        return esTitular;
    }

    public boolean isInjured() {
        return isInjured;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", esTitular=" + esTitular +
                ", isInjured=" + isInjured +
                ", nroCamiseta=" + nroCamiseta +
                '}';
    }
}
