package Text;

public class Team {

    public String name;
    public int teamId;
    public PlayerList players;
    public int totalPoints;
    public int goalDifference;

    public Team(String name, int teamId) {
        this.name = name;
        this.teamId = teamId;
        this.players = new PlayerList();
        this.totalPoints = 0;
        this.goalDifference = 0;
    }

    public void addPlayer(PlayerList players) {
        this.players = players;
    }

    public int getGoalDifference() {
        return goalDifference;
    }

    public void setGoalDifference(int goalDifference) {
        this.goalDifference = goalDifference;
    }

    public PlayerList getPlayers() {
        return players;
    }

    public void setPlayers(PlayerList players) {
        this.players = players;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        totalPoints += totalPoints;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
