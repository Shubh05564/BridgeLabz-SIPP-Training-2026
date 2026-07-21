import java.util.*;

class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}

public class InorderTraversal {

    static void inorder(Node node, List<Integer> result) {

        if (node == null)
            return;

        inorder(node.left, result);

        result.add(node.val);

        inorder(node.right, result);
    }

    static List<Integer> getSortedLeaderboard(Node root) {

        List<Integer> result = new ArrayList<>();

        inorder(root, result);

        return result;
    }

    public static void main(String[] args) {

        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(5);
        root.right.right = new Node(7);

        System.out.println(getSortedLeaderboard(root));
    }
}