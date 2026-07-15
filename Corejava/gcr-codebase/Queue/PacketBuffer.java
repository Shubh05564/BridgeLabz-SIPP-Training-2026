public class PacketBuffer {

    private int[] data;
    private int front;
    private int count;

    // Constructor
    public PacketBuffer(int capacity) {
        data = new int[capacity];
        front = 0;
        count = 0;
    }

    // Enqueue operation
    public boolean enqueue(int packetId) {

        if (count == data.length) {
            System.out.println("Buffer is Full");
            return false;
        }

        int rear = (front + count) % data.length;
        data[rear] = packetId;
        count++;

        return true;
    }

    // Dequeue operation
    public int dequeue() {

        if (count == 0) {
            throw new RuntimeException("Buffer is Empty");
        }

        int value = data[front];

        front = (front + 1) % data.length;
        count--;

        return value;
    }

    // Peek operation
    public int peek() {

        if (count == 0) {
            throw new RuntimeException("Buffer is Empty");
        }

        return data[front];
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return count == 0;
    }

    // Display queue
    public void display() {

        if (isEmpty()) {
            System.out.println("Buffer is Empty");
            return;
        }

        System.out.print("Packet Buffer: ");

        for (int i = 0; i < count; i++) {
            System.out.print(data[(front + i) % data.length] + " ");
        }

        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        PacketBuffer buffer = new PacketBuffer(5);

        buffer.enqueue(101);
        buffer.enqueue(102);
        buffer.enqueue(103);
        buffer.enqueue(104);

        buffer.display();

        System.out.println("Processed Packet: " + buffer.dequeue());

        buffer.display();

        buffer.enqueue(105);
        buffer.enqueue(106);

        buffer.display();

        System.out.println("Front Packet: " + buffer.peek());
    }
}