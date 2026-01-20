import java.util.Scanner;

public class HauntedHouseAdventure {
    public static void main(String[] args) {
        // CONCEPT: Scanner Input
        // We initialize the scanner to listen for player choices.
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== 🏚️ THE HAUNTED HOUSE ===");
        System.out.println("You are standing in front of a spooky old house.");
        System.out.println("It is raining hard. Do you go inside? (yes/no)");
        System.out.print("> ");
        
        // CONCEPT: String Input
        // We capture the player's first major decision.
        String choice1 = scanner.nextLine();

        // CONCEPT: String Comparison (.equalsIgnoreCase)
        // In Java, you cannot use '==' for strings. You must use .equals() or .equalsIgnoreCase().
        // This checks if the user typed "yes", "YES", or "Yes".
        if (choice1.equalsIgnoreCase("yes")) {
            
            // --- BRANCH A: INSIDE THE HOUSE ---
            System.out.println("\nYou enter the hallway. It is dark.");
            System.out.println("You see a 'Kitchen' to the left and 'Stairs' going up.");
            System.out.print("Where do you go? (kitchen/stairs): ");
            String choice2 = scanner.nextLine();

            // CONCEPT: Nested If-Statements
            // We are now inside the first 'if'. We make a SECOND decision here.
            // This logic only runs because the user already said "yes".
            if (choice2.equalsIgnoreCase("kitchen")) {
                
                // --- SUB-BRANCH: THE KITCHEN ---
                System.out.println("\nYou walk into the kitchen. A ghost is cooking soup! 🍲");
                System.out.println("The ghost offers you some. Do you eat it? (yes/no)");
                String foodChoice = scanner.nextLine();
                
                // A third layer of nesting!
                if (foodChoice.equalsIgnoreCase("yes")) {
                    System.out.println(">> Yummy! You gain magical powers. THE END (Good Ending).");
                } else {
                    System.out.println(">> The ghost is offended and throws a plate at you! RUN! THE END.");
                }

            } else if (choice2.equalsIgnoreCase("stairs")) {
                
                // --- SUB-BRANCH: THE STAIRS ---
                System.out.println("\nYou creep up the stairs... creak... creak...");
                System.out.println("A bat flies into your face! 🦇");
                System.out.println("You fall back down. Ouch. THE END.");
                
            } else {
                
                // --- SUB-BRANCH: INVALID INPUT ---
                // If they typed "Bathroom" or "Outside", this catches it.
                System.out.println("\nYou stood there too long and got scared. You ran home.");
            }

        } else {
            // --- BRANCH B: OUTSIDE (The Boring Ending) ---
            // This 'else' connects all the way back to the very first 'if'.
            // If they said "no" at the start, the code jumps straight here.
            System.out.println("\nYou decided to stay dry and go home. Smart choice, but boring story!");
            System.out.println("THE END.");
        }
        
        scanner.close(); // Always close the scanner to prevent memory leaks.
    }
}