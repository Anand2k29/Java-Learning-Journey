package wrapper;// 1. Belongs to the 'wrapper' folder

// The common interface. 
// This allows the program to treat the Base Object and the Wrapper interchangeably.
public interface Sender {
    
    // Abstract method to send a message
    void sendMessage(String message);
}