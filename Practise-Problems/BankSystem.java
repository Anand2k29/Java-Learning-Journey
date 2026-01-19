import java.util.Scanner;

// LEVEL 1: Base Class for Personal Details
class Person {
    String name;
    int age;
    String gender;
    Scanner sc = new Scanner(System.in);

    void getPersonDetails() {
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Age: ");
        age = sc.nextInt();
        sc.nextLine(); // Consume newline left by nextInt
        System.out.print("Enter Gender: ");
        gender = sc.nextLine();
    }
}

// LEVEL 2: Intermediate Class for Account Info (Inherits Person)
class AccountDetails extends Person {
    long accNo;
    String accType;

    void getAccountDetails() {
        // First, get personal details from the parent class
        getPersonDetails(); 
        
        System.out.print("Enter Account Number: ");
        accNo = sc.nextLong();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Account Type (Savings/Current): ");
        accType = sc.nextLine();
    }
}

// LEVEL 3: Final Class for Operations (Inherits AccountDetails)
class BankOperations extends AccountDetails {
    double totalBalance = 0; // This represents 'total' from your question

    // Method to handle Deposit
    void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        totalBalance = totalBalance + amount;
        System.out.println("Deposited Successfully! Current Balance: " + totalBalance);
    }

    // Method to handle Withdrawal
    void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        if (amount > totalBalance) {
            System.out.println("Insufficient Balance!");
        } else {
            totalBalance = totalBalance - amount;
            System.out.println("Withdrawal Successful! Remaining Balance: " + totalBalance);
        }
    }

    // Method to calculate Annual Interest (Assuming 4% for example)
    void calculateInterest() {
        double interestRate = 0.04;
        double interest = totalBalance * interestRate;
        System.out.println("Annual Interest on current balance (" + totalBalance + ") is: " + interest);
    }

    // Method to Display all details
    void displayDetails() {
        System.out.println("\n--- BANK ACCOUNT DETAILS ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " | Gender: " + gender);
        System.out.println("Acc No: " + accNo + " | Type: " + accType);
        System.out.println("Current Total Balance: " + totalBalance);
        System.out.println("----------------------------");
    }
}

// Main Class to run the program
public class BankSystem {
    public static void main(String[] args) {
        // We create an object of the LAST class in the chain
        BankOperations bank = new BankOperations();
        
        // This method calls getPersonDetails() internally due to inheritance
        System.out.println("--- Enter Details ---");
        bank.getAccountDetails(); 
        
        // Perform operations
        bank.deposit();
        bank.withdraw();
        bank.calculateInterest();
        
        // Show final output
        bank.displayDetails();
    }
}