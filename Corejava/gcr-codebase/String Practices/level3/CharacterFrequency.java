import java.util.Scanner;

public class CharacterFrequency {

    // Method to find character frequencies
    public static String[][] findFrequency(String text) {

        int[] frequency = new int[256];

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        // Count unique characters
        int uniqueCount = 0;

        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        // Create 2D array
        String[][] result = new String[uniqueCount][2];

        int index = 0;

        for (int i = 0; i < 256; i++) {

            if (frequency[i] > 0) {

                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(frequency[i]);

                index++;
            }
        }

        return result;
    }

    // Display method
    public static void displayResult(String[][] result) {

        System.out.println("\nCharacter\tFrequency");
        System.out.println("-------------------------");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] result = findFrequency(text);

        displayResult(result);

        sc.close();
    }
}