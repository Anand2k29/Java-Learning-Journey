import java.util.Random;
import java.util.Scanner;

public class ZombieSurvival {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // --- CONCEPT: RESOURCE MANAGEMENT ---
        // You have two resources. You spend one (Energy) to gain the other (Distance).
        int energy = 100;
        int distanceCovered = 0;
        int goal = 500;

        System.out.println("=== 🧟 ZOMBIE ESCAPE RUN 🧟 ===");
        System.out.println("Goal: Run " + goal + " meters before Energy hits 0.");

        // Loop runs while you have energy AND haven't finished
        while (energy > 0 && distanceCovered < goal) {
            
            // Randomly pick a scenario: 1=Wall, 2=Horde, 3=Safe Path
            int scenario = random.nextInt(3) + 1;

            System.out.println("\nStat Check -> Energy: " + energy + "% | Distance: " + distanceCovered + "m");
            System.out.println("----------------------------------------");

            // --- CONCEPT: SWITCH CASE ---
            // Cleaner than writing many "if-else-if" blocks for scenarios.
            switch (scenario) {
                case 1:
                    System.out.println("⚠️ OBSTACLE: A massive brick wall blocks the road!");
                    System.out.println("1. Climb it (Cost: 20 Energy, +100m)");
                    System.out.println("2. Go around (Cost: 5 Energy, +20m)");
                    break;
                case 2:
                    System.out.println("⚠️ DANGER: A zombie horde is ahead!");
                    System.out.println("1. Fight through (Cost: 30 Energy, +150m)");
                    System.out.println("2. Sneak past (Cost: 10 Energy, +50m)");
                    break;
                case 3:
                    System.out.println("✅ LUCKY: An open road!");
                    System.out.println("1. Sprint! (Cost: 15 Energy, +100m)");
                    System.out.println("2. Walk and rest (Gain +10 Energy, +10m)");
                    break;
            }

            System.out.print("Your choice (1 or 2): ");
            int choice = scanner.nextInt();

            // --- CONCEPT: NESTED LOGIC ---
            // Handling the math based on the random scenario + user choice
            if (scenario == 1) {
                if (choice == 1) { energy -= 20; distanceCovered += 100; }
                else { energy -= 5; distanceCovered += 20; }
            } 
            else if (scenario == 2) {
                if (choice == 1) { energy -= 30; distanceCovered += 150; }
                else { energy -= 10; distanceCovered += 50; }
            }
            else { // Scenario 3 (Lucky)
                if (choice == 1) { energy -= 15; distanceCovered += 100; }
                else { energy += 10; distanceCovered += 10; System.out.println(">> You rested."); }
            }
        }

        System.out.println("\n==================================");
        if (distanceCovered >= goal) {
            System.out.println("🚁 VICTORY! You reached the helicopter with " + energy + "% energy left!");
        } else {
            System.out.println("💀 GAME OVER... You collapsed from exhaustion.");
        }

        scanner.close();
    }
}