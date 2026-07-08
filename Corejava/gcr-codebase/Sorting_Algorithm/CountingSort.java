import java.util.Arrays;

public class CountingSort {

    public static void countingSort(int[] arr) {

        int n = arr.length;

        if (n == 0) {
            return;
        }

        // Find the maximum element
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Create count and output arrays
        int[] count = new int[max + 1];
        int[] output = new int[n];

        // Store count of each element
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // Update count array with cumulative counts
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array (iterate backwards for stability)
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // Copy output array back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {

        int[] arr = {4, 2, 2, 8, 3, 3, 1};

        System.out.println("Before Sorting: " + Arrays.toString(arr));

        countingSort(arr);

        System.out.println("After Sorting: " + Arrays.toString(arr));
    }
}