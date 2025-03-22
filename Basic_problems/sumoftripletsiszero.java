package Basic_problems;

import java.util.*;

//Given an array nums of n integers, find all unique triplets
// (nums[i], nums[j], nums[k]) such that:
//nums[i] + nums[j] + nums[k] == 0
//i ≠ j ≠ k (distinct indices)
//----------------------------------------------------------------------------------
public class sumoftripletsiszero{
    public static List<List<Integer>> sumoftripletsiszero(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sort the array to use two-pointer approach

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // Skip duplicates

            int left = i + 1, right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Move pointers and avoid duplicates
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++; // Increase sum by moving left
                } else {
                    right--; // Decrease sum by moving right
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sumoftripletsiszero(new int[]{-1, 0, 1, 2, -1, -4})); // Output: [[-1, -1, 2], [-1, 0, 1]]
        System.out.println(sumoftripletsiszero(new int[]{0, 1, 1})); // Output: []
        System.out.println(sumoftripletsiszero(new int[]{0, 0, 0})); // Output: [[0, 0, 0]]
    }
}
