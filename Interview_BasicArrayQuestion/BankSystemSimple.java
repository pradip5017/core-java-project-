package Interview_BasicArrayQuestion;

import java.util.Scanner;

class BankAccount {
    double balance;

    // Deposit Money
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println(amount + " Deposited Successfully!");
    }

    // Withdraw Money
    void withdraw(double amount) {
        if(amount <= balance) {
            balance = balance - amount;
            System.out.println(amount + " Withdrawn Successfully!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    // Check Balance
    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class BankSystemSimple {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();

        while(true) {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            if(choice == 1) {
                System.out.print("Enter Amount to Deposit: ");
                double amount = sc.nextDouble();
                account.deposit(amount);
            }
            else if(choice == 2) {
                System.out.print("Enter Amount to Withdraw: ");
                double amount = sc.nextDouble();
                account.withdraw(amount);
            }
            else if(choice == 3) {
                account.checkBalance();
            }
            else if(choice == 4) {
                System.out.println("Thank You! Visit Again.");
                break;
            }
            else {
                System.out.println("Invalid Choice! Try Again.");
            }
        }
    }
}

