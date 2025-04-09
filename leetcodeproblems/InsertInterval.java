package leetcodeproblems;
import java.util.*;

//You are given an array of non-overlapping intervals intervals where intervals[i] = [starti, endi]
// represent the start and the end of the ith interval and intervals is sorted in ascending order by starti. You are also given an
// interval newInterval = [start, end] that represents the start and end of another interval.
//Insert newInterval into intervals such that intervals is still sorted in ascending order by starti and intervals still does not have
//any overlapping intervals (merge overlapping intervals if necessary).
//Return intervals after the insertion.
//Note that you don't need to modify intervals in-place.
// You can make a new array and return it.
//Example 1:
//Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
//Output: [[1,5],[6,9]]
//Example 2:
//Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
//Output: [[1,2],[3,10],[12,16]]
//Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].
//-----------------------------------------------------------------------------------------
public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int i = 0;
        int n = intervals.length;

        // Step 1: Add all intervals that come before newInterval
        while (i < n && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }

        // Step 2: Merge overlapping intervals with newInterval
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        result.add(newInterval); // Add the merged interval

        // Step 3: Add the remaining intervals
        while (i < n) {
            result.add(intervals[i]);
            i++;
        }

        return result.toArray(new int[result.size()][]);
    }

    // Test the code
    public static void main(String[] args) {
        InsertInterval solution = new InsertInterval();

        int[][] intervals1 = {{1, 3}, {6, 9}};
        int[] newInterval1 = {2, 5};
        System.out.println(Arrays.deepToString(solution.insert(intervals1, newInterval1))); // [[1,5],[6,9]]

        int[][] intervals2 = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval2 = {4,8};
        System.out.println(Arrays.deepToString(solution.insert(intervals2, newInterval2))); // [[1,2],[3,10],[12,16]]
    }
}

