package Basic_problems;

public class UnionSortedArrays {
    public static int findIntersectionCount(int[] a, int[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a1 = {89, 24, 75, 11, 23};
        int[] b1 = {89, 2, 4};
        System.out.println(findIntersectionCount(a1, b1)); // Output: 1
    }
}
