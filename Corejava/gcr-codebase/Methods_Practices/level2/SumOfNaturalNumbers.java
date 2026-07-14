import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to find sum using recursion
    public static int recursiveSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + recursiveSum(n - 1);
    }

    // Method to find sum using formula
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Check if the number is a natural number
        if (n <= 0) {
            System.out.println("Invalid input! Please enter a natural number.");
        } else {
            int sumRecursion = recursiveSum(n);
            int sumFormula = formulaSum(n);

            System.out.println("Sum using Recursion = " + sumRecursion);
            System.out.println("Sum using Formula = " + sumFormula);

            if (sumRecursion == sumFormula) {
                System.out.println("Both computations are correct and give the same result.");
            } else {
                System.out.println("The results do not match.");
            }
        }

        sc.close();
    }
}