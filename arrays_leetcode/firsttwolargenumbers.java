package arrays_leetcode;

import java.util.Arrays;

public class firsttwolargenumbers {
    public static int[] sort(int[] arr) {
        int n = arr.length;

        if (n < 2) {
            System.out.println("Array must have at least two elements.");
            return new int[0]; // Return an empty array
        }

        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Remove duplicates
        int count = 1; // At least one unique element exists
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                count++;
            }
        }

        // Create a new array for unique elements
        int[] unique = new int[count];
        unique[0] = arr[0];
        int index = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                unique[index++] = arr[i];
            }
        }

        // If there are fewer than two unique elements
        if (unique.length < 2) {
            System.out.println("No second largest element exists.");
            return new int[0]; // Return an empty array
        }

        // Return the last two unique elements
        return new int[]{unique[unique.length - 1], unique[unique.length - 2]};
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
