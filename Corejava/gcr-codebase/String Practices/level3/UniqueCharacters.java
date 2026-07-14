import java.util.Scanner;

public class UniqueCharacters {

    // Method to find length without using length()
    public static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }

        return count;
    }

    // Method to find unique characters
    public static char[] findUniqueCharacters(String text) {

        int len = findLength(text);

        // Temporary array to store unique characters
        char[] temp = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {

            char current = text.charAt(i);
            boolean isUnique = true;

            // Check previous characters
            for (int j = 0; j < i; j++) {
                if (current == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount++] = current;
            }
        }

        // Create final array of exact size
        char[] result = new char[uniqueCount];

        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char[] uniqueChars = findUniqueCharacters(text);

        System.out.println("\nUnique Characters:");

        for (char ch : uniqueChars) {
            System.out.print(ch + " ");
        }

        sc.close();
    }
}