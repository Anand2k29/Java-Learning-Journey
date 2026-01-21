import java.util.Random;
import java.util.Scanner;

/**
 * PROGRAM NAME: Magic Eight Ball 
 * --------------------------------
 * WHAT IS THIS?
 * This is a digital version of the classic "Magic 8-Ball" toy used for fortune-telling.
 *
 * HOW IT WORKS:
 * 1. The user asks a "Yes" or "No" question.
 * 2. The program "thinks" for a second (creates suspense).
 * 3. It randomly picks one answer from a pre-made list of 8 possible answers.
 * 4. It keeps running in a loop until you type "exit".
 *
 * KEY CONCEPTS USED:
 * - Arrays (String[]): To store the list of possible answers.
 * - Random Class: To pick a random number for the answer.
 * - Thread.sleep(): To pause the code and simulate "thinking."
 * - Infinite Loop (while true): To keep the game going.
 */

public class MagicEightBall {
    public static void main(String[] args) {
        // Scanner listens for keyboard input
        Scanner scanner = new Scanner(System.in);
        
        // Random is a tool that generates random numbers
        Random random = new Random();

        // --- STEP 1: THE DATA ---
        // We store all the possible predictions in a String Array.
        // Think of this like the 20-sided die inside the real toy.
        String[] answers = {
            "Yes, definitely!",      // Index 0
            "It is certain.",        // Index 1
            "Without a doubt.",      // Index 2
            "Ask again later.",      // Index 3
            "Cannot predict now.",   // Index 4
            "Don't count on it.",    // Index 5
            "My sources say no.",    // Index 6
            "Very doubtful."         // Index 7
        };

        System.out.println("===  MYSTIC 8-BALL  ===");
        System.out.println("Ask a Yes/No question, and I shall reveal your fate.");
        
        // --- STEP 2: THE GAME LOOP ---
        // 'while(true)' creates an infinite loop. The program will never stop
        // unless we manually break out of it using the 'break' keyword.
        while (true) {
            System.out.print("\nAsk your question (or type 'exit' to quit): ");
            String question = scanner.nextLine();

            // --- STEP 3: CHECK EXIT CONDITION ---
            // If the user types "exit", "EXIT", or "Exit", we stop the game.
            if (question.equalsIgnoreCase("exit")) {
                System.out.println("The crystal ball goes dark. Goodbye.");
                break; // This kicks us out of the while loop
            }

            // --- STEP 4: INPUT VALIDATION ---
            // If the user just hits 'Enter' without typing anything, 
            // .trim().isEmpty() detects that blank space.
            if (question.trim().isEmpty()) {
                System.out.println("You must ask a question to get an answer!");
                continue; // 'continue' skips the rest of the code and restarts the loop
            }

            System.out.println("Thinking...");
            
            // --- STEP 5: DRAMATIC PAUSE ---
            // Real fortune tellers don't answer instantly!
            // We use Thread.sleep(1500) to pause the program for 1.5 seconds (1500ms).
            try {
                Thread.sleep(1500); 
            } catch (InterruptedException e) {
                // This 'catch' block handles rare errors if the sleep is interrupted.
                // We can leave it empty for this simple program.
            }

            // --- STEP 6: PICK A RANDOM ANSWER ---
            // We need a random number between 0 and 7 (the size of our array).
            // random.nextInt(8) gives us that number.
            int randomIndex = random.nextInt(answers.length);
            
            // We use that random number to pull the text from the array.
            System.out.println(">> THE 8-BALL SAYS: " + answers[randomIndex]);
        }
        
        scanner.close();
    }
}