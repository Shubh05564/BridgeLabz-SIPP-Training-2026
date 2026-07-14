import java.util.Scanner;

public class ShortestLongestWord {

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

        int len = findLength(text);

        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];

        int start = 0;
        int index = 0;

        for (int i = 0; i < len; i++) {

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
        for (int j = start; j < len; j++) {
            word += text.charAt(j);
        }

        words[index] = word;

        return words;
    }

    // Create 2D array with word and length
    public static String[][] getWordLengthArray(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {

            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    // Find shortest and longest word indexes
    public static int[] findShortestLongest(String[][] data) {

        int shortest = 0;
        int longest = 0;

        for (int i = 1; i < data.length; i++) {

            int currentLength = Integer.parseInt(data[i][1]);
            int shortestLength = Integer.parseInt(data[shortest][1]);
            int longestLength = Integer.parseInt(data[longest][1]);

            if (currentLength < shortestLength) {
                shortest = i;
            }

            if (currentLength > longestLength) {
                longest = i;
            }
        }

        return new int[] { shortest, longest };
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitText(text);

        String[][] data = getWordLengthArray(words);

        int[] result = findShortestLongest(data);

        System.out.println("\nWord\t\tLength");
        System.out.println("---------------------");

        for (int i = 0; i < data.length; i++) {

            System.out.println(
                    data[i][0] + "\t\t" +
                    Integer.parseInt(data[i][1]));
        }

        System.out.println("\nShortest Word : " +
                data[result[0]][0] +
                " (Length = " + data[result[0]][1] + ")");

        System.out.println("Longest Word  : " +
                data[result[1]][0] +
                " (Length = " + data[result[1]][1] + ")");

        sc.close();
    }
}   