//Write a program to to check if an array contains a number in Java.

//int[] intArray = {1,2,3,4,5,6};
//searchInArray(intArray, 6); // 5

package arrays_leetcode;

public class searcharrayelement {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6};
        int numberToSearch = 6;

        int result = searchInArray(intArray, numberToSearch);
        System.out.println("Index of " + numberToSearch + ": " + result);
    }

    public static int searchInArray(int[] array, int target) {
        // Iterate through the array
        for (int i = 0; i < array.length; i++) {
            // Check if the current element matches the target
            if (array[i] == target) {
                return i; // Return the index
            }
        }
        return -1; // Return -1 if not found
    }
}

