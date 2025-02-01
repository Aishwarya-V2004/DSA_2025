package Basic_problems;

public class palindrome {
    static boolean isPalinArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int rev = 0;
            while (temp != 0) {
                int rem = temp % 10;
                rev = rev * 10 + rem;
                temp = temp / 10;
            }
            if (arr[i] != rev) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr1 = {121, 232, 454, 555};
        int[] arr2 = {123, 232, 454, 555};
        System.out.println("Array 1 is palindrome array? " + isPalinArray(arr1)); // Expected: true
        System.out.println("Array 2 is palindrome array? " + isPalinArray(arr2)); // Expected: false
    }
}
