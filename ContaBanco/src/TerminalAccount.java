import java.util.Scanner;

public class TerminalAccount {
    public static void main(String[] args) {

        // Creating Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Request and read account number
        System.out.print("Please enter your account number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine(); // Consume line break

        // Request and read branch number
        System.out.print("Please enter your branch number: ");
        String branch = scanner.nextLine();

        // Request and read customer name
        System.out.print("Please enter the customer name: ");
        String customerName = scanner.nextLine();

        // Request and read balance
        System.out.print("Please enter your balance (use decimal point if needed): ");
        double balance = scanner.nextDouble();

        // Final message
        System.out.println("Hello " + customerName +
                ", thank you for creating an account with our bank. " +
                "Your branch is " + branch +
                ", account number " + accountNumber +
                ", and your balance of $" + balance +
                " is now available for withdrawal.");

        scanner.close();
    }
}
