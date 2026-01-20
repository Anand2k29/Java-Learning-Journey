/**
 * TOPIC: Nested Control Structures
 * --------------------------------
 * WHAT IS NESTING?
 * Nesting simply means putting one thing inside another.
 * * 1. NESTED IF: An 'if' statement inside another 'if'.
 * - Used when you need to check multiple conditions in layers.
 * - Example: Check if User exists -> Then check if Password is correct.
 * * 2. NESTED LOOPS: A 'for' loop inside another 'for' loop.
 * - The "Inner Loop" finishes all its rounds for every single step of the "Outer Loop".
 * - Used for patterns, grids, and 2D arrays (matrices).
 */

public class NestedBasics {
    public static void main(String[] args) {
        
        // --- PART 1: NESTED IF (The Login System) ---
        System.out.println("--- 1. Nested If Example ---");
        
        boolean hasAccount = true;
        boolean isPasswordCorrect = false;

        if (hasAccount) {
            // We only check password IF the account exists.
            // This is the "Inner" check.
            if (isPasswordCorrect) {
                System.out.println("Login Successful! Welcome.");
            } else {
                System.out.println("Error: Wrong Password.");
            }
        } else {
            System.out.println("Error: Account not found.");
        }


        // --- PART 2: NESTED LOOPS (The Clock Logic) ---
        System.out.println("\n--- 2. Nested Loop Example ---");
        
        // Outer Loop: Represents 'Days' (Runs 2 times)
        for (int day = 1; day <= 2; day++) {
            System.out.println("Start of Day " + day);

            // Inner Loop: Represents 'Hours' (Runs 3 times for EACH day)
            for (int hour = 1; hour <= 3; hour++) {
                System.out.println("  -> Hour " + hour);
            }
            // Inner loop ends here
        }
        // Outer loop ends here
    }
}