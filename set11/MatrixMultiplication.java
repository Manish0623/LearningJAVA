import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions
        System.out.println("Enter number of rows for the first matrix:");
        int rows1 = sc.nextInt();

        System.out.println("Enter number of columns for the first matrix:");
        int cols1 = sc.nextInt();

        System.out.println("Enter number of columns for the second matrix:");
        int cols2 = sc.nextInt();

        // Validation (optional but good)
        if (rows1 <= 0 || cols1 <= 0 || cols2 <= 0) {
            System.out.println("Matrix dimensions must be positive integers.");
            sc.close();
            return;
        }

        // Initialize matrices
        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[cols1][cols2];  // Number of rows in matrix2 == cols1
        int[][] result = new int[rows1][cols2];

        // Input matrix1
        System.out.println("Enter elements of the first matrix (" + rows1 + " x " + cols1 + "):");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        // Input matrix2
        System.out.println("Enter elements of the second matrix (" + cols1 + " x " + cols2 + "):");
        for (int i = 0; i < cols1; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Matrix multiplication
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Display result
        System.out.println("Resultant Matrix (A x B):");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
