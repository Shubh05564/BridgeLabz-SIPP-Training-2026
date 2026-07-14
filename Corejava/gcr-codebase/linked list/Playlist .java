class Node {
    int trackId;
    Node next;

    Node(int trackId) {
        this.trackId = trackId;
        this.next = null;
    }
}

class Playlist {

    // Insert a new track after the current track
    public static void insertAfter(Node current, int trackId) {

        if (current == null) {
            System.out.println("Current track does not exist.");
            return;
        }

        Node newNode = new Node(trackId);

        // Step 1: Save the remaining queue
        newNode.next = current.next;

        // Step 2: Link current track to the new track
        current.next = newNode;
    }

    // Display the playlist
    public static void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.trackId + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // Create playlist: 101 -> 102 -> 103
        Node head = new Node(101);
        head.next = new Node(102);
        head.next.next = new Node(103);

        System.out.println("Original Playlist:");
        display(head);

        // Insert track 104 after track 102
        insertAfter(head.next, 104);

        System.out.println("Playlist after insertion:");
        display(head);
    }
}