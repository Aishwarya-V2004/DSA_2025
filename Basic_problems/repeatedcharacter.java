package Basic_problems;

//Given a string S of length n, the task is to find the earliest repeated
// character in it. The earliest repeated character means,
// the character that occurs more than once and whose second occurrence
// has the smallest index.
//Example:
//Input: s = “hello world”
//Output: l
//Explanation: l is the first element that repeats
//------------------------------------------------------------------------------------
import java.util.Scanner;

public class repeatedcharacter {
    public static String firstRepChar(String s)
    {
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return Character.toString(s.charAt(i));
                }
            }
        }
        return "-1";
    }
    public static void main(String[] args)
    {
        String s = "helloworld";
        System.out.println(firstRepChar(s));
    }
}
