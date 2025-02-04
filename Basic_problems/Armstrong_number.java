package Basic_problems;

//You are given a 3-digit number n, Find whether it is an Armstrong number or not.
//An Armstrong number of three digits is a number such that the sum of the
// cubes of its digits is equal to the number itself. 371 is an Armstrong number
// since 3^3 + 7^3 + 1^3 = 371.
//Note: Return true if it is an Armstrong number else return false.
//-----------------------------------------------------------------------------------

class Armstrong {
    boolean armstrongNumber(int n) {
        int temp = n;
        int mod = 0;
        int sum = 0;
        while (temp > 0) {
            mod = temp % 10;
            sum += mod * mod * mod;
            temp = temp / 10;
        }
        if (n == sum) {
            return true;
        }
        return false;
    }
}
public class Armstrong_number{
    public static void main(String[] args) {
        Armstrong obj =new Armstrong();
        System.out.println(obj.armstrongNumber(123));
        System.out.println(obj.armstrongNumber(371));

    }
}
