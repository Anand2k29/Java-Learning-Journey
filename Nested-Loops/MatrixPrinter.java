public class MatrixPrinter {
    public static void main(String[] args) {
        // A 2D array is an array of arrays.
        // { {Row 1}, {Row 2}, {Row 3} }
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("--- 3x3 Matrix ---");

        // Outer Loop: Go through each ROW
        for (int i = 0; i < matrix.length; i++) {
            
            // Inner Loop: Go through each COLUMN in that row
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            
            System.out.println(); // New line after every row
        }
    }
}