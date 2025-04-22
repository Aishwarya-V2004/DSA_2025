package leetcodeproblems;

public class StringToIntegerAtoi {

    public int myAtoi(String s) {
        int i = 0, n = s.length();
        int sign = 1;
        long result = 0;
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        while (i < n && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');
            if (sign * result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if (sign * result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            i++;
        }
        return (int) (sign * result);
    }
    public static void main(String[] args) {
        StringToIntegerAtoi atoiConverter = new StringToIntegerAtoi();
        System.out.println(atoiConverter.myAtoi("42"));           // Output: 42
        System.out.println(atoiConverter.myAtoi("   -42"));       // Output: -42
        System.out.println(atoiConverter.myAtoi("4193 with words")); // Output: 4193
        System.out.println(atoiConverter.myAtoi("words and 987"));   // Output: 0
        System.out.println(atoiConverter.myAtoi("-91283472332"));    // Output: -2147483648
    }
}
