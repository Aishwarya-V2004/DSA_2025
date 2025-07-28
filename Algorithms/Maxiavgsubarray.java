package Algorithms;

//You are given an integer array nums consisting of n elements, and an integer k.
//Find a contiguous subarray whose length is equal to k that has the maximum average value and
// return this value. Any answer with a calculation error less than 10-5 will be accepted.
//Example 1:
//Input: nums = [1,12,-5,-6,50,3], k = 4
//Output: 12.75000
//Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
//Example 2:
//Input: nums = [5], k = 1
//Output: 5.00000
//-------------------------------------------------------------------------------------------------------------

public class Maxiavgsubarray{

    public static double findMaxAverage(int[] nums, int k) {
        double maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }

        double currentSum = maxSum;
        for (int i = k; i < nums.length; i++) {
            currentSum = currentSum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum / k;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 12, -5, -6, 50, 3};
        int k1 = 4;
        System.out.printf("Maximum average for test case 1: %.5f\n", findMaxAverage(nums1, k1));
        int[] nums2 = {5};
        int k2 = 1;
        System.out.printf("Maximum average for test case 2: %.5f\n", findMaxAverage(nums2, k2));
    }
}


