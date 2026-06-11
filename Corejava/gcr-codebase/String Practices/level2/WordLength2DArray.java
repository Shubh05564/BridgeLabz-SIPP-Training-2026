import java.util.Scanner;

public class WordLength2DArray {

    // Find length without using length()
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

    // Split text into words without using split()
    public static String[] splitText(String text) {

        int length = findLength(text);

        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];

        int start = 0;
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {

                String word = "";
                for (int j = start; j < i; j++) {
                    word += text.charAt(j);
                }

                words[index++] = word;
                start = i + 1;
            }
        }

        // Last word
        String word = "";
        for (int j = start; j < length; j++) {
            word += text.charAt(j);
        }
        words[index] = word;

        return words;
    }

    // Create 2D array with word and length
    public static String[][] getWordAndLength(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitText(text);

        String[][] result = getWordAndLength(words);

        System.out.println("\nWord\t\tLength");
        System.out.println("--------------------");

        for (int i = 0; i < result.length; i++) {

            String word = result[i][0];

            // Convert String length to Integer
            int length = Integer.parseInt(result[i][1]);

            System.out.println(word + "\t\t" + length);
        }

        sc.close();
    }
}