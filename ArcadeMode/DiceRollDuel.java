import java.util.Scanner;


public class DiceRollDuel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playAgain;

        System.out.println("=== 🎲 WELCOME TO THE DICE DUEL ARENA 🎲 ===");

        // DO-WHILE LOOP: We use this so the game runs at least once, 
        // and then we ask if the player wants to play again.
        do {
            System.out.println("\nPress 'Enter' to roll your die...");
            scanner.nextLine(); // Waits for the user to press Enter

            // --- GENERATING RANDOM NUMBERS ---
            // Math.random() * 6 gives 0 to 5.
            // Adding 1 makes it 1 to 6 (Standard Dice).
            int playerRoll = (int)(Math.random() * 6) + 1;
            int computerRoll = (int)(Math.random() * 6) + 1;

            // --- DISPLAY RESULTS ---
            System.out.println("You rolled:     [" + playerRoll + "]");
            System.out.println("Computer rolled: [" + computerRoll + "]");
            System.out.println("-----------------------------");

            // --- DETERMINING THE WINNER ---
            if (playerRoll > computerRoll) {
                System.out.println("🏆 YOU WIN! Nice roll!");
            } else if (playerRoll < computerRoll) {
                System.out.println("🤖 COMPUTER WINS! Better luck next time.");
            } else {
                System.out.println("🤝 IT'S A TIE! A rare occurrence.");
            }

            // --- REPLAY LOGIC ---
            System.out.print("\nDo you want to duel again? (yes/no): ");
            playAgain = scanner.nextLine();

        } while (playAgain.equalsIgnoreCase("yes")); // Loop repeats if user types "yes"

        System.out.println("Thanks for playing Dice Duel!");
        scanner.close();
    }
}