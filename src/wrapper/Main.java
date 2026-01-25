package wrapper;

public class Main {
    public static void main(String[] args) {
        
        // --- Scenario 1: Normal Usage ---
        System.out.println("--- 1. Normal Email ---");
        // We create a basic instance. No wrapping involved.
        Sender normal = new EmailSender();
        normal.sendMessage("Hello World");


        // --- Scenario 2: Using the Wrapper ---
        System.out.println("\n--- 2. Encrypted Email ---");
        
        // We wrap the 'normal' sender inside the 'EncryptedWrapper'.
        // The 'secure' variable is essentially the EmailSender wearing a disguise.
        Sender secure = new EncryptedWrapper(normal);
        
        // When we call sendMessage(), it hits the Wrapper first.
        // The wrapper reverses "Secret Data" to "ataD terceS" and passes it to the email.
        secure.sendMessage("Secret Data");
    }
}