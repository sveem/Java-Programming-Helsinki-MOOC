
import java.util.ArrayList;

public class Team {

    private String teamName;
    private ArrayList<Player> team;
    private int teamSize;

    public Team(String teamName) {
        this.teamName = teamName;
        this.team = new ArrayList<Player>();
        this.teamSize = 16;
    }

    public String getName() {
        return this.teamName;
    }

    public void addPlayer(Player player) {
        if (this.size() < this.teamSize) {
            this.team.add(player);
        }
    }

    public void printPlayers() {
        for (Player player : this.team) {
            System.out.println(player);
        }
    }

    public void setMaxSize(int maxSize) {
        this.teamSize = maxSize;
    }

    public int size() {
        return this.team.size();
    }

    public int goals() {
        int totalGoals = 0;
        for (Player player : this.team) {
            totalGoals += player.goals();
        }
        return totalGoals;
    }
}
