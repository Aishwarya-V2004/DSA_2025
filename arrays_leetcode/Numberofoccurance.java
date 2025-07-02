package arrays_leetcode;

//Given a sorted array, arr[] and a number target, you need to find the number of occurrences of target in arr[].
//Examples :
//Input: arr[] = [1, 1, 2, 2, 2, 2, 3], target = 2
//Output: 4
//Explanation: target = 2 occurs 4 times in the given array so the output is 4.
//Input: arr[] = [1, 1, 2, 2, 2, 2, 3], target = 4
//Output: 0
//Explanation: target = 4 is not present in the given array so the output is 0.
//Input: arr[] = [8, 9, 10, 12, 12, 12], target = 12
//Output: 3
//Explanation: target = 12 occurs 3 times in the given array so the output is 3.
//--------------------------------------------------------------------------------------------------------------------

public class Numberofoccurance {

    // Function to find the first occurrence of target
    public static int firstOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1, result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                result = mid;
                high = mid - 1;  // keep searching left side
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    // Function to find the last occurrence of target
    public static int lastOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1, result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                result = mid;
                low = mid + 1;  // keep searching right side
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    // Main function to count occurrences
    public static int countOccurrences(int[] arr, int target) {
        int first = firstOccurrence(arr, target);
        if (first == -1) return 0; // target not found

        int last = lastOccurrence(arr, target);
        return last - first + 1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 2, 2, 2, 3};
        System.out.println(countOccurrences(arr1, 2)); // 4

        int[] arr2 = {1, 1, 2, 2, 2, 2, 3};
        System.out.println(countOccurrences(arr2, 4)); // 0

        int[] arr3 = {8, 9, 10, 12, 12, 12};
        System.out.println(countOccurrences(arr3, 12)); // 3
    }
}
