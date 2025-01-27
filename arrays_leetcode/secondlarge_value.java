package arrays_leetcode;
import java.util.Arrays;

public class secondlarge_value {

    static int findSecondLargest(int[] arr) {
        Arrays.sort(arr);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != arr[arr.length - 1]) {
                return arr[i]; // Return the second largest
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int result = findSecondLargest(arr);
        System.out.println(result);
    }
}
