// Custom Exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class ATMWithdrawalSystem {

    public static void withdraw(double balance, double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient Balance! Available Balance: ₹" + balance +
                ", Requested Amount: ₹" + amount
            );
        }

        balance -= amount;
        System.out.println("Withdrawal Successful!");
        System.out.println("Remaining Balance: ₹" + balance);
    }

    public static void main(String[] args) {

        double balance = 5000;
        double withdrawalAmount = 8000;

        try {
            withdraw(balance, withdrawalAmount);
        } catch (InsufficientBalanceException e) {
            System.out.println("Transaction Failed!");
            System.out.println(e.getMessage());
        }
    }
}