import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Recursive function to find sum
    public static int sum(int n) {
        if (n == 1) { // Base case
            return 1;
        }
        return n + sum(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        System.out.println("Sum = " + sum(n));

        sc.close();
    }
}