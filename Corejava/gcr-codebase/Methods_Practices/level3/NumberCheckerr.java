import java.util.Scanner;

public class NumberCheckerr {

    // Method to count digits
    public static int countDigits(int number) {
        int count = 0;
        int temp = Math.abs(number);

        while (temp > 0) {
            count++;
            temp /= 10;
        }

        return (count == 0) ? 1 : count;
    }

    // Method to store digits in an array
    public static int[] getDigitsArray(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];

        int temp = Math.abs(number);

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];

        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }

        return reversed;
    }

    // Method to compare two arrays
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    // Method to check Palindrome Number
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits);
        return areArraysEqual(digits, reversed);
    }

    // Method to check Duck Number
    // Duck Number contains at least one zero
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = getDigitsArray(number);

        System.out.println("Count of Digits = " + countDigits(number));

        System.out.print("Digits Array = ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }

        System.out.println();

        int[] reversed = reverseArray(digits);

        System.out.print("Reversed Digits Array = ");
        for (int digit : reversed) {
            System.out.print(digit + " ");
        }

        System.out.println();

        System.out.println("Arrays Equal? " + areArraysEqual(digits, reversed));

        if (isPalindrome(digits)) {
            System.out.println(number + " is a Palindrome Number.");
        } else {
            System.out.println(number + " is not a Palindrome Number.");
        }

        if (isDuckNumber(digits)) {
            System.out.println(number + " is a Duck Number.");
        } else {
            System.out.println(number + " is not a Duck Number.");
        }

        sc.close();
    }
}