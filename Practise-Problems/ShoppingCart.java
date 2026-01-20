// --- 1. THE INTERFACE (The Contract) ---
// This is the rule book. Any class that wants to be a "PaymentMethod"
// MUST contain a pay() method. It doesn't care HOW it pays, just that it does.
interface PaymentMethod {
    void pay(double amount);
}

// --- 2. THE IMPLEMENTATIONS (The Workers) ---

// Class #1: Credit Card
// This class signs the contract (implements PaymentMethod).
class CreditCard implements PaymentMethod {
    private String cardNumber;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        // EXPLANATION: This is the specific logic for Credit Cards.
        System.out.println("Paid $" + amount + " using Credit Card ending in " + cardNumber);
    }
}

// Class #2: PayPal
// This class also signs the same contract, but does the job differently.
class PayPal implements PaymentMethod {
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        // EXPLANATION: PayPal logic is different (uses email), 
        // but the method name 'pay' is exactly the same.
        System.out.println("Paid $" + amount + " using PayPal account: " + email);
    }
}

// --- 3. THE MAIN SYSTEM ---
public class ShoppingCart {
    public static void main(String[] args) {
        // Imagine the total bill is $100.
        double billAmount = 100.50;

        // SCENARIO A: User chooses Credit Card
        // EXPLANATION: Notice the type is 'PaymentMethod'. 
        // We treat the specific card as a generic payment method.
        PaymentMethod myCard = new CreditCard("1234-5678");
        myCard.pay(billAmount);

        // SCENARIO B: User switches to PayPal
        // We don't need to change the 'billAmount' or how we call 'pay()'.
        // We just swap the object.
        PaymentMethod myPaypal = new PayPal("user@example.com");
        myPaypal.pay(billAmount);
    }
}