package Basic_problems;
import java.util.*;
//Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
//
//Return any array that satisfies this condition.
//
//
//
//Example 1:
//
//Input: nums = [3,1,2,4]
//Output: [2,4,3,1]
//Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
//Example 2:
//
//Input: nums = [0]
//Output: [0]
//-----------------------------------------------------------------------------------------------------------------

public class sortarraybyparity {
    public static int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int start = 0;
        int end = nums.length - 1;

        for (int num : nums) {
            if (num % 2 == 0) {
                result[start++] = num;  // Place even numbers at the beginning
            } else {
                result[end--] = num;    // Place odd numbers at the end
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 1, 2, 4};
        int[] result1 = sortArrayByParity(nums1);
        printArray(result1);  // Output could be [2, 4, 3, 1] or any valid arrangement

        int[] nums2 = {0};
        int[] result2 = sortArrayByParity(nums2);
        printArray(result2);  // Output: [0]
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

