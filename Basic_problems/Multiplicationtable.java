package Basic_problems;

import java.util.Arrays;

//Create the multiplication table from 1 to 10 for a given number N
// and return the table as an array.
//Examples:
//Input: N = 9
//Output: 9 18 27 36 45 54 63 72 81 90
//Input: N = 2
//Output: 2 4 6 8 10 12 14 16 18 20
//------------------------------------------------------------------------------------
public class Multiplicationtable {
    public static int[] generateTable(int N) {
        int[] table = new int[10];
        for (int i = 0; i < 10; i++) {
            table[i] = N * (i + 1);
        }
        return table;
    }

    public static void main(String[] args) {
        int N = 4;
        int[] result = generateTable(N);
        System.out.println(Arrays.toString(result));
    }
}
