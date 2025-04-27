package leetcodeproblems;

//Given two binary strings a and b, return their sum as a binary string.
//Example 1:
//Input: a = "11", b = "1"
//Output: "100"
//Example 2:
//Input: a = "1010", b = "1011"
//Output: "10101"
//-----------------------------------------------------------------------------------------
public class Binary {
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i--) - '0'; // Convert char to int
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0'; // Convert char to int
            }

            result.append(sum % 2); // Append current bit
            carry = sum / 2;        // Update carry
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));    // Output: "100"
        System.out.println(addBinary("1010", "1011"));// Output: "10101"
    }
}
