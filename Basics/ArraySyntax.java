public class ArraySyntax {
    public static void main(String[] args) {
        
        // ==========================
        // PART 1: 1D Arrays (Lists)
        // ==========================
        System.out.println("--- 1D Array ---");

        // Syntax: dataType[] name = new dataType[size];
        int[] numbers = new int[3]; 

        // Storing values manually
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        // Alternative Syntax (Declare + Initialize instantly)
        // String[] names = {"Anand", "Java", "Code"};

        // Printing 1D Array using a Loop
        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }

        // ==========================
        // PART 2: 2D Arrays (Grids/Matrices)
        // ==========================
        System.out.println("\n--- 2D Array ---");

        // Syntax: dataType[][] name = new dataType[rows][columns];
        // This creates a grid with 2 Rows and 3 Columns
        int[][] matrix = new int[2][3];

        // Row 0
        matrix[0][0] = 1; 
        matrix[0][1] = 2;
        matrix[0][2] = 3;

        // Row 1
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;

        // Printing 2D Array (Needs Nested Loops)
        // Outer loop moves down the Rows
        for(int i = 0; i < 2; i++) {
            // Inner loop moves across the Columns
            for(int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // New line after every row
        }
    }
}