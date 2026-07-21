class Node {

    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}

public class HeightOfTree {

    static int height(Node node) {

        if (node == null)
            return -1;

        int leftHeight = height(node.left);

        int rightHeight = height(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    static boolean isTooDeep(Node root, int threshold) {

        return height(root) > threshold;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.left.left = new Node(5);

        int threshold = 2;

        System.out.println("Height = " + height(root));
        System.out.println("Too Deep = " + isTooDeep(root, threshold));
    }
}