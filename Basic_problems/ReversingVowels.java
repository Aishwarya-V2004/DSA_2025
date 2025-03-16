package Basic_problems;

public class ReversingVowels {
    public static String reverseVowels(String s) {
        char[] str = s.toCharArray();
        int left = 0, right = str.length - 1;
        String vowels = "aeiouAEIOU";

        while (left < right) {
            while (left < right && vowels.indexOf(str[left]) == -1) {
                left++;
            }
            while (left < right && vowels.indexOf(str[right]) == -1) {
                right--;
            }
            if (left < right) {
                char temp = str[left];
                str[left] = str[right];
                str[right] = temp;
                left++;
                right--;
            }
        }
        return new String(str);
    }

    public static void main(String[] args) {
        String s = "practice";
        System.out.println(reverseVowels(s)); // Output: "prectica" here a,i,e vowels
    }
}
