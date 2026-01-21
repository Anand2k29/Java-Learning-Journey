public class JarvisBoot {
    
    // --- CONCEPT: MAIN METHOD ---
    // This is where the program starts.
    public static void main(String[] args) {
        
        System.out.println("initiating system protocol...");
        pause(1000); // We call our custom tool here!
        /*
        pause is not a built-in Java command (like System.out.println). 
        It is a "custom tool" or helper method that you (or the tutorial 
        you are following) have likely written elsewhere in the class to handle
         the timing logic.
        */

        System.out.println("\n--- J.A.R.V.I.S SYSTEM REBOOT ---");
        
        // --- CONCEPT: FOR LOOP FOR ANIMATION ---
        // We print a loading bar character by character
        System.out.print("LOADING MEMORY: [");
        for(int i=0; i<20; i++) {
            System.out.print("|"); // Print on same line
            pause(100); // Wait 0.1 seconds between each bar
        }
        System.out.println("] 100%");

        System.out.println("\n>> Connecting to Satellites...");
        pause(800);
        
        System.out.println(">> Calibrating Mark-85 Armor...");
        pause(800);
        
        System.out.println(">> Importing Combat Styles...");
        pause(1200);

        System.out.println("\nHELLO MR. STARK.");
        System.out.println("All systems online. Ready for flight.");
    }

    // --- CONCEPT: CUSTOM METHODS ---
    // We created our own command called "pause".
    // Why? So we don't have to write the messy "try-catch" block 
    // every single time we want to wait. 
    // We write it ONCE here, and use it ANYWHERE above.
    public static void pause(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            System.out.println("System Error.");
        }
    }
}