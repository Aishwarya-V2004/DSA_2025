package Basic_problems;

import java.util.*;

public class factorialnumbers {
    public static List<Integer> getFactorialNumbers(int n) {
        List<Integer> result = new ArrayList<>();
        int fact = 1, i = 1;

        while (fact <= n) {
            result.add(fact);
            i++;
            fact *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        List<Integer> factorialNumbers = getFactorialNumbers(n);
        System.out.println("Factorial numbers less than or equal to " + n + ": " + factorialNumbers);
    }
}
