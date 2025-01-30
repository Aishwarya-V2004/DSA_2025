package Basic_problems;

//Given an integer n, Return an array containing the sum of odd numbers and even numbers from 1 to n, where the first number is the sum of odd numbers and the second number is the sum of even numbers.
//Examples:
//Input: n = 5
//Output: 9 6
//Explanation: Odd numbers upto 5 are 1, 3, 5 and their sum = 1 + 3 + 5 = 9.Even numbers upto 5 are 2 and 4 and their sum = 2 + 4 = 6.
//----------------------------------------------------------------------------------

import java.util.Arrays;

public class sumofoddandeven {
    public int[] findSum(int n) {
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }

        return new int[] {evenSum, oddSum};
    }

    public static void main(String[] args) {
        sumofoddandeven obj = new sumofoddandeven();
        int n = 10;
        int[] result = obj.findSum(n);
        System.out.println("Even Sum: " + result[0]);
        System.out.println("Odd Sum: " + result[1]);
        System.out.println(Arrays.toString(result));//to convert arrays to string in 1 dimension
    }
}
