package Tree;

//You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where
// the ith row has exactly i coins. The last row of the staircase may be incomplete.
//Given the integer n, return the number of complete rows of the staircase you will build.
//Example 1:
//Input: n = 5
//Output: 2
//Explanation: Because the 3rd row is incomplete, we return 2.
//Example 2:
//Input: n = 8
//Output: 3
//Explanation: Because the 4th row is incomplete, we return 3.
//-----------------------------------------------------------------------------------------------------------------
public class Arrangingcoins {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 8;

        System.out.println("Complete rows for " + n1 + " coins: " + arrangeCoins(n1)); // Output: 2
        System.out.println("Complete rows for " + n2 + " coins: " + arrangeCoins(n2)); // Output: 3
    }

    public static int arrangeCoins(int n) {
        int left = 0, right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long current = (long) mid * (mid + 1) / 2;

            if (current == n) {
                return mid;
            } else if (current < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
}
