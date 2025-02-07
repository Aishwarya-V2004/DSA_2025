package Basic_problems;
//Given an array arr, the task is to find whether the arr is palindrome or not.
// If the arr is palindrome then return true else return false.
//An array is said to be palindrome if its reverse array matches the original array.
//---------------------------------------------------------------------------------
public class perfectArray {
    public static boolean isPerfect(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 2, 1};
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println(isPerfect(arr1)); //true
        System.out.println(isPerfect(arr2));// false
    }
}
