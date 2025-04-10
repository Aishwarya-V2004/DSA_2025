package leetcodeproblems;

//Given an integer array nums, find the subarray with the largest sum,
// and return its sum.
//Example 1:
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: The subarray [4,-1,2,1] has the largest sum 6.
//Example 2:
//Input: nums = [1]
//Output: 1
//Explanation: The subarray [1] has the largest sum 1.
//Example 3:
//Input: nums = [5,4,-1,7,8]
//Output: 23
//Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

//-----------------------------------------------------------------------------------------

public class MaxSubarraySum {
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums2 = {1};
        int[] nums3 = {5, 4, -1, 7, 8};

        System.out.println("Max Subarray Sum (Example 1): " + maxSubArray(nums1)); // Output: 6
        System.out.println("Max Subarray Sum (Example 2): " + maxSubArray(nums2)); // Output: 1
        System.out.println("Max Subarray Sum (Example 3): " + maxSubArray(nums3)); // Output: 23
    }
}

