package Basic_problems;

import java.util.Scanner;

//Given a string S, write a program to count the occurrence of Lowercase characters,
// Uppercase characters, Special characters and Numeric values in the string.
//Note: There are no white spaces in the string.


//---------------------------------------------------------------------------------
public class Charactercounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String S = scanner.next(); // Read input string
        scanner.close();

        int uppercaseCount = 0, lowercaseCount = 0, numericCount = 0, specialCount = 0;

        for (char ch : S.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            } else if (Character.isDigit(ch)) {
                numericCount++;
            } else {
                specialCount++;
            }
        }

        System.out.println(uppercaseCount);
        System.out.println(lowercaseCount);
        System.out.println(numericCount);
        System.out.println(specialCount);
    }
}
