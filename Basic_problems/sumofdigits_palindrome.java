package Basic_problems;

public class sumofdigits_palindrome {
    public static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + (num % 10);
            num /= 10;
        }
        return original == reversed;
    }
    public static boolean isDigitSumPalindrome(int n) {
        int sum = digitSum(n);
        return isPalindrome(sum);
    }
    public static void main(String[] args) {
        int n1 = 56;
        int n2 = 98;
        System.out.println(isDigitSumPalindrome(n1)); // true
        System.out.println(isDigitSumPalindrome(n2)); // false
    }
}
