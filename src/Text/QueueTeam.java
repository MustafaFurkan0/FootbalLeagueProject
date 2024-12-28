package Text;

public class QueueTeam {

    private Node front;
    private Node rear;

    public QueueTeam() {
        front = rear = null;
    }

    public void enqueue(Match match) {
        Node newNode = new Node(match);
        if (rear != null) {
            rear.next = newNode;
        }
        rear = newNode;
        if (front == null) {
            front = newNode;
        }
    }

    public Match dequeue() {
        if (front == null) {
            return null; // Kuyruk boşsa
        }
        Match match = front.match;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return match;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void clear() {
        front = rear = null;
    }

}
