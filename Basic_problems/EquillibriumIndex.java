package Basic_problems;

import java.util.*;

//Given an array arr[] of size n, the task is to return an equilibrium index (if any) or -1 if no equilibrium index
// exists. The equilibrium index of an array is an index such that the sum of all elements at lower indexes equals
// the sum of all elements at higher indexes.
//Note: When the index is at the start of the array, the left sum is 0, and when it's at the end, the right sum is 0.
//Examples:
//Input: arr[] = [1, 2, 0, 3]
//Output: 2
//Explanation: The sum of left of index 2 is 1 + 2 = 3 and sum on right of index 2 is 3.
//Input: arr[] = [1, 1, 1, 1]
//Output: -1
//Explanation: There is no equilibrium index in the array.
//Input: arr[] = [-7, 1, 5, 2, -4, 3, 0]
//Output: 3
//Explanation: The sum of left of index 3 is -7 + 1 + 5 = -1 and sum on right of index 3 is -4 + 3 + 0 = -1.
//------------------------------------------------------------------------------------------------------------------

public class EquillibriumIndex {
    static int findEquilibrium(int[] arr) {

        // Check for indexes one by one until
        // an equilibrium index is found
        for (int i = 0; i < arr.length; ++i) {
            // Get left sum
            int leftSum = 0;
            for (int j = 0; j < i; j++)
                leftSum += arr[j];

            // Get right sum
            int rightSum = 0;
            for (int j = i + 1; j < arr.length; j++)
                rightSum += arr[j];

            // If leftsum and rightsum are same, then
            // index i is an equilibrium index
            if (leftSum == rightSum)
                return i;
        }

        // If equilibrium index doesn't exist
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(findEquilibrium(arr));
    }
}