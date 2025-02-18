package Basic_problems;

public class Automorphicnumber {
    public static String isAutomorphic(int N) {
        long square = (long) N * N;
        String numStr = Integer.toString(N); //convert integer to string
        String squareStr = Long.toString(square); //convert long to string
        if (squareStr.endsWith(numStr))  //comparing strings
        {
            return "Automorphic";
        } else {
            return "Not Automorphic";
        }
    }
    public static void main(String[] args) {
        int N1 = 76;
        System.out.println(N1 + " is " + isAutomorphic(N1));
        int N2 = 14;
        System.out.println(N2 + " is " + isAutomorphic(N2));
    }
}