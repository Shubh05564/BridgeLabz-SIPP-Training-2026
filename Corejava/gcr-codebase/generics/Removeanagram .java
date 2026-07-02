import java.util.*;

public class Removeanagram {

    // Function to remove consecutive anagrams
    public static List<String> removeAnagrams(String[] words) {

        List<String> result = new ArrayList<>();

        for (String word : words) {

            if (result.isEmpty()) {
                result.add(word);
            } else {

                String last = result.get(result.size() - 1);

                if (!isAnagram(last, word)) {
                    result.add(word);
                }
            }
        }

        return result;
    }

    // Function to check whether two strings are anagrams
    public static boolean isAnagram(String s1, String s2) {

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();

        String[] words = new String[n];

        System.out.println("Enter words:");

        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        List<String> ans = removeAnagrams(words);

        System.out.println("Result: " + ans);

        sc.close();
    }
}