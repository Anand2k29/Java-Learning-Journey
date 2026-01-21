import java.util.Scanner;

// FILE NAME: SecretSpyDecoder.java
public class SecretSpyDecoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===  TOP SECRET SPY ENCODER ===");
        System.out.println("Enter a message to scramble it for safety.");
        
        System.out.print("Your Message: ");
        String originalMessage = scanner.nextLine();
        
        // We will build the new encrypted string here
        String encryptedMessage = "";
        
        // KEY: How much we shift the letters. 
        // Example: 'A' + 1 becomes 'B'.
        int shiftKey = 2; 

        // LOOP through every single letter of the message
        for (int i = 0; i < originalMessage.length(); i++) {
            // 1. Get the character at the current position
            char letter = originalMessage.charAt(i);
            
            // 2. Shift the letter (Math with characters!)
            // We cast (char) to turn the number back into a letter.
            char hiddenLetter = (char)(letter + shiftKey);
            
            // 3. Add it to our secret string
            encryptedMessage += hiddenLetter;
        }

        System.out.println("\n--- RESULT ---");
        System.out.println("Original:  " + originalMessage);
        System.out.println("Encrypted: " + encryptedMessage);
        System.out.println("(Send this code to your partner!)");
        
        scanner.close();
    }
}