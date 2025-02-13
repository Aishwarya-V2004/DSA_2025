package Basic_problems;

//Given an array “a[]” and integer “b”. Find whether b is present in a[] or not.
// If present, then double the value of b and search again.
// We repeat these steps until b is not found. Finally we return value of b.
//Examples:
//Input : a[] = {1, 2, 3}
//b = 1
//Output :4
//Initially we start with b = 1. Since
//it is present in array, it becomes 2.
//Now 2 is also present in array b becomes 4 .
//Since 4 is not present, we return 4.
//Input : a[] = {1 3 5 2 12}
//b = 3
//Output :6
//--------------------------------------------------------------------------------

// Java program to repeatedly search an element by
// doubling it after every successful search
import java.util.Arrays;
public class doublingvalue {

    static int findElement(int a[], int n, int b)
    {
        Arrays.sort(a);
        int max = a[n - 1]; // Maximum array element
        while (b < max) {
            if (Arrays.binarySearch(a, b) > -1)
                b *= 2;
            else
                return b;
        }
        return b;
    }
    public static void main(String args[])
    {
        int[] a= { 1, 2, 3 };
        int n = a.length;
        int b = 1;
        System.out.println(findElement(a, n, b));
    }
}

