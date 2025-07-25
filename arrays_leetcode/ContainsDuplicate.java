package arrays_leetcode;



//Given an integer array nums and an integer k, return true if there are two distinct indices i and j
// in the array such that nums[i] == nums[j] and abs(i - j) <= k.
//Example 1:
//Input: nums = [1,2,3,1], k = 3
//Output: true
//Example 2:
//Input: nums = [1,0,1,1], k = 1
//Output: true
//Example 3:
//Input: nums = [1,2,3,1,2,3], k = 2
//Output: false
//------------------------------------------------------------------------------------------------------------------
import java.util.HashMap;

public class ContainsDuplicate{
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int prevIndex = map.get(nums[i]);
                if (i - prevIndex <= k) {
                    return true;
                }
            }
            map.put(nums[i], i); // update the index
        }

        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate obj = new ContainsDuplicate();
        System.out.println(obj.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));  // true
        System.out.println(obj.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));  // true
        System.out.println(obj.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));  // false
    }
}
