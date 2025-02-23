package Basic_problems;

import java.util.*;

public class Xortransformation {
    public static int[] transformArray(int[] arr, int n) {
        int[] newArr = new int[n];
        for (int i = 0; i < n - 1; i++) {
            newArr[i] = arr[i] ^ arr[i + 1];
        }
        newArr[n - 1] = arr[n - 1];
        return newArr;
    }
    public static void main(String[] args) {
        int[] arr = {10, 11, 1, 2, 3};
        int n = arr.length;
        int[] result = transformArray(arr, n);
        System.out.println(Arrays.toString(result));
    }

}
