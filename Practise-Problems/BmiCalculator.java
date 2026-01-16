import java.util.*;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- STEP 1: Get Height ---
        // We print the question FIRST so the user knows what to do.
        System.out.print("Enter your height in Centimeters: ");
        
        // We check if the user actually typed a number to prevent crashes.
        if (sc.hasNextInt()) {
            int heightCm = sc.nextInt();

            // --- STEP 2: Get Weight ---
            System.out.print("Enter your Weight in Kilograms: ");
            int weightKg = sc.nextInt();

            // --- STEP 3: Math Logic ---
            // Convert height to meters (must use 100.0 to get a decimal result)
            double heightM = heightCm / 100.0;

            // Calculate BMI
            double bmi = weightKg / (heightM * heightM);

            // --- STEP 4: Print Classification ---
            // We check the ranges as defined in the problem
            if (bmi < 18.5) {
                System.out.println("Underweight");
            } else if (bmi <= 24.9) {
                System.out.println("Normal");
            } else if (bmi <= 29.9) {
                System.out.println("Overweight");
            } else {
                System.out.println("Obese");
            }

            // --- STEP 5: Print BMI Value ---
            // "%.1f" formats the number to have exactly 1 decimal place (e.g., 24.5)
            // % --> Format specifier 
            System.out.printf("%.1f\n", bmi);  //%.1f translates to: "Insert the decimal number here, rounded to one digit."
            
        } else {
            // This runs if the user typed text (like "hello") instead of a number
            System.out.println("Error: Please restart and enter a valid integer number.");
        }
    }
}