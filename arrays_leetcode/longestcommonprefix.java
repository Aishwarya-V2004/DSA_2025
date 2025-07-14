package arrays_leetcode;

//Write a function to find the longest common prefix string amongst an array of strings.
//If there is no common prefix, return an empty string "".
//Example 1:
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
//Example 2:
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.
//------------------------------------------------------------------------------------------------------------

public class longestcommonprefix{

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Start with the first string as the prefix
        String prefix = strs[0];

        // Compare with each string in the array
        for (int i = 1; i < strs.length; i++) {
            // Reduce the prefix until the current string starts with it
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    // Example usage
    public static void main(String[] args) {
        String[] input1 = {"flower", "flow", "flight"};
        String[] input2 = {"dog", "racecar", "car"};

        System.out.println("Longest Common Prefix: " + longestCommonPrefix(input1)); // Output: "fl"
        System.out.println("Longest Common Prefix: " + longestCommonPrefix(input2)); // Output: ""
    }
}
