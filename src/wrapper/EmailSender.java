package wrapper;

// This is the "Component" or the base object we want to wrap.
public class EmailSender implements Sender {

    @Override
    public void sendMessage(String message) {
        // This represents the core functionality.
        // It simply prints the message exactly as received.
        System.out.println("Email Sent: " + message);
    }
}