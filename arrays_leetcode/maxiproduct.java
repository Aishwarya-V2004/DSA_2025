package arrays_leetcode;
//Max Product of Two Integers
//How to find maximum product of two integers in the array where all elements are positive.

//Example

//int[] intArray = {10,20,30,40,50};
//maxProduct(intArray) // (40,50)

import java.util.Arrays;

public class maxiproduct {
    public static void main(String[] args) {
        int intArray[] = {3, 2, 1, 5, 4};
        System.out.println("The two numbers with the maximum product are: " + maxProduct(intArray));
    }

    public static String maxProduct(int[] intArray) {
        Arrays.sort(intArray); // Sort the array
        int n = intArray.length; // Get length

        // Get the two largest numbers and return them as a string
        return intArray[n - 1] + "," + intArray[n - 2];
    }
}

