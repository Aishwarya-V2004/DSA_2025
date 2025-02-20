package Basic_problems;

//You are given an integer n. You need to convert all zeroes of n to 5.
//Examples:
//Input: n = 1004
//Output: 1554
//Explanation: There are two zeroes in 1004 on replacing all zeroes with 5,
// the new number will be 1554.
//Input: n = 121
//Output: 121
//Explanation: Since there are no zeroes in 121, the number remains as 121.
//----------------------------------------------------------------------------------
public class replacewithfives {
    public static int replaceZeroes(int n) {
        String numStr = String.valueOf(n);
        numStr = numStr.replace('0', '5');
        return Integer.parseInt(numStr);
    }

    public static void main(String[] args) {
        int n1 = 1004;
        int n2 = 121;
        System.out.println("Output: " + replaceZeroes(n1)); // Output: 1554
        System.out.println("Output: " + replaceZeroes(n2)); // Output: 121
    }
}
