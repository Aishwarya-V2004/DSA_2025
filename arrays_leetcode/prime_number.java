package arrays_leetcode;
class prime{
    boolean prime_no(int num){
        if(num<=1){
            return false;
        }
        for(int i = 2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
}

public class prime_number {
    public static void main(String[] args) {
        prime obj = new prime();
        System.out.println(obj.prime_no(5));
        System.out.println(obj.prime_no(2));

    }
}
