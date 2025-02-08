package Basic_problems;

// Program to find the sum of arithmetic series
//A series with the same common difference is known as arithmetic series.
// The first term of series is a and the common difference is d.
// The series looks like a, a + d, a + 2d, a + 3d, . . .
//-----------------------------------------------------------------------------

public class AP{
    static float sumOfAP(float a, float d, int n)
    {
        float sum = 0;
        for (int i = 0; i < n; i++)
        {
            sum = sum + a;
            a = a + d;
        }
        return sum;
    }
    public static void main(String args[])
    {
        int n = 30;
        float a = 2.5f, d = 1.5f;
        System.out.println(sumOfAP(a, d, n));
    }
}
