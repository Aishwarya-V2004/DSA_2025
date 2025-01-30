package Basic_problems;

//Write a program to print Binary representation of a given number N.
//Example:
//Input:
//N = 2
//output:000000000000000000000000000010
//-----------------------------------------------------------------------
public class Decimal_binary {
    static String getBinaryRep(int N) {
        String space = "";
        while (N > 0) {
            int modValue = N % 2;
            space = modValue + space; // Prepend
            N = N / 2;
        }
        while (space.length() < 30) {  //to show it as 30 bits
            space = "0" + space; // Prepend
        }
        return space;
    }

    public static void main(String[] args) {
        int N = 2;
        System.out.println(getBinaryRep(N)); // Expected Output: 000000000000000000000000000010
    }
}
