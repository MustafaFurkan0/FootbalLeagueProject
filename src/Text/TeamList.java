package Text;

public class TeamList {

    public Node head;

    public TeamList() {
        this.head = null;
    }
    
    public Node getHead() {
        return head;
    }
    public void addTeam(Team team) {
        Node newNode = new Node(team);
        if (head == null) { 
            head = newNode;
        } else {  //Sona ekleme
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void deleteTeam(int teamID) {
        if (head == null) {
            return;
        }
        if (head.team.getTeamId() == teamID) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.team.getTeamId() != teamID) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public void updateTeam(int teamID, String newName, int newPoints, int newGoalDifference) { //Takımları ıd değerine göre güncelleme
        Node temp = head;
        while (temp != null) {
            if (temp.team.getTeamId() == teamID) {
                temp.team.setName(newName);
                temp.team.setTotalPoints(newPoints);

                return;
            }
            temp = temp.next;
        }
    }

    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public Team get(int index) {
        int currentIndex = 0;
        Node current = head;

        while (current != null) {
            if (currentIndex == index) {
                return current.team;
            }
            current = current.next;
            currentIndex++;
        }

        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
    }

    public Team getTeamById(int teamId) {
        Node temp = head;
        while (temp != null) {
            if (temp.team.getTeamId() == teamId) {
                return temp.team;  
            }
            temp = temp.next;
        }
        return null;  
    }

    

}
