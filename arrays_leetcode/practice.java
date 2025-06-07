package arrays_leetcode;
import java.util.*;

public class practice {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.println("enter two numbers");
        int a = obj1.nextInt();
        int b = obj1.nextInt();
        char char1 = (char) a; //converts integer value to ascii value
        char char2 = (char) b;
        System.out.println("ascii values are");
        System.out.println(char1);
        System.out.println(char2);
        //to find GCD
        int a1 = (int) char1; //this converts again 5 to 53
        int b1 = (int) char2;
        int num1 = a1 - '0'; //to convert char 5 into int 5
        int num2 = b1 - '0';
        int temp1 = a1;
        int temp2 = b1;
        while (b1 > 0) {
            int temp = b1;
            b1 = a1 % b1;
            a1 = temp;
        }
        int GCD = a1;
        int LCM = num1 * num2 / GCD;
        String str1 = Integer.toString(LCM);
        System.out.println(str1);

    }
}
