package leetcodeproblems;

//You are given an n x n 2D matrix representing an image.
// Rotate the image by 90 degrees (clockwise) in place.
//🔍 Example:
//Input: matrix =
//  [[1,2,3],
//  [4,5,6],
//  [7,8,9]]
//Output: [
//  [7,4,1],
//  [8,5,2],
//  [9,6,3]]
//----------------------------------------------------------------------------------------

import java.util.Arrays;

public class Rotateimage {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {  //transposing the matrix
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {  // to reverse each row
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    // Main method to test the rotation
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        rotate(matrix);
        System.out.println("\nRotated Matrix (90 degrees clockwise):");
        printMatrix(matrix);
    }
}

