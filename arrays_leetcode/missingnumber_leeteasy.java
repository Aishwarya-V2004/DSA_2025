package arrays_leetcode;
//Write Java function called findMissingNumberInArray that takes an integer array containing n-1 unique elements from a range of 1 to n, with one missing number, and returns the missing number.

       // Example

   //     myArray = {1,2,3,4,6}
//findMissingNumberInArray(myArray, 6) // 5
//Hint:

//Use the formula (n * (n + 1)) / 2 which  calculates the sum of the first n natural numbers.



public class missingnumber_leeteasy {

    public static int missingnumber(int[] arr,int n)
    {
        int count=0;
        int m = arr.length;
        for(int i =0;i<m;i++)
        {
            count += arr[i];

        }
        int total = n*(n+1)/2;
        int answer = total - count;
        return answer;
    }

    public static void main(String[] args) {

        int[] arr ={1,2,3,4,6};
        System.out.println(missingnumber(arr,6));

    }
}
