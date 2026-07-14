class Node {
    int taskId;
    Node next;

    Node(int taskId) {
        this.taskId = taskId;
        this.next = null;
    }
}

class TaskQueue {

    // Remove a task with the given taskId
    public static Node removeTask(Node head, int taskId) {

        // If the queue is empty
        if (head == null) {
            return null;
        }

        // If the first task is the one to remove
        if (head.taskId == taskId) {
            return head.next;
        }

        Node prev = head;
        Node curr = head.next;

        // Search for the task
        while (curr != null && curr.taskId != taskId) {
            prev = curr;
            curr = curr.next;
        }

        // If task is found, remove it
        if (curr != null) {
            prev.next = curr.next;
        }

        return head;
    }

    // Display the task queue
    public static void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.taskId + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // Create queue: 101 -> 102 -> 103 -> 104
        Node head = new Node(101);
        head.next = new Node(102);
        head.next.next = new Node(103);
        head.next.next.next = new Node(104);

        System.out.println("Original Task Queue:");
        display(head);

        // Remove task 103
        head = removeTask(head, 103);

        System.out.println("Task Queue after removing task 103:");
        display(head);
    }
}