import java.util.Scanner;

public class ArrayMatrixTwo {
  public static void main(String[] args) {
    int[][] matrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    // Calculate row sums, column sums, and diagonal sums
    int[] rowSums = new int[3];
    int[] colSums = new int[3];
    int diagonalSum1 = 0; // Top-left to bottom-right diagonal
    int diagonalSum2 = 0; // Top-right to bottom-left diagonal

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            rowSums[i] += matrix[i][j];
            colSums[j] += matrix[i][j];
            if (i == j) {
                diagonalSum1 += matrix[i][j];
            }
            if (i + j == 2) {
                diagonalSum2 += matrix[i][j];
            }
        }
    }

    // Print the matrix with row sums and calculate and print the total sum
    int totalSum = 0;
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println(rowSums[i]);
        totalSum += rowSums[i];
    }

    // Print column sums
    for (int i = 0; i < 3; i++) {
        System.out.print(colSums[i] + " ");
    }
    System.out.println(diagonalSum1 + " " + diagonalSum2);
    System.out.println(totalSum);
}
}
