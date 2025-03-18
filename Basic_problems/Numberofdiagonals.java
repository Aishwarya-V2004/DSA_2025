package Basic_problems;
import java.util.Scanner;

//Given a number N, the task is to find the number of diagonals in N
// sided convex polygon.
//Example 1
//Input: N = 5
//Output: 5
//Example 2:
//Input: N = 6
//Output: 9

//---------------------------------------------------------------------------------
public class Numberofdiagonals {
    public static int countDiagonals(int N) {
        if (N < 3) {
            return 0; // A polygon must have at least 3 sides
        }
        return (N * (N - 3)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of sides (N): ");
        int N = scanner.nextInt();
        scanner.close();

        int diagonals = countDiagonals(N);
        System.out.println("Number of diagonals: " + diagonals);
    }
}

