import java.util.Scanner;

public class PrintNto1 {

    // Recursive function
    public static void printNumbers(int n) {
        if (n == 0) { // Base case
            return;
        }

        System.out.print(n + " ");
        printNumbers(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        printNumbers(n);

        sc.close();
    }
}