package Basic_problems;

public class Findoddoccurance {
    public static int findOddOccurrence(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num;   // XOR operation
        }
        return result;
    }
    public static void main(String[] args){
        int[] arr1 = {1, 2, 3, 2, 3, 1, 3};
        int[] arr2 = {5, 7, 2, 7, 5, 2, 5};
        System.out.println("Output: " + findOddOccurrence(arr1));  // Output:3
        System.out.println("Output: " + findOddOccurrence(arr2));  // Output:5
    }
}
