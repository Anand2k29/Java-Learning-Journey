public class ExceptionDemo {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        System.out.println("1. Program started.");

        try {
            // RISKY CODE: This usually causes a crash
            int result = numerator / denominator;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // HANDLING CODE: This runs if the error above happens
            System.out.println("Error: You cannot divide by zero!");
        }

        // The program continues running because we caught the error
        System.out.println("2. Program ended successfully.");
    }
}