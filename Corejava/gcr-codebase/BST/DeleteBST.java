class Node {

    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}

public class DeleteBST {

    static Node delete(Node node, int key) {

        if (node == null)
            return null;

        if (key < node.val) {

            node.left = delete(node.left, key);

        } else if (key > node.val) {

            node.right = delete(node.right, key);

        } else {

            if (node.left == null && node.right == null)
                return null;

            if (node.left == null)
                return node.right;

            if (node.right == null)
                return node.left;

            Node successor = node.right;

            while (successor.left != null)
                successor = successor.left;

            node.val = successor.val;

            node.right = delete(node.right, successor.val);
        }

        return node;
    }

    static void inorder(Node root) {

        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        root = delete(root, 30);

        inorder(root);
    }
}