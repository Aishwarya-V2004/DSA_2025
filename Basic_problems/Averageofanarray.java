package Basic_problems;

//Given an array arr, find the average or mean of the prefix array at every index.
//Examples:
//Input: arr[] = [10, 20, 30, 40, 50]
//Output: [10, 15, 20, 25, 30]
//Explanation: 10 / 1 = 10, (10 + 20) / 2 = 15, (10 + 20 + 30) / 3 = 20 and so on.
//------------------------------------------------------------------------------------
import java.util.Arrays;

public class Averageofanarray {
    public static double[] prefixAverages(int[] arr) {
        int n = arr.length;
        double[] result = new double[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            result[i] = (double) sum / (i + 1);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        double[] averages = prefixAverages(arr);
        System.out.println(Arrays.toString(averages));
    }
}
