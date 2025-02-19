package Basic_problems;

//Given two positive numbers X and Y, check if Y is a power of X or not.
//Example 1:
//Input:
//X = 2, Y = 8
//Output:1
//Explanation:
//2^3 is equal to 8.
//Example 2:
//Input:
//X = 1, Y = 8
//Output:0
//Explanation:
//Any power of 1 is notequal to 8.
//---------------------------------------------------------------------------------

public class powercheck {
    public static int isPower(int X, int Y) {
        if (X == 1) {
            if (Y == 1) {
                return 1;
            } else {
                return 0;
            }
        }

        int power = 1;
        while (power < Y) {
            power *= X;
        }

        if (power == Y) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int X1 = 2, Y1 = 8;
        System.out.println(isPower(X1, Y1)); // Output: 1

        int X2 = 1, Y2 = 8;
        System.out.println(isPower(X2, Y2)); // Output: 0
    }
}


