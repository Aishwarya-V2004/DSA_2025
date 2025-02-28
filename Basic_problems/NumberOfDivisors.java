package Basic_problems;

public class NumberOfDivisors {
    public static int countDivisorsBy3(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i % 3 == 0) count++;
                int pairDivisor = n / i;
                if (pairDivisor != i && pairDivisor % 3 == 0) count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int n1 = 6;
        System.out.println("Input: " + n1 + " -> Output: " + countDivisorsBy3(n1));
        int n2 = 10;
        System.out.println("Input: " + n2 + " -> Output: " + countDivisorsBy3(n2));
        int n3 = 18;
        System.out.println("Input: " + n3 + " -> Output: " + countDivisorsBy3(n3));
    }
}
