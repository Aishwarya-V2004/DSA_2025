package arrays_leetcode;

//Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2,
// also represented as a string.
//Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.
//Example 1:
//Input: num1 = "2", num2 = "3"
//Output: "6"
//Example 2:
//Input: num1 = "123", num2 = "456"
//Output: "56088"s
//---------------------------------------------------------------------------------------------------------------------
public class MultiplyStrings {

    public static String multiply(String num1, String num2) {
        // Handle edge cases
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int m = num1.length(), n = num2.length();
        int[] result = new int[m + n];  // Maximum possible length of the result

        for (int i = m - 1; i >= 0; i--) {
            int digit1 = num1.charAt(i) - '0';

            for (int j = n - 1; j >= 0; j--) {
                int digit2 = num2.charAt(j) - '0';

                int sum = digit1 * digit2 + result[i + j + 1];

                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (sb.length() == 0 && num == 0) continue;
            sb.append(num);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String num1 = "2";
        String num2 = "3";
        System.out.println("Product: " + multiply(num1, num2));  // Output: 56088
    }
}
