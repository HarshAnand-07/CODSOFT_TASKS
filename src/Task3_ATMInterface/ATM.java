package Task3_ATMInterface;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount(10000);

        int choice;

        System.out.println("===== ATM INTERFACE =====");

        do {

            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Current Balance: ₹" + account.getBalance());
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmount = sc.nextDouble();

                    if (depositAmount <= 0) {
                        System.out.println("Invalid amount!");
                    } else {
                        account.deposit(depositAmount);
                        System.out.println("Amount deposited successfully.");
                        System.out.println("New Balance: ₹" + account.getBalance());
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmount = sc.nextDouble();

                    if (withdrawAmount <= 0) {
                        System.out.println("Invalid amount!");
                    } else if (account.withdraw(withdrawAmount)) {
                        System.out.println("Please collect your cash.");
                        System.out.println("Remaining Balance: ₹" + account.getBalance());
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 4);
    }
}