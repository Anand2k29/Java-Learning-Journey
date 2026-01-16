import java.util.Scanner; // Import Scanner to read user input

public class MatrixInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ==========================================
        // STEP 1: Define the size of the 2D Array
        // ==========================================
        System.out.print("Enter number of Rows: ");
        int rows = sc.nextInt(); // User decides how many horizontal lines
        
        System.out.print("Enter number of Columns: ");
        int cols = sc.nextInt(); // User decides how many vertical lines

        // Create the empty 2D array (Grid) with the specified size
        int[][] matrix = new int[rows][cols];


        // ==========================================
        // STEP 2: Read Input (Fill the Grid)
        // ==========================================
        System.out.println("Enter the elements of the array:");

        // Outer Loop: Controls the Rows (Top to Bottom)
        for (int i = 0; i < rows; i++) {
            
            // Inner Loop: Controls the Columns (Left to Right)
            for (int j = 0; j < cols; j++) {
                
                // Prompt the user for a specific cell like [0][1]
                // (Optional: remove the print below if you want to type fast)
                System.out.print("Enter value for cell [" + i + "][" + j + "]: ");
                
                // Read the number and store it in the specific slot
                matrix[i][j] = sc.nextInt();
            }
        }


        // ==========================================
        // STEP 3: Print Output (Display the Grid)
        // ==========================================
        System.out.println("\n--- The Matrix You Entered ---");

        // We use nested loops again to visit every cell for printing
        for (int i = 0; i < rows; i++) {
            
            for (int j = 0; j < cols; j++) {
                // Print the number followed by a "space" so they don't stick together.
                // NOTE: Use 'print' (not println) so they stay on the SAME line.
                System.out.print(matrix[i][j] + " ");
            }
            
            // After finishing one row (the inner loop finishes), 
            // we print a new line to move to the next row below.
            System.out.println(); 
        }
    }
}