import java.util.*;

public class palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int original = x;
        int rev = 0;

        if (x < 0) {
            System.out.println("false");
            return;
        }

        while (x > 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x = x / 10;
        }

        if (original == rev) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }
}