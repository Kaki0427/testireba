package Chapter10;

import java.util.Scanner;

public class Chapter10_7 {

    private static Account[] accounts = new Account[10];

    static {
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, 100);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an id
        System.out.print("Enter an id: ");
        int id = scanner.nextInt();

        // Check if the id is valid
        while (id < 0 || id >= accounts.length) {
            System.out.println("Invalid id. Please enter a valid id: ");
            id = scanner.nextInt();
        }

        // Display the main menu
        int choice;
        do {
            System.out.println("Main menu:");
            System.out.println("1. View balance");
            System.out.println("2. Withdraw money");
            System.out.println("3. Deposit money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // View balance
                    System.out.println("The balance of account " + id + " is " + accounts[id].getBalance());
                    break;
                case 2:
                    // Withdraw money
                    System.out.print("Enter the amount to withdraw: ");
                    double amount = scanner.nextDouble();
                    accounts[id].withdraw(amount);
                    System.out.println("$" + amount + " has been withdrawn from account " + id);
                    break;
                case 3:
                    // Deposit money
                    System.out.print("Enter the amount to deposit: ");
                    amount = scanner.nextDouble();
                    accounts[id].deposit(amount);
                    System.out.println("$" + amount + " has been deposited into account " + id);
                    break;
                case 4:
                    // Exit
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);
    }
}
