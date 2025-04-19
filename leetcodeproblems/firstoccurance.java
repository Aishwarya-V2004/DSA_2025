package leetcodeproblems;

//Given two strings needle and haystack, return the index of the
// first occurrence of needle in haystack, or -1 if needle is not part of haystack.
//Example 1:
//Input: haystack = "sadbutsad", needle = "sad"
//Output: 0
//Explanation: "sad" occurs at index 0 and 6.
//The first occurrence is at index 0, so we return 0.
//Example 2:
//Input: haystack = "leetcode", needle = "leeto"
//Output: -1
//Explanation: "leeto" did not occur in "leetcode", so we return -1. java code.
//-------------------------------------------------------------------------------------

public class firstoccurance {
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        // Example 1
        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        System.out.println(strStr(haystack1, needle1));  // Output: 0

        // Example 2
        String haystack2 = "leetcode";
        String needle2 = "leeto";
        System.out.println(strStr(haystack2, needle2));  // Output: -1
    }
}