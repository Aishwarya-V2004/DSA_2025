package arrays_leetcode;
import java.util.HashMap;
import java.util.Map;

//Given an array of integers arr, a lucky integer is an integer that has a frequency
// in the array equal to its value.
//Return the largest lucky integer in the array. If there is no lucky integer return -1.
//Example 1:
//Input: arr = [2,2,3,4]
//Output: 2
//Explanation: The only lucky number in the array is 2 because frequency[2] == 2.
//Example 2:
//Input: arr = [1,2,2,3,3,3]
//Output: 3
//Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.
//Example 3:
//Input: arr = [2,2,2,3,3]
//Output: -1
//Explanation: There are no lucky numbers in the array.
//---------------------------------------------------------------------------------------------------------------------
public class LuckyInteger {

    public static int findLucky(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Count the frequency of each element
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int result = -1;

        // Check for lucky integers
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (key == value) {
                result = Math.max(result, key);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 2, 3, 4};
        int[] arr2 = {1, 2, 2, 3, 3, 3};
        int[] arr3 = {2, 2, 2, 3, 3};

        System.out.println( findLucky(arr1)); // Output: 2
        System.out.println( findLucky(arr2)); // Output: 3
        System.out.println( findLucky(arr3)); // Output: -1
    }
}
