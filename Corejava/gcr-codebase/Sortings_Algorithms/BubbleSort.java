import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swapping happens, array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {

        int[] marks = {78, 45, 90, 62, 55, 88, 71};

        System.out.println("Before Sorting: " + Arrays.toString(marks));

        bubbleSort(marks);

        System.out.println("After Sorting: " + Arrays.toString(marks));
    }
}