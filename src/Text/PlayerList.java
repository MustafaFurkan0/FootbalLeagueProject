package Text;

public class PlayerList {

    public Node head;

    public PlayerList() {
        this.head = null;
    }

    public void addPlayer(Player player) {
        Node newNode = new Node(player);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void remove(int playerId) {
        if (head == null) {
            return;
        }
        if (head.player.getId() == playerId) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.player.getId() != playerId) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }
// Oyuncu güncelle

    public void updatePlayer(int id, String newName, String newPosition, int newGoals) {
        Node current = head;
        while (current != null) {
            if (current.player.getId() == id) {
                if (newName != null && !newName.isEmpty()) {
                    current.player.playerName = newName;
                }
                if (newPosition != null && !newPosition.isEmpty()) {
                    current.player.position = newPosition;
                }
                if (newGoals >= 0) {
                    current.player.goalsScored = newGoals;
                }
                return;
            }
            current = current.next;
        }
        System.out.println("Oyuncu bulunamadı: " + id);
    }

}
