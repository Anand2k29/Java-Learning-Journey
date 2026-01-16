import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define the size of the matrix (2x2)
        int rows = 2;
        int cols = 2;

        // 1. Declare three matrices
        int[][] matA = new int[rows][cols];
        int[][] matB = new int[rows][cols];
        int[][] sum  = new int[rows][cols];

        // 2. Input for First Matrix
        System.out.println("Enter elements for Matrix A (2x2):");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                matA[i][j] = sc.nextInt();
            }
        }

        // 3. Input for Second Matrix
        System.out.println("Enter elements for Matrix B (2x2):");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                matB[i][j] = sc.nextInt();
            }
        }

        // 4. Logic: Add them up
        // We visit every cell, add A and B, and store it in 'sum'
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                sum[i][j] = matA[i][j] + matB[i][j];
            }
        }

        // 5. Output the Result
        System.out.println("Sum of the two matrices:");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println(); // Move to next line after printing a row
        }
    }
}