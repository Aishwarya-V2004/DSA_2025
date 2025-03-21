package Basic_problems;

import java.util.*;

//Description: Given an array of intervals where
// intervals[i] = [starti, endi], merge all overlapping intervals and
// return an array of the non-overlapping intervals that cover
// all the intervals in the input.
//Example:
//java
//Copy
//Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
//Output: [[1,6],[8,10],[15,18]]
//----------------------------------------------------------------------------------
import java.util.*;

public class mergeoverlap {
    // Method to merge intervals
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][0];
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> merged = new ArrayList<>();
        int[] current = intervals[0];
        merged.add(current);

        // Loop through all intervals
        for (int[] interval : intervals) {
            if (interval[0] <= current[1]) { // If there is an overlap
                current[1] = Math.max(current[1], interval[1]);
            } else
            {                // If no overlap, add the current interval
                current = interval;
                merged.add(current);
            }
        }

        // Convert the List to an array and return
        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        mergeoverlap obj = new mergeoverlap();

        int[][] intervals1 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        System.out.println("Merged intervals for intervals1:");
        printIntervals(obj.merge(intervals1));
        int[][] intervals2 = {{1, 4}, {4, 5}};
        System.out.println("Merged intervals for intervals2:");
        printIntervals(obj.merge(intervals2));
        int[][] intervals3 = {};
        System.out.println("Merged intervals for intervals3:");
        printIntervals(obj.merge(intervals3));
    }


    public static void printIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            System.out.println("No intervals to merge.");
        } else {
            for (int[] interval : intervals) {
                System.out.print("[" + interval[0] + ", " + interval[1] + "] ");
            }
            System.out.println();
        }
    }
}

