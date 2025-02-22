package Basic_problems;

//Given an array of integers, reverse the array in-place
// without using extra space.
//---------------------------------------------------------------------------------
public class ReverseArray {
    public static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            // Swap elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};

        System.out.println("Original array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        reverse(numbers);
        System.out.println("\nReversed array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
