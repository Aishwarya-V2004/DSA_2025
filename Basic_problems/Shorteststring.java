package Basic_problems;

//Given a string licensePlate and an array of strings words, find the shortest completing word in words.
//A completing word is a word that contains all the letters in licensePlate. Ignore numbers and spaces
// in licensePlate, and treat letters as case insensitive. If a letter appears more than once in licensePlate,
// then it must appear in the word the same number of times or more.
//For example, if licensePlate = "aBc 12c", then it contains letters 'a', 'b' (ignoring case), and 'c' twice.
// Possible completing words are "abccdef", "caaacab", and "cbca".
//Return the shortest completing word in words. It is guaranteed an answer exists. If there are multiple
// shortest completing words, return the first one that occurs in words.
//Example 1:
//Input: licensePlate = "1s3 PSt", words = ["step","steps","stripe","stepple"]
//Output: "steps"
//Explanation: licensePlate contains letters 's', 'p', 's' (ignoring case), and 't'.
//"step" contains 't' and 'p', but only contains 1 's'.
//"steps" contains 't', 'p', and both 's' characters.
//"stripe" is missing an 's'.
//"stepple" is missing an 's'.
//Since "steps" is the only word containing all the letters, that is the answer.
//Example 2:
//
//Input: licensePlate = "1s3 456", words = ["looks","pest","stew","show"]
//Output: "pest"
//Explanation: licensePlate only contains the letter 's'. All the words contain 's', but among these "pest", "stew", and "show" are shortest. The answer is "pest" because it is the word that appears earliest of the 3.
//-------------------------------------------------------------------------------------------------------------------
import java.util.*;

public class Shorteststring {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] licenseCount = getCharCount(licensePlate);

        String result = null;
        for (String word : words) {
            if (completes(word, licenseCount)) {
                if (result == null || word.length() < result.length()) {
                    result = word;
                }
            }
        }
        return result;
    }

    private int[] getCharCount(String str) {
        int[] count = new int[26];
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                count[Character.toLowerCase(ch) - 'a']++;
            }
        }
        return count;
    }

    private boolean completes(String word, int[] licenseCount) {
        int[] wordCount = new int[26];
        for (char ch : word.toCharArray()) {
            if (Character.isLetter(ch)) {
                wordCount[ch - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (wordCount[i] < licenseCount[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Shorteststring sol = new Shorteststring();

        String licensePlate1 = "1s3 PSt";
        String[] words1 = {"step", "steps", "stripe", "stepple"};
        System.out.println(sol.shortestCompletingWord(licensePlate1, words1));  // Output: "steps"

        String licensePlate2 = "1s3 456";
        String[] words2 = {"looks", "pest", "stew", "show"};
        System.out.println(sol.shortestCompletingWord(licensePlate2, words2));  // Output: "pest"
    }
}
