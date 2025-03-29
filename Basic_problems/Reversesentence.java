package Basic_problems;

//Given an input string s, reverse the order of the words.
//A word is defined as a sequence of non-space characters.
// The words in s will be separated by at least one space.
//Return a string of the words in reverse order concatenated by a single space.
//Note that s may contain leading or trailing spaces or multiple spaces
// between two words. The returned string should only have a single space
// separating the words. Do not include any extra spaces.
//Example 1:
////Input: s = "the sky is blue"
//Output: "blue is sky the"
//Example 2:
//Input: s = "  hello world  "
//Output: "world hello"
//Explanation: Your reversed string should not contain leading or trailing spaces.

//---------------------------------------------------------------------------------------------

public class Reversesentence {
    public static String reverseWords(String s) {

        String[] words = s.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" "); // Add space between words
            }
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String s1 = "the sky is blue";
        System.out.println(reverseWords(s1)); // Output: "blue is sky the"

        String s2 = "  hello world  ";
        System.out.println(reverseWords(s2)); // Output: "world hello"
    }
}
