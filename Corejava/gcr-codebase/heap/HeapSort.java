public class HeapSort {

    static void heapSort(int[] arr) {
        int n = arr.length;

        // Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extract elements one by one
        for (int end = n - 1; end > 0; end--) {

            // Move current maximum to end
            int temp = arr[0];
            arr[0] = arr[end];
            arr[end] = temp;

            // Heapify the reduced heap
            heapify(arr, end, 0);
        }
    }

    static void heapify(int[] arr, int size, int i) {
        int largest = i;

        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < size && arr[left] > arr[largest])
            largest = left;

        if (right < size && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, size, largest);
        }
    }

    public static void main(String[] args) {

        int[] arr = {12, 11, 13, 5, 6, 7};

        heapSort(arr);

        System.out.println("Sorted Array:");

        for (int x : arr)
            System.out.print(x + " ");
    }
}