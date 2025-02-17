package Basic_problems;

//Given a number n. Your task is to check whether it is fascinating or not.
//Fascinating Number: A number with 3 or more digits is considered fascinating if, when it is multiplied by 2 and 3, and the resulting products are concatenated with the original number,
// the final sequence contains all the digits from 1 to 9 exactly once.
//Note:  If a number is fascinating, return true. Otherwise, return false.
//Examples:
//Input: n = 192
//Output: true
//Explanation: After multiplication with 2 and 3, and concatenating with original number, number will become 192384576 which contains all digits from 1 to 9.
//Input: n = 853
//Output: false
//Explanation: It is not a fascinating number
//-----------------------------------------------------------------------------------------
public class fascinatingnumber {
    public static boolean isFascinating(int n) {
        if (n < 100) {
            return false;
        }
        int n2 = n * 2;
        int n3 = n * 3;

        String concatenated = n + "" + n2 + "" + n3;
        if (concatenated.length() != 9) {
            return false;
        }

        for (char digit = '1'; digit <= '9'; digit++) {
            if (concatenated.indexOf(digit) == -1) {
                return false; // If any digit is missing, it's not fascinating
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 192;
        System.out.println(isFascinating(n));
        int n1 = 199;
        System.out.println(isFascinating(n1));
    }
}
