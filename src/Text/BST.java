package Text;

import javax.swing.JOptionPane;

public class BST {

    public class BstNode {

        public String name;
        public Team team;
        public BstNode left;
        public BstNode right;

        public BstNode(Team team) {
            this.name = team.getName();
            this.team = team;
            this.left = null;
            this.right = null;
        }
    }

    public BstNode root;

    public BST() {
        this.root = null;
    }

    private int compareStrings(String str1, String str2) {
        return str1.compareTo(str2);
    }

    public void insert(Team team) {
        BstNode newNode = new BstNode(team);
        if (root == null) {
            root = newNode;
        } else {
            root = insertRecursive(root, newNode);
        }
    }

    private BstNode insertRecursive(BstNode current, BstNode newNode) {
        if (current == null) {
            return newNode;
        }

        if (compareStrings(newNode.team.getName(), current.team.getName()) < 0) {
            current.left = insertRecursive(current.left, newNode);
        } else {
            current.right = insertRecursive(current.right, newNode);
        }
        return current;
    }

    public BstNode search(String name) {
        BstNode result = searchRecursive(root, name);
        if (result == null) {
            JOptionPane.showMessageDialog(null, "THE TEAM İS NOT FOUND, PLEASE TRY AGAİN !!", "Celal Bayar League", JOptionPane.INFORMATION_MESSAGE);
        }
        return result;
    }

    private BstNode searchRecursive(BstNode current, String name) {
        if (current == null) {
            return null;
        }

        int comparison = compareStrings(name, current.name);
        if (comparison == 0) {
            return current;
        } else if (comparison < 0) {
            return searchRecursive(current.left, name);
        } else {
            return searchRecursive(current.right, name);
        }
    }
}
