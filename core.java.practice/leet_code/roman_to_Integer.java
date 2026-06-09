import java.util.Scanner;
public class roman_to_Integer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int value = getValue(c);

            if (i < s.length() - 1 && value < getValue(s.charAt(i + 1))) {
                result -= value;
            } else {
                result += value;
            }
        }

        System.out.println(result);
        sc.close();
    }

    private static int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}