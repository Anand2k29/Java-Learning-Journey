package wrapper;



// This class acts as a 'Wrapper' (or Decorator) around a Sender.
public class EncryptedWrapper implements Sender {

    // 1. COMPOSITION: The wrapper MUST hold a reference to a Sender object.
    // We use the interface type 'Sender' so we can wrap any type of sender 
    // (EmailSender, SmsSender, or even another Wrapper).
    private Sender wrappedSender;

    // 2. CONSTRUCTOR: We pass the target object into the wrapper.
    // This allows us to "inject" the behavior dynamically.
    public EncryptedWrapper(Sender sender) {
        this.wrappedSender = sender;
    }

    // 3. DELEGATION: We override the interface method to add our custom logic.
    @Override
    public void sendMessage(String message) {
        // WRAPPER LOGIC: Modify the data BEFORE passing it on.
        // Here, we simulate encryption by reversing the string.
        String encryptedMessage = new StringBuilder(message).reverse().toString();
        
        System.out.println(">> Wrapper: Encrypting message...");

        // DELEGATE: Pass the modified data to the original object.
        // The wrappedSender doesn't know it's handling encrypted data; 
        // it just does its job.
        wrappedSender.sendMessage(encryptedMessage);
    }
}