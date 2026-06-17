import java.util.Scanner;

public class ConsecutiveSensorReadings {

    // Recursive function to check strictly increasing
    public static boolean isIncreasing(int[] arr, int index) {
        if (index == arr.length - 1) { // Base case
            return true;
        }

        if (arr[index] >= arr[index + 1]) {
            return false;
        }

        return isIncreasing(arr, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(isIncreasing(arr, 0));

        sc.close();
    }
}