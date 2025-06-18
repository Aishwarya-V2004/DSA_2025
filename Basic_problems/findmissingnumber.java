package Basic_problems;

public class findmissingnumber {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int total = n * n;

        int[] count = new int[total + 1]; // we use index 1 to total

        // Count how many times each number appears in the grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count[grid[i][j]]++;
            }
        }

        int[] result = new int[2]; // [repeated, missing]

        for (int i = 1; i <= total; i++) {
            if (count[i] == 2) {
                result[0] = i; // repeated
            } else if (count[i] == 0) {
                result[1] = i; // missing
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] grid = {{1, 3}, {2, 2}};
        findmissingnumber obj = new findmissingnumber();
        int[] result = obj.findMissingAndRepeatedValues(grid);
        System.out.println("Repeated number: " + result[0]);
        System.out.println("Missing number: " + result[1]);
    }
}
