package Basic_problems;

public class leapyear {
    public static boolean isLeapYear(int n) {
         if(n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)){
             return true;
        }
         return false;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2021));  // false
        System.out.println(isLeapYear(2000));  // true
        System.out.println(isLeapYear(1900));  // false
    }
}
