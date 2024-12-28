package Text;

public class Stack {

    private Node top;

    public Stack() {
        top = null;
    }

    public void push(Match match) {
        Node newNode = new Node(match);
        newNode.next = top;
        top = newNode;
    }

    public Match pop() {
        if (top == null) {
            return null;
        }
        Match match = top.match;
        top = top.next;
        return match;
    }

    public boolean isEmpty() {
        return top == null;
    }

}
