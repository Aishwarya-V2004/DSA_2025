package Recursion;

// Function to print numbers from N to 1 recursively

public class print_Nto1 {
    static void printNos(int N) {
        if (N == 0) {
            return;
        }
        System.out.print(N + " ");
        printNos(N - 1);
    }
    public static void main(String[] args) {
        int N = 10;
        printNos(N);
    }
}

