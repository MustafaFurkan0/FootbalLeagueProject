package Text;

public class BST {

    public class BstNode {

        public String name;  // Takım veya oyuncunun adı
        public Team team;    // Takım bilgisi
        public BstNode left; // Sol çocuk düğüm
        public BstNode right; // Sağ çocuk düğüm

        public BstNode(Team team) {
            this.name = team.getName();
            this.team = team;
            this.left = null;
            this.right = null;
        }
    }

    public BstNode root; // Ağacın kök düğümü

    public BST() {
        this.root = null; // Başlangıçta kök düğüm boş
    }

    private int compareStrings(String str1, String str2) {
        return str1.compareTo(str2);
    }

    public void insert(Team team) {
        BstNode newNode = new BstNode(team);
        if (root == null) {
            root = newNode; // Eğer ağaç boşsa, kök düğüm olarak ekle
        } else {
            root = insertRecursive(root, newNode);
        }
    }

    private BstNode insertRecursive(BstNode current, BstNode newNode) {
        if (current == null) {
            return newNode; // Uygun bir yere düğümü ekle
        }

        if (compareStrings(newNode.team.getName(), current.team.getName()) < 0) {
            current.left = insertRecursive(current.left, newNode); // Sol dal
        } else {
            current.right = insertRecursive(current.right, newNode); // Sağ dal
        }
        return current;
    }

    public BstNode search(String name) {

        return searchRecursive(root, name);
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
