package leetcodeproblems;

//You are climbing a staircase. It takes n steps to reach the top.
//Each time you can either climb 1 or 2 steps.
// In how many distinct ways can you climb to the top?
//Example 1:
//Input: n = 2
//Output: 2
//Explanation: There are two ways to climb to the top.
//1. 1 step + 1 step
//2. 2 steps
//-------------------------------------------------------------------------------------------
public class ClimbingStairs {
    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int first = 1, second = 2, result = 0;
        for (int i = 3; i <= n; i++) {
            result = first + second;
            first = second;
            second = result;
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 4;  // Change this value to test different cases
        System.out.println("Distinct ways to climb " + n + " steps: " + climbStairs(n));
    }
}

