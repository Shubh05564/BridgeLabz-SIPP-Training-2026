import java.util.Scanner;

public class AthleteRun {

    // Method to calculate perimeter of the triangle
    public static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    // Method to calculate number of rounds
    public static double calculateRounds(double perimeter) {
        return 5000 / perimeter; // 5 km = 5000 meters
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input sides of the triangle
        System.out.print("Enter side 1 (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 (in meters): ");
        double side3 = sc.nextDouble();

        // Calculate perimeter
        double perimeter = calculatePerimeter(side1, side2, side3);

        // Calculate rounds
        double rounds = calculateRounds(perimeter);

        // Display result
        System.out.println("Perimeter of the triangular park = " + perimeter + " meters");
        System.out.println("Number of rounds required to complete 5 km = " + rounds);

        sc.close();
    }
}