package Basic_problems;
import java.util.*;
public class alternatenumbers {
    public ArrayList<Integer> getAlternates(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i += 2) { //using arraylistmethod here
            result.add(arr[i]);
        }

        return result;
    }
    public static void main(String[] args) {
        alternatenumbers obj = new alternatenumbers();
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4, 5};

        System.out.println(obj.getAlternates(arr1)); // Output: [1, 3]
        System.out.println(obj.getAlternates(arr2)); // Output: [1, 3, 5]
    }
}