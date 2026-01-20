import java.util.Scanner;

public class DoraemonGadgetBank {
    public static void main(String[] args) {
        // Scanner is our tool to listen to what the user (Nobita) types.
        Scanner scanner = new Scanner(System.in);
        
        // --- SCENE 1: SETTING THE VARIABLES ---
        // Variables act like containers to store information.
        int secretPin = 1293;       // The password required to enter.
        int dorayakiStash = 50;     // The 'State' variable. It remembers how many buns we have.
        int attempts = 0;           // Counter for how many times the user tried the wrong PIN.
        int maxAttempts = 3;        // The limit before the system locks.
        boolean pocketOpen = false; // A flag to track if login was successful.

        System.out.println("=== DORAEMON'S 4D POCKET BANK ===");

        // --- SCENE 2: THE SECURITY GUARD (While Loop) ---
        // We use a WHILE loop here because we don't know if the user will get it right
        // on the 1st try, 2nd try, or fail completely. It loops *while* attempts are less than 3.
        while (attempts < maxAttempts) {
            System.out.print("Nobita, enter the gadget PIN to open the pocket: ");
            int enteredPin = scanner.nextInt();

            if (enteredPin == secretPin) {
                System.out.println("Pocket Unlocked! Hello Nobita!\n");
                pocketOpen = true;  // Mark success!
                break;              // 'break' smashes out of the loop immediately. We are in!
            } else {
                attempts++; // Increment the failure counter
                System.out.println("Wrong PIN! Gian is coming! Attempts left: " + (maxAttempts - attempts));
            }
        }

        // If the loop finished and the pocket is STILL not open, it means they failed 3 times.
        if (!pocketOpen) {
            System.out.println("Too many wrong attempts! Doraemon is angry. System Locked.");
            return; // 'return' stops the entire program right here.
        }

        // --- SCENE 3: THE MENU (Do-While Loop) ---
        // We use a DO-WHILE loop here because we want to show the menu AT LEAST ONCE.
        // Even if Nobita wants to exit immediately, he needs to see the options first.
        int choice;
        do {
            System.out.println("--- WHAT DO YOU WANT TO DO? ---");
            System.out.println("1. Check Dorayaki Stash 🥞");
            System.out.println("2. Eat Dorayaki (Withdraw)");
            System.out.println("3. Add Dorayaki (Deposit)");
            System.out.println("4. Check Recent Gadgets Used");
            System.out.println("5. Fly Away (Exit)");
            System.out.print("Select an option: ");
            choice = scanner.nextInt();

            // The SWITCH statement is like a railway track changer.
            // Based on the number 'choice', it switches us to the correct code block.
            switch (choice) {
                case 1:
                    // Just reading the variable
                    System.out.println(">> We have " + dorayakiStash + " Dorayakis in the pocket.");
                    break; // 'break' prevents us from falling into Case 2 accidentally.
                
                case 2:
                    // LOGIC: Withdrawal
                    System.out.print("How many Dorayakis do you want to eat? ");
                    int eatAmount = scanner.nextInt();
                    
                    // VALIDATION: We must check if we have enough buns before eating.
                    if (eatAmount > dorayakiStash) {
                        System.out.println(">> Nobita! We don't have that many! Don't be greedy!");
                    } else {
                        dorayakiStash -= eatAmount; // Subtract from total
                        System.out.println(">> Yummy! " + eatAmount + " eaten. Remaining: " + dorayakiStash);
                    }
                    break;
                
                case 3:
                    // LOGIC: Deposit
                    System.out.print("How many Dorayakis did Mom give you? ");
                    int addAmount = scanner.nextInt();
                    dorayakiStash += addAmount; // Add to total
                    System.out.println(">> Great! Added to the stash. Total: " + dorayakiStash);
                    break;

                case 4:
                    // --- SCENE 4: LISTING ITEMS (For Loop) ---
                    // We use a FOR loop because we are listing a fixed set of items.
                    // We know exactly how long the array is, so 'for' is perfect.
                    System.out.println("\n--- Recent Gadgets Used ---");
                    String[] gadgets = {"Anywhere Door", "Bamboo Copter", "Time Machine"};
                    
                    for (int i = 0; i < gadgets.length; i++) {
                        // i starts at 0, so (i+1) prints 1, 2, 3...
                        System.out.println("Gadget " + (i + 1) + ": " + gadgets[i]);
                    }
                    System.out.println("---------------------------");
                    break;

                case 5:
                    System.out.println("Bamboo Copter on! flying away... Bye Bye!");
                    break;

                default:
                    // This handles numbers like 6, 99, or -1
                    System.out.println(">> That's not a valid gadget!");
            }
            System.out.println(); // Just adds a blank line for neatness

        } while (choice != 5); // Keep repeating UNTIL the user chooses 5 (Exit)

        scanner.close(); // Close the listener to save resources
    }
}