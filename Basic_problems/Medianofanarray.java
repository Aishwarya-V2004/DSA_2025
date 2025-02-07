package Basic_problems;
import java.util.Arrays;
//Given an array arr[] of integers, calculate the median.
//Examples:
//Input: arr[] = [90, 100, 78, 89, 67]
//Output: 89
//Explanation: After sorting the array middle element is the median
//Input: arr[] = [56, 67, 30, 79]
// Output: 61.5
// Explanation: In case of even number of elements, average of two middle elements is the median.
//----------------------------------------------------------------------------
public class Medianofanarray {
    static double findMedian(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        if (n % 2 == 0) {
            int m = n / 2;
            return (arr[m - 1] + arr[m]) / 2.0; // Ensure decimal division
        } else {
            return arr[n / 2];
        }
    }

    public static void main(String[] args) {
        Medianofanarray obj = new Medianofanarray();
        int[] arr1 = {90, 100, 78, 89, 67};
        int[] arr2 = {56, 67, 30, 79};

        System.out.println("Median of arr1: " + obj.findMedian(arr1)); // Output: 89
        System.out.println("Median of arr2: " + obj.findMedian(arr2)); // Output: 61.5
    }
}
