package Basic_problems;

public class ToeplitzMatrix {
    public static boolean isToeplitz(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < cols - 1; j++) {
                if (mat[i][j] != mat[i + 1][j + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] mat1 = {
                {6, 7, 8},
                {4, 6, 7},
                {1, 4, 6}
        };
        int[][] mat2 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println(isToeplitz(mat1)); // Output: true
        System.out.println(isToeplitz(mat2)); // Output: false
    }
}
