package Algorithms;
// Kadane's Algorithm to find the maximum subarray sum
//--------------------------------------------------------------------------------------------------------------


public class Kadanealgorithm {


    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int currentMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Either extend the current subarray or start a new one
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        return maxSoFar;
    }

    // Main method to test the algorithm
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSum = maxSubArray(arr);

        System.out.println("Maximum Subarray Sum is: " + maxSum);
    }
}
