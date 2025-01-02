package Text;

public class Player {

    public String playerName;
    public int playerId;
    public String position;
    public int goalsScored;

    public Player() {
    }

    public Player(Team team, int playerId, String playerName, String position) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.position = position;
        this.goalsScored = 0;

    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
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

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPosition() {
        return position;
    }

}
