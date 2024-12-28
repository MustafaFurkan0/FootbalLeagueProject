package Text;

public class BinarySearchTree {

    class BSTNode {

        Team team;
        BSTNode left, right;

        public BSTNode(Team team) {
            this.team = team;
            left = right = null;
        }
    }
    private BSTNode root;

    public BinarySearchTree() {
        root = null;
    }

    public void add(Team team) {
        root = addRecursive(root, team);
    }

    private BSTNode addRecursive(BSTNode node, Team team) {
        if (node == null) {
            return new BSTNode(team);
        }

        if (team.name.compareTo(node.team.name) < 0) {
            node.left = addRecursive(node.left, team);
        } else if (team.name.compareTo(node.team.name) > 0) {
            node.right = addRecursive(node.right, team);
        }

        return node;
    }
    // Takım arama

    public Team search(String teamName) {
        return searchRecursive(root, teamName);
    }

    private Team searchRecursive(BSTNode node, String teamName) {
        if (node == null || node.team.name.equals(teamName)) {
            return node == null ? null : node.team;
        }

        if (teamName.compareTo(node.team.name) < 0) {
            return searchRecursive(node.left, teamName);
        }

        return searchRecursive(node.right, teamName);
    }

}
