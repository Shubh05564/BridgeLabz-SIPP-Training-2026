import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DailyExpenseLogger {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter("expenses.txt", true); // Append mode

            System.out.print("Enter Expense Category: ");
            String category = sc.nextLine();

            System.out.print("Enter Amount: ");
            double amount = sc.nextDouble();

            fw.write(category + " - " + amount + "\n");

            fw.close();

            System.out.println("Expense saved successfully!");

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        sc.close();
    }
}