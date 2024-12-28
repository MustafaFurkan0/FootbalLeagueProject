package Text;

public class Player {

    public String playerName;
    public int playerId;
    public String position; // Kaleci, Forvet, Orta Saha
    public int goalsScored;

    public Player() {
    }

    // Constructor
    public Player(Team team, int playerId, String playerName, String position) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.position = position;
        this.goalsScored = 0;

    }

    public String getName() {
        return playerName;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public int getId() {
        return playerId;
    }

    public void updateGoals(int goals) {
        this.goalsScored += goals;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}
