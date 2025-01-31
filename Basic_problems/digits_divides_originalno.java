package Basic_problems;

public class digits_divides_originalno {
    public static int countDividingDigits(int n) {
        int count = 0;
        int original = n;

        while (original > 0) {
            int digit = original % 10;
            if (digit != 0 && n % digit == 0) {
                count++;
            }
            original /= 10; // Remove last digit
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 23; // Example input
        System.out.println("Count of dividing digits: " + countDividingDigits(n));// Output: 3
    }
}
