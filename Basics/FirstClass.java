import java.util.Scanner;

public class FirstClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. Create the Object
        Person user = new Person();

        // --- FIRST NAME ---
        System.out.println("Enter your First Name: ");
        String inputFirst = sc.nextLine();
        // Use SETTER to save data securely into the object
        user.setFirstName(inputFirst);

        // --- LAST NAME ---
        System.out.println("Enter your Last Name: ");
        String inputLast = sc.nextLine();
        // Use SETTER to save data
        user.setLastName(inputLast);

        // --- OUTPUT ---
        // Use GETTER to retrieve data from the object to print it
        System.out.println("Full Name: " + user.getFirstName() + " " + user.getLastName());
    }
}

// This is the blueprint class (You can put this at the bottom of the same file)
class Person {
    // Private variables (Data is hidden)
    private String firstName;
    private String lastName;

    // --- GETTERS & SETTERS for First Name ---
    
    // Set (Write)
    public void setFirstName(String firstName) {
        this.firstName = firstName;    // this. is not a function its a keyword .... which tells is " My own "
    }
    
    // Get (Read)
    public String getFirstName() {
        return firstName;
    }

    // --- GETTERS & SETTERS for Last Name ---
    
    // Set (Write)
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Get (Read)
    public String getLastName() {
        return lastName;
    }
}