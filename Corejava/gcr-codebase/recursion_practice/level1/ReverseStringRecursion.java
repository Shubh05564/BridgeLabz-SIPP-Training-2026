import java.util.Scanner;

public class ReverseStringRecursion {

    // Recursive function to reverse string
    public static String reverse(String str) {
        if (str.isEmpty()) { // Base case
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.println("Reversed String: " + reverse(str));

        sc.close();
    }
}  