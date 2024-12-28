package Text;

public class Node {

    public TeamList teamList;
    public Team team;
    public Match match;
    public Player player;
    public Node next;

    public Node() {
        this.next = null;
    }

    public Node(Player player) {
        this.player = player;
        this.next = null;
    }

    public Node(Match match) {
        this.match = match;
        this.next = null;
    }

    public Node(Team team) {
        this.team = team;
        this.next = null;

    }

    public Node(TeamList teamList) {
        this.teamList = teamList;
    }

}
