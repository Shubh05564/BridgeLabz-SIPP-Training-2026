import java.util.*;

public class TopKLargest {

    static List<Integer> topKLargest(int[] transactions, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int amount : transactions) {

            if (minHeap.size() < k) {
                minHeap.offer(amount);
            }
            else if (amount > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(amount);
            }
        }

        return new ArrayList<>(minHeap);
    }

    public static void main(String[] args) {

        int[] transactions = {10, 50, 20, 80, 70, 40, 90};
        int k = 3;

        List<Integer> result = topKLargest(transactions, k);

        Collections.sort(result, Collections.reverseOrder());

        System.out.println("Top " + k + " Largest Values:");

        for (int x : result)
            System.out.print(x + " ");
    }
}