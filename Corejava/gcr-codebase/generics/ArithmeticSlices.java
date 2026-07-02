import java.util.Scanner;

public class ArithmeticSlices {

    public static int numberOfArithmeticSlices(int[] nums) {

        int count = 0;
        int current = 0;

        for (int i = 2; i < nums.length; i++) {

            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                current++;
                count += current;
            } else {
                current = 0;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = numberOfArithmeticSlices(nums);

        System.out.println("Number of Arithmetic Slices = " + result);

        sc.close();
    }
}