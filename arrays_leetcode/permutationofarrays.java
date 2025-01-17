package arrays_leetcode;
//Your are given two integer arrays. Write a program to check if they are permutation of each other.

//Example

//int[] array1 = {1,2,3,4,5};
//int[] array2 = {5,1,2,3,4};
//permutation(array1, array2)
//Output:true

import java.util.*;
public class permutationofarrays {
    public static void main(String[] args) {
        int array1[]={1,2,3,4,5};
        int array2[]={1,4,3,2,5};
        System.out.println(permutation(array1,array2));
    }
    public static boolean permutation(int[] array1, int[] array2){
        Arrays.sort(array1);
        Arrays.sort(array2);
        for(int i = 0;i<array1.length;i++)
        {
            if(array1[i]==array2[i])
            {
                return true;
            }
        }
        return false;

    }
}