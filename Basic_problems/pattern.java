package Basic_problems;

// Java program to print
// hollow and solid square patterns
//-----------------------------------------------------------------------------------
public class pattern
{
    static void hollowSquare(int rows)
    {
        int i, j;
        for (i = 1; i <= rows; i++)
        {
            if (i == 1 || i == rows)
                for (j = 1; j <= rows; j++)
                    System.out.print("*");
            else
                for (j = 1; j <= rows; j++)
                    if (j == 1 || j == rows)
                        System.out.print("*");
                    else
                        System.out.print(" ");
            System.out.print("\n");
        }
    }
    static void solidSquare(int rows)
    {
        int i, j;
        for (i = 1; i <= rows; i++)
        {
            for (j = 1; j <= rows; j++)
                System.out.print("*");
            System.out.print("\n");
        }

    }
    static void printPattern(int rows)
    {
        System.out.print("\nSolid Square:\n");
        solidSquare(rows);
        System.out.print("\nHollow Square:\n");
        hollowSquare(rows);
    }
    public static void main (String[] args)
    {
        int rows = 5;
        printPattern (rows);
    }
}

