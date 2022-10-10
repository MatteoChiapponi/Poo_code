package Models;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> teamPlayers;

    public Team(String name) {
        this.name = name;
        teamPlayers = new ArrayList<>();
    }

    public Team(String name, List<Player> teamPlayers) {
        this.name = name;
        this.teamPlayers = teamPlayers;
    }

    public void addPlayer(Player player){
        teamPlayers.add(player);
    }
    public void mostrarTitulares(){
        ArrayList<Player> sortedPlayers = new ArrayList<>();
        for (Player player:teamPlayers) {
            sortedPlayers.add(player);
        }
        sortedPlayers.sort(Player::compareTo);
        for (Player p:sortedPlayers) {
            if (p.isEsTitular())
                System.out.println(p.toString());
        }
    }
    public int numberInjured(){
        int injured = 0;
        for (Player player:teamPlayers) {
            if (player.isInjured())
                injured++;
        }
        return injured;
    }
}
