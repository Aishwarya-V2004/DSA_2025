package Basic_problems;

public class longestnames {
    public static String findLongestName(String[] arr) {
        if (arr == null || arr.length == 0) {
            return "";
        }

        String longest = arr[0];
        for (String name : arr) {
            if (name.length() > longest.length()) {
                longest = name;
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        String[] arr = {"Apple", "Mango", "Orange", "Banana"};
        System.out.println("Longest Name: " + findLongestName(arr));
        String[] arr1 = {"Aishu", "Aishwarya", "vijay", "vishwanath"};
        System.out.println("Longest Name: " + findLongestName(arr1));
    }
}

