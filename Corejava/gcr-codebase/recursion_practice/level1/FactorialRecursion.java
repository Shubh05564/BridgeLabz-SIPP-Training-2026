import java.util.Scanner;

public class FactorialRecursion {

    // Recursive function to calculate factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1) { // Base case
            return 1;
        }
        return n * factorial(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Factorial = " + factorial(n));

        sc.close();
    }
}