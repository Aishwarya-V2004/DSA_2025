package arrays_leetcode;

import java.util.Arrays;

public class firsttwolargenumbers {
    public static int[] sort(int[] arr) {
        int n = arr.length;

        // Check if the array has fewer than two elements
        if (n < 2) {
            System.out.println("Array must have at least two elements.");
            return new int[0]; // Return an empty array
        }

        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Remove duplicates and collect unique elements
        int[] unique = new int[n];
        int index = 0;
        unique[index++] = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                unique[index++] = arr[i];
            }
        }

        // If there are fewer than two unique elements
        if (index < 2) {
            System.out.println("No second largest element exists.");
            return new int[0];
        }

        // Return the last two unique elements
        return new int[]{unique[index - 1], unique[index - 2]};
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 2, 5, 5, 4, 4};

        int[] result = sort(arr);
        if (result.length == 0) {
            System.out.println("Not enough unique elements for a result.");
        } else {
            System.out.println("Largest: " + result[0] + ", Second Largest: " + result[1]);
        }
    }
}
