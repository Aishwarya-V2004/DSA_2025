package Basic_problems;

class Identicalmatrix {
    public static int Identical(int N, int[][] Grid1, int[][] Grid2) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (Grid1[i][j] != Grid2[i][j]) {
                    return 0; // Matrices are not identical
                }
            }
        }
        return 1; // Matrices are identical
    }

    public static void main(String[] args) {
        int N = 2;
        int[][] Grid1 = {{1, 2}, {3, 4}};
        int[][] Grid2 = {{1, 2}, {3, 4}};

        System.out.println(Identical(N, Grid1, Grid2)); // Output: 1
    }
}
