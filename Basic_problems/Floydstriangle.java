package Basic_problems;

//Given a number n. The task is to print Floyd's triangle with n lines.
//Examples:
//Input: n = 4
//Output:
//1
//2 3
//4 5 6
//7 8 9 10
//Explanation: For n = 4 there are 4 rows in the output and the number
// of elements increases with an increase in the row.
//Input: n = 5
//Output:
//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15
//Explanation: For n = 5 there are 5 rows in the output and
// the number of elements increases with an increase in the row.
//--------------------------------------------------------------------------------
class Floydstriangle {
    static void printFloydTriangle(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        printFloydTriangle(n);
    }
}
