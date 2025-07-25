package Algorithms;

//A string s is nice if, for every letter of the alphabet that s contains, it appears both in uppercase and
// lowercase. For example, "abABB" is nice because 'A' and 'a' appear, and 'B' and 'b' appear. However,
// "abA" is not because 'b' appears, but 'B' does not.
//Given a string s, return the longest substring of s that is nice. If there are multiple,
// return the substring of the earliest occurrence. If there are none, return an empty string.
//Example 1:
//Input: s = "YazaAay"
//Output: "aAa"
//Explanation: "aAa" is a nice string because 'A/a' is the only letter of the alphabet in s, and both 'A' and
// 'a' appear.
//"aAa" is the longest nice substring.
//Example 2:
//Input: s = "Bb"
//Output: "Bb"
//Explanation: "Bb" is a nice string because both 'B' and 'b' appear. The whole string is a substring.
//Example 3:
//Input: s = "c"
//Output: ""
//Explanation: There are no nice substrings.
//-----------------------------------------------------------------------------------------------------------------

public class Longestnicesubstring {

    public static String longestNiceSubstring(String s) {
        if (s.length() < 2) return "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (s.indexOf(Character.toLowerCase(ch)) != -1 && s.indexOf(Character.toUpperCase(ch)) != -1) {
                continue;
            }

            // Split and recursively check both halves
            String left = longestNiceSubstring(s.substring(0, i));
            String right = longestNiceSubstring(s.substring(i + 1));
            return left.length() >= right.length() ? left : right;
        }

        // If all characters are nice
        return s;
    }

    public static void main(String[] args) {
        System.out.println(longestNiceSubstring("YazaAay"));  // Output: "aAa"
        System.out.println(longestNiceSubstring("Bb"));       // Output: "Bb"
        System.out.println(longestNiceSubstring("c"));        // Output: ""
    }
}

