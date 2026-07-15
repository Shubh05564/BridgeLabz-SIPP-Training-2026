import java.util.ArrayDeque;
import java.util.Deque;

public class PrintQueue {

    private Deque<Integer> printQueue;

    // Constructor
    public PrintQueue() {
        printQueue = new ArrayDeque<>();
    }

    // Add normal job to the back
    public void submitJob(int jobId) {
        printQueue.addLast(jobId);
        System.out.println("Normal Job Added: " + jobId);
    }

    // Add urgent job to the front
    public void submitUrgentJob(int jobId) {
        printQueue.addFirst(jobId);
        System.out.println("Urgent Job Added: " + jobId);
    }

    // Print next job
    public int printNextJob() {

        if (printQueue.isEmpty()) {
            throw new RuntimeException("No jobs in queue");
        }

        return printQueue.removeFirst();
    }

    // Display queue
    public void displayQueue() {

        if (printQueue.isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Current Print Queue:");
        for (int job : printQueue) {
            System.out.print(job + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        PrintQueue queue = new PrintQueue();

        queue.submitJob(101);
        queue.submitJob(102);
        queue.submitJob(103);

        queue.submitUrgentJob(999);

        queue.displayQueue();

        System.out.println("Printing Job: " + queue.printNextJob());

        queue.displayQueue();
    }
}