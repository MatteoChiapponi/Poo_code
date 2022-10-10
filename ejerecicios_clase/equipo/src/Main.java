import Models.Player;
import Models.Team;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("dembele",false,true,1);
        Player player2 = new Player("ronaldo",true,true,2);
        Player player3 = new Player("messi",true,false,3);
        Player player4 = new Player("de paul",true,false,4);
        Player player5 = new Player("roman",false,true,5);
        Team team1 = new Team("boquita");
        team1.addPlayer(player2);
        team1.addPlayer(player3);
        team1.addPlayer(player4);
        team1.addPlayer(player5);
        team1.addPlayer(player1);
        team1.mostrarTitulares();
        System.out.println(team1.numberInjured());
    }

}
