package Tree;

//You are given an array of characters letters that is sorted in non-decreasing order, and a character target.
// There are at least two different characters in letters.
//Return the smallest character in letters that is lexicographically greater than target.
// If such a character does not exist, return the first character in letters.
//Example 1:
//Input: letters = ["c","f","j"], target = "a"
//Output: "c"
//Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
//Example 2:
//Input: letters = ["c","f","j"], target = "c"
//Output: "f"
//Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.
//Example 3:
//Input: letters = ["x","x","y","y"], target = "z"
//Output: "x"
//Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].
//------------------------------------------------------------------------------------------------------------------

public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters1 = {'c', 'f', 'j'};
        char target1 = 'a';
        System.out.println("Output: " + nextGreatestLetter(letters1, target1)); // Output: c

        char[] letters2 = {'c', 'f', 'j'};
        char target2 = 'c';
        System.out.println("Output: " + nextGreatestLetter(letters2, target2)); // Output: f

        char[] letters3 = {'x', 'x', 'y', 'y'};
        char target3 = 'z';
        System.out.println("Output: " + nextGreatestLetter(letters3, target3)); // Output: x
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (letters[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // If we don't find a greater character, wrap around to the first
        return letters[left % letters.length];
    }
}
