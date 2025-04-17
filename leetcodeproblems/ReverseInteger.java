package leetcodeproblems;

public class ReverseInteger {
    public static int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            if (reversed > Integer.MAX_VALUE / 10 ||
                    (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; // overflow
            }
            if (reversed < Integer.MIN_VALUE / 10 ||
                    (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; // underflow
            }
            reversed = reversed * 10 + digit;
        }
        return reversed;
    }

    public static void main(String[] args) {
        int input1 = 123;
        int input2 = -123;
        int input3 = 120;
        System.out.println("Reversed " + input1 + " → " + reverse(input1));  // Output: 321
        System.out.println("Reversed " + input2 + " → " + reverse(input2));  // Output: -321
        System.out.println("Reversed " + input3 + " → " + reverse(input3));  // Output: 21
    }
}
