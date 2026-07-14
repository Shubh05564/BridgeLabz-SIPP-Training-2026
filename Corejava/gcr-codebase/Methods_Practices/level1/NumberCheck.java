import java.util.Scanner;

public class NumberCheck {

    // Method to check the number
    public static int checkNumber(int num) {
        if (num > 0) {
            return 1;   // Positive
        } else if (num < 0) {
            return -1;  // Negative
        } else {
            return 0;   // Zero
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int result = checkNumber(num);

        // Display result
        if (result == 1) {
            System.out.println(num + " is a Positive Number.");
        } else if (result == -1) {
            System.out.println(num + " is a Negative Number.");
        } else {
            System.out.println("The number is Zero.");
        }

        sc.close();
    }
}   