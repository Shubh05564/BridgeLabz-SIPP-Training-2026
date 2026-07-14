import java.util.Scanner;

public class StringLengthWithoutLengthMethod {

    // Method to find length without using length()
    public static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // End of string reached
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        int userLength = findLength(text);
        int builtInLength = text.length();

        System.out.println("Length using user-defined method: " + userLength);
        System.out.println("Length using built-in length() method: " + builtInLength);

        if (userLength == builtInLength) {
            System.out.println("Both lengths are equal.");
        } else {
            System.out.println("Lengths are not equal.");
        }

        sc.close();
    }
}