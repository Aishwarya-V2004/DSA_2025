package Basic_problems;

//For a given number N. Print the pattern in
// the following form: 1 121 12321 1234321 for N = 4.
//Example 1:
//Input:
//N = 3
//Output:
//1 121 12321
//Explanation:
//For N = 3 we will print the 3 strings
//according to the pattern.
//-------------------------------------------------------------------------------------------
import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number:");
        int N = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= N; i++) {
            // Print increasing numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Print decreasing numbers from i-1 to 1
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
