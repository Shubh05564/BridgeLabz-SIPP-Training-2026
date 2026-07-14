class Node {
    int pageId;
    Node next;

    Node(int pageId) {
        this.pageId = pageId;
        this.next = null;
    }
}

class ReverseHistory {

    // Reverse the linked list
    public static Node reverseHistory(Node head) {

        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    // Display list
    public static void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.pageId + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("Original History:");
        display(head);

        head = reverseHistory(head);

        System.out.println("Reversed History:");
        display(head);
    }
}