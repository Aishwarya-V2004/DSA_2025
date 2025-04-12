package leetcodeproblems;

//Given an array of integers nums and an integer target, return indices
// of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution,
// and you may not use the same element twice.
//You can return the answer in any order.
//Example 1:
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//------------------------------------------------------------------------------------------
import java.util.HashMap;

public class TwoSumSolution {
    public static int[] twoSum(int[] nums, int target) {
        // Create a map to store value and its index
        HashMap<Integer, Integer> map = new HashMap<>();
        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            // Store the current value and its index
            map.put(nums[i], i);
        }
        // If no solution is found (shouldn't happen as per the problem statement)
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
    }
}
