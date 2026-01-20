import java.util.Scanner;

public class AtmSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initial setup
        int correctPin = 1234;
        double balance = 5000.00;
        int attempts = 0;
        int maxAttempts = 3;
        boolean accessGranted = false;

        System.out.println("=== WELCOME TO JAVA BANK ATM ===");

        // --- 1. WHILE LOOP (Security Check) ---
        // REAL WORLD USAGE: Use 'while' when you don't know how many times 
        // a user will make a mistake. We loop UNTIL the PIN is right or tries run out.
        
        while (attempts < maxAttempts) {
            System.out.print("Enter your 4-digit PIN: ");
            int enteredPin = scanner.nextInt();

            if (enteredPin == correctPin) {
                System.out.println("Access Granted!\n");
                accessGranted = true;
                break; // Exit the loop immediately if PIN is correct
            } else {
                attempts++;
                System.out.println("Incorrect PIN. Attempts remaining: " + (maxAttempts - attempts));
            }
        }

        // If the loop finished and access is still false, exit the program.
        if (!accessGranted) {
            System.out.println("Too many wrong attempts. Card blocked.");
            return; // Stop the program here
        }


        // --- 2. DO-WHILE LOOP (The Main Menu) ---
        // REAL WORLD USAGE: Use 'do-while' for menus. You want the menu to show 
        // at least once, and then repeat based on user choice.
        
        int choice;
        do {
            System.out.println("--- MAIN MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Cash");
            System.out.println("3. Deposit Cash");
            System.out.println("4. Mini Statement (Recent History)");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(">> Current Balance: $" + balance);
                    break;
                
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > balance) {
                        System.out.println(">> Error: Insufficient funds.");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println(">> Please take your cash. New Balance: $" + balance);
                    }
                    break;
                
                case 3:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    balance += depositAmount;
                    System.out.println(">> Deposited successfully. New Balance: $" + balance);
                    break;

                case 4:
                    // --- 3. FOR LOOP (Data Iteration) ---
                    // REAL WORLD USAGE: Use 'for' when iterating over known data, 
                    // like a list of past transactions.
                    System.out.println("\n--- Mini Statement (Last 3 Transactions) ---");
                    
                    // We simulate a database using a simple array
                    String[] history = {"-$20.00 (Starbucks)", "+$500.00 (Salary)", "-$50.00 (Gas)"};
                    
                    for (int i = 0; i < history.length; i++) {
                        // 'i' represents the index (0, 1, 2)
                        System.out.println((i + 1) + ". " + history[i]);
                    }
                    System.out.println("--------------------------------------------");
                    break;

                case 5:
                    System.out.println("Thank you for using Java Bank. Goodbye!");
                    break;

                default:
                    System.out.println(">> Invalid option. Please try again.");
            }
            
            // Just for formatting: add a blank line before the menu shows again
            System.out.println(); 

        } while (choice != 5); // Keep looping as long as the user DOES NOT choose 5 (Exit)

        scanner.close();
    }
}