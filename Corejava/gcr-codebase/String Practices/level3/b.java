import java.util.Scanner;

public class CharacterFrequency {

    public static String[][] findFrequency(String text) {

        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        int uniqueCount = 0;

        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] > 0) {
                uniqueCount++;
                frequency[text.charAt(i)] = -frequency[text.charAt(i)];
            }
        }

        for (int i = 0; i < 256; i++) {
            frequency[i] = Math.abs(frequency[i]);
        }

        String[][] result = new String[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            boolean alreadyAdded = false;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    alreadyAdded = true;
                    break;
                }
            }

            if (!alreadyAdded) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(frequency[ch]);
                index++;
            }
        }

        return result;
    }

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