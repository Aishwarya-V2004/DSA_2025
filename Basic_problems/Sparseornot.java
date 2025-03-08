package Basic_problems;

//A number is said to be a sparse number if in the binary
// representation of the number no two or more consecutive bits are set.
//Example:
//Input:  x  = 72
//Output: true
//Explanation:  Binary representation of 72 is 01001000.
//There are no two consecutive 1’s in binary representation
//Input:  x  = 12
//Output: false
//Explanation:  Binary representation of 12 is 1100.
//Third and fourth bits (from end) are set.
//----------------------------------------------------------------------------------
public class Sparseornot {
    static boolean isSparse(int n)
    {
        int prev;
        if (n == 1)
            return true;
        while (n > 0) {
            prev = n & 1;
            n = n >> 1;
            int curr = n & 1;
            if (prev == curr && prev == 1)
                return false;
            prev = curr;
        }

        return true;
    }
    public static void main(String[] args)
    {
        int n = 12;
        if (isSparse(n)) {
            System.out.println("Sparse");
        }
        else {
            System.out.println("Not Sparse");
        }
    }
}

