package arrays_leetcode;

//Given two integers representing the numerator and denominator of a fraction, return the fraction in string format.
//If the fractional part is repeating, enclose the repeating part in parentheses.
//If multiple answers are possible, return any of them.
//It is guaranteed that the length of the answer string is less than 104 for all the given inputs.
//Example 1:
//Input: numerator = 1, denominator = 2
//Output: "0.5"
//Example 2:
//Input: numerator = 2, denominator = 1
//Output: "2"
//Example 3:
//Input: numerator = 4, denominator = 333
//Output: "0.(012)"
//-----------------------------------------------------------------------------------------------------------------------


import java.util.HashMap;
import java.util.Map;

public class FractiontoRecurringDecimal {
    public String FractiontoRecurringDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";

        StringBuilder result = new StringBuilder();

        // Handle sign
        if ((numerator < 0) ^ (denominator < 0)) {
            result.append("-");
        }

        // Convert to long to handle overflow and take absolute values
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);

        // Append the integer part
        result.append(num / den);
        num %= den;

        if (num == 0) return result.toString();

        result.append(".");

        // Map to store previously seen remainders and their positions
        Map<Long, Integer> map = new HashMap<>();

        while (num != 0) {
            if (map.containsKey(num)) {
                int pos = map.get(num);
                result.insert(pos, "(");
                result.append(")");
                break;
            }

            map.put(num, result.length());
            num *= 10;
            result.append(num / den);
            num %= den;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        FractiontoRecurringDecimal obj = new FractiontoRecurringDecimal();
        System.out.println(obj.FractiontoRecurringDecimal(1, 2));    // Output: "0.5"
        System.out.println(obj.FractiontoRecurringDecimal(2, 1));    // Output: "2"
        System.out.println(obj.FractiontoRecurringDecimal(4, 333));  // Output: "0.(012)"
    }
}
