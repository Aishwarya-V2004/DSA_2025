package arrays_leetcode;

public class identifyduplicates {
    public static void main(String[] args) {
        int intArray[] = {1,2,3,4,5};
        System.out.println(isUnique(intArray));
    }
    public static boolean isUnique(int[] intArray) {
        for(int i = 0;i<intArray.length;i++)
        {
            for(int j = i+1;j<intArray.length;j++){
                if(intArray[i]==intArray[j])
                {
                    return false;
                }
            }
        }
        return true;
    }

}