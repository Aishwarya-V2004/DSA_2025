package arrays_leetcode;

import java.util.Arrays;

public class removingduplicates {

    public static int duplicates(int[] arr)
    {
        Arrays.sort(arr);
        int n = arr.length;
        int count =1;

        for(int i = 1;i<n;i++)
        {
            if(arr[i-1]!=arr[i])
            {
                arr[count]=arr[i];
                count++;
            }
        }
        int[] arraynew = Arrays.copyOf(arr,count);
        System.out.println(Arrays.toString(arraynew));
        return  count;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,4,4,3,3,3,5,5};
        System.out.println(duplicates(arr));

    }
}
