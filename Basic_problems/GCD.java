package Basic_problems;
//greatest GCD for any 2 numbers
//----------------------------------------------------------------------------

public class GCD {
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int a = 48, b = 18;
        System.out.println("GCD is: " + findGCD(a, b));
    }
}
