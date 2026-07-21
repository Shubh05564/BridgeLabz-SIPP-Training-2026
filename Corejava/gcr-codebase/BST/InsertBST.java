class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}

public class InsertBST {

    static Node insert(Node node, int id) {

        if (node == null)
            return new Node(id);

        if (id < node.val)
            node.left = insert(node.left, id);

        else if (id > node.val)
            node.right = insert(node.right, id);

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

        insert(root, 40);
        insert(root, 60);
        insert(root, 80);

        inorder(root);
    }
}