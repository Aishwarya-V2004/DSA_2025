package arrays_leetcode;

//Given an integer array arr[]. You need to find the maximum sum of a subarray.
//Examples:
//Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
//Output: 11
//Explanation: The subarray {7, -1, 2, 3} has the largest sum 11.
//Input: arr[] = [-2, -4]
//Output: -2
//Explanation: The subarray {-2} has the largest sum -2.
//Input: arr[] = [5, 4, 1, 7, 8]
//Output: 25
//Explanation: The subarray {5, 4, 1, 7, 8} has the largest sum 25.
//how to solve this using kadanes algorithm
//-------------------------------------------------------------------------------------------------------------------
public class MaxSubArraySum {
    public static int subArray(int[] arr){
        int maxsofar = arr[0];
        int currentsum = arr[0];
        for(int i=1;i<arr.length;i++){
            currentsum = Math.max(arr[i],currentsum+arr[i]);
            maxsofar = Math.max(maxsofar,currentsum);
        }
        return maxsofar;
    }

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5}; //15
        int[] arr1 = {2, 3, -8, 7, -1, 2, 3}; //11

        System.out.println(subArray(arr));
        System.out.println(subArray(arr1));
    }
}
