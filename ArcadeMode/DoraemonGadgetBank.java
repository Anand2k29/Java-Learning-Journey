/* * ==========================================
 * PROGRAM: Doraemon's Gadget Bank 
 * ==========================================
 * * CONCEPTS USED IN THIS CODE:
 * ------------------------------------------
 * 1. VARIABLES (int, boolean): 
 * - Used to store the PIN, bun count (stash), and login status.
 * * 2. SCANNER CLASS: 
 * - Used to capture the PIN and Menu Choices typed by the user.
 * * 3. WHILE LOOP (Entry Control): 
 * - Used for the LOGIN system. 
 * - Logic: "Keep asking for the PIN *while* the user is wrong (max 3 times)."
 * * 4. IF-ELSE & LOGICAL OPERATORS: 
 * - Used to check if the PIN is correct and if the user has enough buns to eat.
 * * 5. DO-WHILE LOOP (Exit Control): 
 * - Used for the MAIN MENU.
 * - Logic: "Show the menu *at least once*, then keep showing it until the user selects Exit."
 * * 6. SWITCH-CASE STATEMENT: 
 * - Used to handle the menu selection (Option 1 vs Option 2 vs Option 3) cleanly.
 * * 7. ARRAYS & FOR LOOPS: 
 * - Used in Option 4 to store a list of gadgets and print them one by one.
 * * ==========================================
 */

import java.util.Scanner;

public class DoraemonGadgetBank {
    public static void main(String[] args) {
        // CONCEPT: Scanner Input
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== 🔵 DORAEMON'S 4D POCKET SETUP 🔵 ===");

        // --- SCENE 1: SETTING THE PIN ---
        System.out.println("Nobita, please set a Secret PIN for your account.");
        System.out.print("Enter a new 4-digit PIN: ");
        
        // CONCEPT: Storing User Input
        // We save the user's chosen PIN to check against later.
        int secretPin = scanner.nextInt(); 
        
        System.out.println(">> PIN Saved Successfully! System is now locking...");
        System.out.println("-------------------------------------------------\n");

        // --- VARIABLES SETUP ---
        int dorayakiStash = 50;     // State variable (tracks food)
        int attempts = 0;           // Counter variable
        int maxAttempts = 3;        // Constant limit
        boolean pocketOpen = false; // Flag variable (True/False)

        System.out.println("=== 🔒 SECURITY CHECK 🔒 ===");

        // --- SCENE 2: THE SECURITY GUARD ---
        // CONCEPT: While Loop
        // Runs repeatedly as long as the condition (attempts < 3) is true.
        while (attempts < maxAttempts) {
            System.out.print("Enter your PIN to login: ");
            int enteredPin = scanner.nextInt();

            // CONCEPT: If-Else Logic
            if (enteredPin == secretPin) {
                System.out.println("✅ Pocket Unlocked! Welcome back, Nobita!\n");
                pocketOpen = true;  
                break; // CONCEPT: Break (Exits the loop immediately)
            } else {
                attempts++; 
                System.out.println("❌ Wrong PIN! Gian is watching! Attempts left: " + (maxAttempts - attempts));
            }
        }

        // Security check failure
        if (!pocketOpen) {
            System.out.println("🚫 Too many wrong attempts! System Locked.");
            scanner.close(); 
            return; // CONCEPT: Return (Stops the program entirely)
        }

        // --- SCENE 3: THE MENU ---
        int choice;
        
        // CONCEPT: Do-While Loop
        // Ensures the menu prints at least one time before checking the condition.
        do {
            System.out.println("--- 🥞 POCKET MENU 🥞 ---");
            System.out.println("1. Check Dorayaki Stash");
            System.out.println("2. Eat Dorayaki (Withdraw)");
            System.out.println("3. Add Dorayaki (Deposit)");
            System.out.println("4. Check Recent Gadgets");
            System.out.println("5. Fly Away (Exit)");
            System.out.print("Select an option: ");
            choice = scanner.nextInt();

            // CONCEPT: Switch-Case
            // Jumps to the specific code block based on 'choice'.
            switch (choice) {
                case 1:
                    System.out.println(">> We have " + dorayakiStash + " Dorayakis.");
                    break;
                
                case 2:
                    System.out.print("How many to eat? ");
                    int eatAmount = scanner.nextInt();
                    
                    // CONCEPT: Input Validation
                    if (eatAmount > dorayakiStash) {
                        System.out.println(">> Not enough food! Don't be greedy!");
                    } else {
                        dorayakiStash -= eatAmount; // CONCEPT: Compound Assignment (-=)
                        System.out.println(">> Yummy! Remaining: " + dorayakiStash);
                    }
                    break;
                
                case 3:
                    System.out.print("How many to add? ");
                    int addAmount = scanner.nextInt();
                    dorayakiStash += addAmount; // CONCEPT: Compound Assignment (+=)
                    System.out.println(">> Added! Total: " + dorayakiStash);
                    break;

                case 4:
                    System.out.println("\n--- Recent Gadgets ---");
                    // CONCEPT: Arrays (A fixed list of items)
                    String[] gadgets = {"Anywhere Door", "Bamboo Copter", "Time Machine"};
                    
                    // CONCEPT: For Loop (Iterating through the array)
                    for (int i = 0; i < gadgets.length; i++) {
                        System.out.println((i + 1) + ". " + gadgets[i]);
                    }
                    System.out.println("----------------------");
                    break;

                case 5:
                    System.out.println("Flying away... Bye!");
                    break;

                default:
                    System.out.println(">> Invalid option.");
            }
            System.out.println(); // Formatting

        } while (choice != 5); // CONCEPT: Loop Condition

        scanner.close();
    }
}