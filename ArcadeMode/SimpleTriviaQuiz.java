import java.util.Scanner;

// CLASS NAME: SimpleTriviaQuiz
// Tells the user this is a test of knowledge.
public class SimpleTriviaQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0; // State variable to track points

        System.out.println("=== 🧠 WELCOME TO THE JAVA QUIZ 🧠 ===");
        System.out.println("Answer the following 3 questions correctly to win.");

        // --- QUESTION 1 ---
        System.out.println("\nQ1: What is the capital of France?");
        System.out.print("Your Answer: ");
        String ans1 = scanner.nextLine();

        // Check answer (ignoring case so 'paris' and 'Paris' both work)
        if (ans1.equalsIgnoreCase("Paris")) {
            System.out.println("✅ Correct!");
            score++; // Add 1 point
        } else {
            System.out.println("❌ Wrong! The answer was Paris.");
        }

        // --- QUESTION 2 ---
        System.out.println("\nQ2: How many legs does a spider have?");
        System.out.print("Your Answer (number): ");
        int ans2 = scanner.nextInt();
        scanner.nextLine(); // FIX: Consume the leftover newline character

        if (ans2 == 8) {
            System.out.println("✅ Correct!");
            score++;
        } else {
            System.out.println("❌ Wrong! Spiders have 8 legs.");
        }

        // --- QUESTION 3 ---
        System.out.println("\nQ3: Which planet is known as the Red Planet?");
        System.out.print("Your Answer: ");
        String ans3 = scanner.nextLine();

        if (ans3.equalsIgnoreCase("Mars")) {
            System.out.println("✅ Correct!");
            score++;
        } else {
            System.out.println("❌ Wrong! It is Mars.");
        }

        // --- FINAL RESULTS ---
        System.out.println("\n-----------------------------");
        System.out.println("GAME OVER! Final Score: " + score + "/3");

        // Give a specific message based on performance
        if (score == 3) {
            System.out.println("Rank: 🌟 GENIUS");
        } else if (score >= 1) {
            System.out.println("Rank: 😊 GOOD EFFORT");
        } else {
            System.out.println("Rank: 📚 STUDY MORE");
        }
        
        scanner.close();
    }
}