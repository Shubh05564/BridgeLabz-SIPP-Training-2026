import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

   
    public static void generateException(String text) {
        System.out.println("Generating Exception...");
        
        System.out.println(text.charAt(text.length()));
    }

    
    public static void handleException(String text) {
        try {
            System.out.println("Handling Exception...");
            
           
            System.out.println(text.charAt(text.length()));

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled successfully.");
            System.out.println("Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        // Uncomment this line to generate exception
        // generateException(text);

        // Call method to handle exception
        handleException(text);

        sc.close();
    }
}