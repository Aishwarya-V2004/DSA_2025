package Tree;


//You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version
// of your product fails the quality check. Since each version is developed based on the previous version,
// all the versions after a bad version are also bad.
//Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the
// following ones to be bad.
//You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function
// to find the first bad version. You should minimize the number of calls to the API.
//Example 1:
//Input: n = 5, bad = 4
//Output: 4
//Explanation:
//call isBadVersion(3) -> false
//call isBadVersion(5) -> true
//call isBadVersion(4) -> true
//Then 4 is the first bad version.
//Example 2:
//Input: n = 1, bad = 1
//Output: 1
// ----------------------------------------------------------------------------------------------------------------------
public class Firstbadversion {

    // Simulated API (mock) — in real life, this would be provided externally.
    // Change this value to simulate different "first bad versions".
    static int bad = 4;

    // Mock version of isBadVersion API
    static boolean isBadVersion(int version) {
        return version >= bad;
    }

    // Function to find the first bad version using binary search
    public static int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int result = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                result = mid;       // mid might be the first bad version
                right = mid - 1;    // check earlier versions
            } else {
                left = mid + 1;     // check later versions
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 5;  // Total number of versions
        bad = 4;    // Simulating bad version starts from 4

        int firstBad = firstBadVersion(n);
        System.out.println("The first bad version is: " + firstBad);
    }
}
