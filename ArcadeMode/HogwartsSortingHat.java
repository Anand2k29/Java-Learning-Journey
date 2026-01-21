import java.util.Scanner;

public class HogwartsSortingHat {
    public static void main(String[] args) {
        
        // --- CONCEPT: ARRAYS ---
        // Instead of making 4 separate variables like 'gryffindorPoints', 'slytherinPoints'...
        // We make ONE container with 4 slots.
        // Index 0 = Gryffindor | Index 1 = Hufflepuff | Index 2 = Ravenclaw | Index 3 = Slytherin
        int[] housePoints = {0, 0, 0, 0}; 

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 🧙‍♂️ THE SORTING HAT CEREMONY 🧙‍♂️ ===");
        System.out.println("The hat is placed on your head... it speaks.");

        // --- QUESTION 1 ---
        System.out.println("\nQ1: Which quality defines you?");
        System.out.println("0. Bravery (Gryffindor)");
        System.out.println("1. Loyalty (Hufflepuff)");
        System.out.println("2. Wit (Ravenclaw)");
        System.out.println("3. Ambition (Slytherin)");
        System.out.print("Type the number (0-3): ");
        
        int choice1 = scanner.nextInt();

        // --- CONCEPT: ARRAY INDEXING ---
        // We use the user's input DIRECTLY to update the correct slot.
        // If they type '0', we add points to housePoints[0]. Smart, right?
        if (choice1 >= 0 && choice1 <= 3) {
            housePoints[choice1] += 10; // Add 10 points
        } else {
            System.out.println(">> The hat is confused by your answer...");
        }

        // --- QUESTION 2 ---
        System.out.println("\nQ2: What road do you choose?");
        System.out.println("0. The road of Glory");
        System.out.println("1. The road of Friendship");
        System.out.println("2. The road of Knowledge");
        System.out.println("3. The road of Power");
        System.out.print("Type the number (0-3): ");

        int choice2 = scanner.nextInt();
        
        if (choice2 >= 0 && choice2 <= 3) {
            housePoints[choice2] += 10;
        }

        // --- CALCULATING THE WINNER ---
        System.out.println("\n(The hat mumbles...) Hmm... Better be...");
        
        // Simple logic to find the house with the most points
        // We assume Gryffindor is best initially, then check if others beat it.
        int maxPoints = 0;
        int winningIndex = 0;

        // Loop through our 4 houses
        for (int i = 0; i < 4; i++) {
            if (housePoints[i] > maxPoints) {
                maxPoints = housePoints[i];
                winningIndex = i;
            }
        }

        // Print the final result based on the winning index
        if (winningIndex == 0) System.out.println("🦁 GRYFFINDOR!!");
        else if (winningIndex == 1) System.out.println("🦡 HUFFLEPUFF!!");
        else if (winningIndex == 2) System.out.println("🦅 RAVENCLAW!!");
        else System.out.println("🐍 SLYTHERIN!!");

        scanner.close();
    }
}