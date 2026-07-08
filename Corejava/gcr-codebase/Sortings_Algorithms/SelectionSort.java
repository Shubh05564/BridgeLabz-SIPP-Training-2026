import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            // Find the minimum element
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the minimum element with the current element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {

        int[] examScores = {78, 92, 65, 88, 70, 95, 81};

        System.out.println("Before Sorting: " + Arrays.toString(examScores));

        selectionSort(examScores);

        System.out.println("After Sorting: " + Arrays.toString(examScores));
    }
}