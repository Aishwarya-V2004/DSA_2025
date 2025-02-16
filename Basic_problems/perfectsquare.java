package Basic_problems;

public class perfectsquare {
    public static int isPerfectSquare(int n) {
        int sum = 0;
        int odd = 1;
        while (sum < n) {
            sum += odd;
            odd += 2;
            if (sum == n) {
                return 1;
            }
        }
        return 0;  // If sum exceeds n, it's not a perfect square
    }

    public static void main(String[] args) {
        int n1 = 35;
        int n2 = 49;

        System.out.println(isPerfectSquare(n1));  // Output: 0
        System.out.println(isPerfectSquare(n2));  // Output: 1
    }
}
