import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeDivider {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- THE DANGER ZONE (The Try Block) ---
        // We put all the "risky" code here. This is where the program *tries*
        // to execute our logic. If anything goes wrong (like bad input or
        // dividing by zero), it immediately jumps out to the catch blocks below.
        try {
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // This is the specific line that crashes if num2 is 0.
            int result = num1 / num2; 
            
            System.out.println("Result: " + result);

        } 
        // --- SAFETY NET #1: MATH ERRORS ---
        // This block catches it if the user tries to divide by zero.
        // Instead of crashing, we print a helpful message.
        catch (ArithmeticException e) {
            System.out.println("Error: Math error! You cannot divide by zero.");
        } 
        // --- SAFETY NET #2: TYPING ERRORS ---
        // This catches it if the user types "abc" or "ten" instead of a number.
        // This is crucial for keeping the app running when users make typos.
        catch (InputMismatchException e) {
            System.out.println("Error: Invalid input! Please enter whole numbers only.");
        } 
        // --- SAFETY NET #3: THE CATCH-ALL ---
        // If some other unexpected weirdness happens, this generic 'Exception' 
        // will catch it. It's like a backup bucket for unknown errors.
        catch (Exception e) {
            System.out.println("Error: Something went wrong.");
        }
        // --- THE CLEANUP CREW (The Finally Block) ---
        // This code runs 100% of the time, whether the calculation succeeded or failed.
        // It's the perfect place to close connections (like the Scanner) to prevent memory leaks.
        finally {
            System.out.println("-- Calculator closed --");
            scanner.close(); 
        }
    }
}