import java.util.Random;
import java.util.Scanner;

public class PokemonBattle {
    public static void main(String[] args) {
        
        // --- CONCEPT: RANDOMNESS ---
        // Games aren't fun if the result is always the same.
        // We use Random to make damage unpredictable.
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int pikachuHP = 100;
        int charmanderHP = 100;

        System.out.println("===  PIKACHU vs CHARMANDER  ===");
        System.out.println("Battle Start!");

        // --- CONCEPT: THE GAME LOOP (While) ---
        // "Keep fighting AS LONG AS both Pokemon are alive."
        // logical AND (&&) means BOTH conditions must be true.
        while (pikachuHP > 0 && charmanderHP > 0) {
            
            // 1. PRINT STATS
            System.out.println("\n-----------------------");
            System.out.println("Pikachu HP: " + pikachuHP);
            System.out.println("Charmander HP: " + charmanderHP);
            System.out.println("-----------------------");

            // 2. PLAYER TURN
            System.out.println("1. Thunderbolt (High Dmg / Low Accuracy)");
            System.out.println("2. Quick Attack (Low Dmg / High Accuracy)");
            System.out.print("Choose move: ");
            int move = scanner.nextInt();

            // Attack Logic
            if (move == 1) {
                // Risk mechanic: 30% chance to MISS
                if (random.nextInt(10) > 3) { 
                    int dmg = 25;
                    charmanderHP -= dmg;
                    System.out.println(">> PIKACHU used Thunderbolt! It hit for " + dmg + " dmg!");
                } else {
                    System.out.println(">> PIKACHU missed!");
                }
            } else {
                // Safe move: Always hits, but lower damage
                int dmg = 10;
                charmanderHP -= dmg;
                System.out.println(">> PIKACHU used Quick Attack! It hit for " + dmg + " dmg.");
            }

            // 3. ENEMY TURN (Automatic)
            // Only attack if Charmander is still standing
            if (charmanderHP > 0) {
                System.out.println(">> Charmander attacks...");
                int enemyDmg = random.nextInt(20) + 5; // Damage between 5 and 25
                pikachuHP -= enemyDmg;
                System.out.println(">> Hit you for " + enemyDmg + " damage!");
            }
        }

        // --- END GAME ---
        System.out.println("\n=== BATTLE OVER ===");
        if (pikachuHP > 0) {
            System.out.println(" YOU WON! Pikachu is the champion!");
        } else {
            System.out.println(" YOU LOST... Charmander was too strong.");
        }
        
        scanner.close();
    }
}