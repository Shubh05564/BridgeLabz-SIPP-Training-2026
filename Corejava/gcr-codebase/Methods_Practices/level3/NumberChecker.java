import java.util.Scanner;

public class NumberChecker {

    // Method to count digits
    public static int countDigits(int number) {
        int count = 0;
        int temp = Math.abs(number);

        while (temp > 0) {
            count++;
            temp /= 10;
        }

        return count == 0 ? 1 : count;
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

    // Method to check Duck Number
    public static boolean isDuckNumber(int[] digits) {
        // A duck number contains at least one zero
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check Armstrong Number
    public static boolean isArmstrongNumber(int number, int[] digits) {
        int power = digits.length;
        int sum = 0;

        for (int digit : digits) {
            sum += (int) Math.pow(digit, power);
        }

        return sum == number;
    }

    // Method to find largest and second largest digit
    public static void findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        System.out.println("Largest Digit = " + largest);
        System.out.println("Second Largest Digit = " + secondLargest);
    }

    // Method to find smallest and second smallest digit
    public static void findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }

        System.out.println("Smallest Digit = " + smallest);
        System.out.println("Second Smallest Digit = " + secondSmallest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int digitCount = countDigits(number);
        int[] digits = getDigitsArray(number);

        System.out.println("Number of Digits = " + digitCount);

        System.out.print("Digits Array = ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        System.out.println("Is Duck Number? " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number? " + isArmstrongNumber(number, digits));

        findLargestAndSecondLargest(digits);
        findSmallestAndSecondSmallest(digits);

        sc.close();
    }
}