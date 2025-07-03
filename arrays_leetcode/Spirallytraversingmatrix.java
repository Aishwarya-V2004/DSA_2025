package arrays_leetcode;

//You are given a rectangular matrix mat[][] of size n x m, and your task is to return
// an array while traversing the matrix in spiral form.
//Examples:
//Input: mat[][] = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]]
//Output: [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]
//Explanation:
//Input: mat[][] = [[1, 2, 3, 4, 5, 6], [7, 8, 9, 10, 11, 12], [13, 14, 15, 16, 17, 18]]
//Output: [1, 2, 3, 4, 5, 6, 12, 18, 17, 16, 15, 14, 13, 7, 8, 9, 10, 11]
//Explanation: Applying same technique as shown above.
//Input: mat[][] = [[32, 44, 27, 23], [54, 28, 50, 62]]
//Output: [32, 44, 27, 23, 62, 50, 28, 54]
//Explanation: Applying same technique as shown above, output will be [32, 44, 27, 23, 62, 50, 28, 54].
//--------------------------------------------------------------------------------------------------------------------
import java.util.*;

public class Spirallytraversingmatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        if (matrix.length == 0) return result;

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {

            // Traverse from Left to Right
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            // Traverse from Top to Bottom
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            // Traverse from Right to Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Traverse from Bottom to Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] mat1 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int[][] mat2 = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18}
        };

        int[][] mat3 = {
                {32, 44, 27, 23},
                {54, 28, 50, 62}
        };

        System.out.println("Spiral order 1: " + spiralOrder(mat1));
        System.out.println("Spiral order 2: " + spiralOrder(mat2));
        System.out.println("Spiral order 3: " + spiralOrder(mat3));
    }
}
