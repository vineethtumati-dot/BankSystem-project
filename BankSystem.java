package bankAprill;
 
import java.util.ArrayList;
import java.util.Scanner;

class Account {
    int accNumber;
    String name;
    double balance;

    // Constructor
    Account(int accNumber, String name, double balance) {
        this.accNumber = accNumber;
        this.name = name;
        this.balance = balance;
    }

    // Deposit
    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully.");
    }

    // Withdraw
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Display
    void display() {
        System.out.println("Account Number: " + accNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}

public class BankSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();

        while (true) {
            System.out.println("\n--- BANK MENU ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();
                    sc.nextLine(); // clear buffer

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    double bal = sc.nextDouble();

                    accounts.add(new Account(accNo, name, bal));
                    System.out.println("Account created successfully!");
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    int dAcc = sc.nextInt();

                    for (Account acc : accounts) {
                        if (acc.accNumber == dAcc) {
                            System.out.print("Enter amount: ");
                            double amt = sc.nextDouble();
                            acc.deposit(amt);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    int wAcc = sc.nextInt();

                    for (Account acc : accounts) {
                        if (acc.accNumber == wAcc) {
                            System.out.print("Enter amount: ");
                            double amt = sc.nextDouble();
                            acc.withdraw(amt);
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    int cAcc = sc.nextInt();

                    for (Account acc : accounts) {
                        if (acc.accNumber == cAcc) {
                            acc.display();
                        }
                    }
                    break;

                case 5:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}











































































































