import java.util.Scanner;

public class UsernameValidator {

    // Recursive function to check lowercase letters only
    public static boolean isValidUsername(String str, int index) {
        if (index == str.length()) { // Base case
            return true;
        }

        char ch = str.charAt(index);

        if (ch < 'a' || ch > 'z') {
            return false;
        }

        return isValidUsername(str, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.println(isValidUsername(username, 0));

        sc.close();
    }
}