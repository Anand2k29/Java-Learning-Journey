import java.util.Scanner; // Import the Scanner class to read input from the keyboard

public class FlowControlAssignment {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the system (user)
        Scanner scanner = new Scanner(System.in);
        
        int choice; // Variable to store the user's menu selection

        // 'do-while' loop ensures the program runs at least once and keeps running 
        // until the user enters 0 to exit.
        do {
            // --- DISPLAY THE MENU ---
            System.out.println("\n--- Java Flow Control Assignment Menu ---");
            System.out.println("1. Check if Year is Leap Year");
            System.out.println("2. Check if Number is Odd or Even");
            System.out.println("3. Find Biggest of N numbers AND Factorial");
            System.out.println("4. Print Fibonacci Series");
            System.out.println("5. Calculate Student Grade");
            System.out.println("6. Display Multiplication Table");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            
            // Read the user's choice
            choice = scanner.nextInt();

            // Switch statement jumps to the specific logic based on 'choice'
            switch (choice) {
                
                // CASE 1: LEAP YEAR LOGIC
                case 1: 
                    System.out.print("Enter a year: ");
                    int year = scanner.nextInt();
                    
                    // Logic: A year is a leap year if:
                    // 1. It is divisible by 4 AND NOT divisible by 100
                    // OR
                    // 2. It is divisible by 400 (for century years like 2000)
                    if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                        System.out.println(year + " is a LEAP YEAR.");
                    } else {
                        System.out.println(year + " is NOT a leap year.");
                    }
                    break; // 'break' stops the code from falling into the next case

                // CASE 2: ODD OR EVEN LOGIC
                case 2: 
                    System.out.print("Enter a number: ");
                    int numOddEven = scanner.nextInt();
                    
                    // Modulo operator (%) gives the remainder. 
                    // If remainder is 0 when divided by 2, it's Even.
                    if (numOddEven % 2 == 0) {
                        System.out.println(numOddEven + " is EVEN.");
                    } else {
                        System.out.println(numOddEven + " is ODD.");
                    }
                    break;

                // CASE 3: BIGGEST OF N NUMBERS & FACTORIAL
                case 3: 
                    // -- Part A: Biggest of N numbers --
                    System.out.print("Enter count of numbers to compare (N): ");
                    int n = scanner.nextInt(); // User wants to compare 'n' numbers
                    
                    // Initialize 'max' to the smallest possible number so the first input is always larger
                    int max = Integer.MIN_VALUE; 
                    
                    System.out.println("Enter " + n + " numbers:");
                    // Loop 'n' times to get inputs
                    for (int i = 1; i <= n; i++) {
                        int currentNum = scanner.nextInt();
                        // If the new number is bigger than our current 'max', update 'max'
                        if (currentNum > max) {
                            max = currentNum;
                        }
                    }
                    System.out.println("The biggest number is: " + max);

                    // -- Part B: Factorial Logic --
                    System.out.print("Enter a number to find its Factorial: ");
                    int factNum = scanner.nextInt();
                    
                    // Use 'long' because factorials get very large very quickly (e.g., 20! is huge)
                    long factorial = 1; 
                    
                    // Loop from 1 up to the number, multiplying as we go (1 * 2 * 3 * ... * n)
                    for (int i = 1; i <= factNum; i++) {
                        factorial = factorial * i;
                    }
                    System.out.println("Factorial of " + factNum + " is: " + factorial);
                    break;

                // CASE 4: FIBONACCI SERIES LOGIC
                case 4: 
                    System.out.print("Enter the count for Fibonacci series: ");
                    int count = scanner.nextInt();
                    
                    int n1 = 0; // First number of series
                    int n2 = 1; // Second number of series
                    int n3;     // Variable to hold the sum
                    
                    // Print the first two numbers manually
                    System.out.print("Fibonacci Series: " + n1 + " " + n2); 
                    
                    // Start loop from 2 because we already printed 0 and 1
                    for (int i = 2; i < count; ++i) { 
                        n3 = n1 + n2;       // Next number is sum of previous two
                        System.out.print(" " + n3);
                        n1 = n2;            // Shift logic: n1 becomes the old n2
                        n2 = n3;            // Shift logic: n2 becomes the new n3
                    }
                    System.out.println(); // New line for formatting
                    break;

                // CASE 5: STUDENT GRADE LOGIC
                case 5: 
                    System.out.print("Enter student marks (0-100): ");
                    int marks = scanner.nextInt();
                    char grade;
                    
                    // simple 'if-else-if' ladder to check ranges
                    if (marks >= 90) {
                        grade = 'A';
                    } else if (marks >= 70) {
                        grade = 'B';
                    } else if (marks >= 50) {
                        grade = 'C';
                    } else {
                        grade = 'F'; // Fail
                    }
                    
                    if (grade == 'F') {
                        System.out.println("Result: Fail");
                    } else {
                        System.out.println("Result: Pass with Grade " + grade);
                    }
                    break;

                // CASE 6: MULTIPLICATION TABLE LOGIC
                case 6: 
                    System.out.print("Enter a number for the table: ");
                    int tableNum = scanner.nextInt();
                    
                    System.out.println("Multiplication Table of " + tableNum + ":");
                    // Loop 1 to 10 and print the calculation
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(tableNum + " * " + i + " = " + (tableNum * i));
                    }
                    break;
                
                // CASE 0: EXIT PROGRAM
                case 0:
                    System.out.println("Exiting program.");
                    // System.exit(0) kills the JVM and stops the program completely
                    System.exit(0);
                    break;

                // DEFAULT: Handles any input that isn't 0-6
                default:
                    System.out.println("Invalid choice! Please enter 0-6.");
            }

            System.out.println("-----------------------------------------");
        // The condition for the do-while loop
        } while (choice != 0);
        
        scanner.close(); // Good practice to close scanner to prevent memory leaks
    }
}