package arrays_leetcode;

//Write a function called middle that takes an array and returns a new array that contains all but the first and last elements.

//myArray = [1, 2, 3, 4]
//middle(myArray)  # [2,3].



public class Middlenumbers_leeteasy {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int[] result = middle(array);

        // Print the result array
        System.out.print("Middle elements: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    // Method to return middle elements (excluding the first and last)
    public static int[] middle(int[] array) {
        int n = array.length;

        // Handle case where there are no middle elements
        if (n <= 2) {
            System.out.println("There are no middle elements.");
            return new int[0]; // Return an empty array
        }

        // Create a new array to store the middle elements
        int[] result = new int[n - 2];

        // Copy the middle elements into the result array
        for(int i = 1; i < n - 1; i++) {
            result[i - 1] = array[i];
        }

        return result;
    }
}
