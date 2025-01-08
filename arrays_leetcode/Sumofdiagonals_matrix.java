package arrays_leetcode;

//sum of diagonals in matrix
public class Sumofdiagonals_matrix {
    public static int matrix(int[][] array)
    {
        int n=array.length;
        int diagonalsum = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<array[i].length;j++){
                if(i==j){      //summing the values of matrix whose dimension is same
                    diagonalsum+=array[i][j];
                }

            }
        }

        return diagonalsum;
    }

    public static void main(String[] args) {

        int[][] array={{1,2,3},{4,5,6},{7,8,9}};  //initializing the values of matrix
        System.out.println(matrix(array));


    }
}
