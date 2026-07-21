class Node {

    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}

public class ValidateBST {

    static boolean isValidBST(Node root) {

        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    static boolean validate(Node node, long min, long max) {

        if (node == null)
            return true;

        if (node.val <= min || node.val >= max)
            return false;

        return validate(node.left, min, node.val)
                && validate(node.right, node.val, max);
    }

    public static void main(String[] args) {

        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        System.out.println(isValidBST(root));
    }
}