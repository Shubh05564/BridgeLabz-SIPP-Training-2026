import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] arr) {

        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int key = arr[i];
            int j = i - 1;

            // Move elements greater than key one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert key at its correct position
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        int[] employeeIds = {105, 102, 108, 101, 104, 103};

        System.out.println("Before Sorting: " + Arrays.toString(employeeIds));

        insertionSort(employeeIds);

        System.out.println("After Sorting: " + Arrays.toString(employeeIds));
    }
}