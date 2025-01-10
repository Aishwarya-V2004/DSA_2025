package arrays_leetcode;

public class sortingarray {
    public static void sorting(int[] arr)
    {
        int n= arr.length;
        for(int i =0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++){  //for comparision of adjacent elements
                if(arr[j]>arr[j+1]) //change the comparision operator for descending order
                {
                    int temp = arr[j]; //swapping of elements
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr ={0,2,4,1,3,5};
        sorting(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+ " ");
        }
    }
}
