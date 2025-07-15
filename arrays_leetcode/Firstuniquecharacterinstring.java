package arrays_leetcode;


//Given a string s, find the first non-repeating character in it and return its index. If it does not exist,
// return -1.
//Example 1:
//Input: s = "leetcode"
//Output: 0
//Explanation:
//The character 'l' at index 0 is the first character that does not occur at any other index.
//Example 2:
//Input: s = "loveleetcode"
//Output: 2
//Example 3:
//Input: s = "aabb"
//Output: -1
//--------------------------------------------------------------------------------------------------------------

import java.util.*;

public class Firstuniquecharacterinstring {
    public static int firstUniqChar(String s) {
        // Create a map to store character counts
        Map<Character, Integer> countMap = new HashMap<>();

        // First pass: count occurrences of each character
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        // Second pass: find the index of the first character with count 1
        for (int i = 0; i < s.length(); i++) {
            if (countMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1; // No unique character found
    }

    public static void main(String[] args) {
        String s1 = "leetcode";
        String s2 = "loveleetcode";
        String s3 = "aabb";

        System.out.println(firstUniqChar(s1)); // Output: 0
        System.out.println(firstUniqChar(s2)); // Output: 2
        System.out.println(firstUniqChar(s3)); // Output: -1
    }
}

