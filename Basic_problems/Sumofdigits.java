package Basic_problems;

import java.util.Scanner;

public class Sumofdigits {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = obj.nextInt();
        System.out.println("The sum of the digits is: " + sums(number));
    }

    public static int sums(int number) {
        int sum = 0;
        number = Math.abs(number); // Handle negative numbers
        while (number > 0) {
            sum += number % 10; // Add the last digit to sum
            number /= 10; // Remove the last digit
        }
        return sum;
    }
}
