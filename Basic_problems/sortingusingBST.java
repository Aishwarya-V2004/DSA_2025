package Basic_problems;

//Given a sorted array arr and an integer k, find the position(0-based indexing) at which k
// is present in the array using binary search.
//Note: If multiple occurrences are there, please return the smallest index.
//Examples:
//Input: arr[] = [1, 2, 3, 4, 5], k = 4
//Output: 3
//Explanation: 4 appears at index 3.
//Input: arr[] = [11, 22, 33, 44, 55], k = 445
//Output: -1
//Explanation: 445 is not present
//--------------------------------------------------------------------------------
public class sortingusingBST{
    public static int findFirstOccurrence(int[] arr, int k) {
        int left = 0, right = arr.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == k) {
                result = mid;
                right = mid - 1; // Continue searching in the left half
            } else if (arr[mid] < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int k1 = 4;
        System.out.println(findFirstOccurrence(arr1, k1)); // Output: 3

        int[] arr2 = {11, 22, 33, 44, 55};
        int k2 = 445;
        System.out.println(findFirstOccurrence(arr2, k2)); // Output: -1
    }
}
