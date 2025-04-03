package leetcodeproblems;

//Given a string s consisting of words and spaces,
// return the length of the last word in the string.
//A word is a maximal substring consisting of non-space characters only.
//Example 1:
//Input: s = "Hello World"
//Output: 5
//Explanation: The last word is "World" with length 5.
//Example 2:
//Input: s = "   fly me   to   the moon  "
//Output: 4
//Explanation: The last word is "moon" with length 4.
//------------------------------------------------------------------------------------
public class lastwordlength {
    public static int lengthOfLastWord(String s) {
        s = s.trim(); // Remove leading and trailing spaces
        int lastSpaceIndex = s.lastIndexOf(' ');
        return s.length() - lastSpaceIndex - 1;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World")); // Output: 5
        System.out.println(lengthOfLastWord("   fly me   to   the moon  ")); // Output: 4
        System.out.println(lengthOfLastWord("luffy is still joyboy")); // Output: 6
    }
}
