package Basic_problems;

//Given a number n, find the n-th term in the series 1, 3, 6, 10, 15, 21…
//Examples
//Input : 3
//Output : 6
//Input : 4
//Output : 10
//---------------------------------------------------------------------------------
public class Nthtermseries {
    public static int findNthTerm(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        int n = 4; // Example input
        System.out.println("The " + n + "-th term is: " + findNthTerm(n));
    }
}
