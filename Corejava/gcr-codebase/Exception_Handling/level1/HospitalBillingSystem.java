import java.util.Scanner;

// Custom Exception
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Division by Zero Example
            System.out.print("Enter total bill amount: ");
            int billAmount = sc.nextInt();

            System.out.print("Enter number of items: ");
            int items = sc.nextInt();

            int costPerItem = billAmount / items;
            System.out.println("Cost per item: " + costPerItem);

            // Array Out of Bounds Example
            String[] patients = {"John", "Alice", "Bob"};

            System.out.print("Enter patient index (0-2): ");
            int index = sc.nextInt();

            System.out.println("Patient Name: " + patients[index]);

            // Number Format Example
            sc.nextLine(); // consume newline
            System.out.print("Enter payment amount: ");
            String paymentInput = sc.nextLine();

            int payment = Integer.parseInt(paymentInput);

            if (payment < billAmount) {
                throw new InsufficientFundsException(
                        "Payment failed! Insufficient funds."
                );
            }

            System.out.println("Payment Successful!");

        } catch (ArithmeticException e) {
            System.out.println("Error: Number of items cannot be zero.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index.");

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid payment amount format.");

        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());

        } finally {
            System.out.println("Hospital billing process completed.");
            sc.close();
        }
    }
}