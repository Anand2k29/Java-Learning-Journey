public class TimeDelayPatterns {

    public static void main(String[] args) {
        
        // --- EXAMPLE 1: SIMPLE PAUSE ---
        // This simulates a "thinking" effect, like in your Sorting Hat.
        System.out.println("The Sorting Hat is being placed on your head...");
        
        // Calling our custom tool 'pause'.
        // 1000 milliseconds = 1 second.
        pause(1000); 
        
        System.out.println("Hmm... very interesting...");
        pause(1500); // 1.5 seconds wait
        
        System.out.println("You have plenty of courage, I see.");
        pause(1000);


        // --- EXAMPLE 2: LOADING BAR LOOP ---
        // This uses a loop to print small parts repeatedly with a tiny delay.
        System.out.print("\nAnalyzing Brain Waves: ["); // '\n' creates a blank line first

        for (int i = 0; i < 10; i++) {
            System.out.print("="); // Print one bar without a new line
            pause(200);            // Wait 0.2 seconds between each bar
        }
        System.out.println("] DONE!\n");


        // --- EXAMPLE 3: THE "RAW" WAY (How it looks without our helper) ---
        System.out.println("Manual system check starting...");
        
        // Without our 'pause' method, you have to write this messy block every time:
        try {
            // Thread.sleep is the actual built-in Java command.
            // It pauses the execution of the current thread.
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            // This catches an error if the program is force-stopped while waiting.
            System.out.println("Whoops, the wait was interrupted!");
        }
        
        System.out.println("Manual check complete.");
    }


    // ---------------------------------------------------------
    //   CUSTOM HELPER METHOD: pause
    // ---------------------------------------------------------
    // 1. 'public static void': Standard setup for a helper tool.
    // 2. 'int milliseconds': This 'input' lets us choose the time when we call it.
    public static void pause(int milliseconds) {
        try {
            // This is the command that actually stops the CPU for a moment.
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            // If something forces the program to stop waiting, we handle it here
            // so the program doesn't crash.
            System.out.println("Pause was interrupted!");
        }
    }
}