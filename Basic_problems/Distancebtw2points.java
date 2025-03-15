package Basic_problems;

//Given coordinates of 2 points on a cartesian plane,
// find the distance between them rounded up to nearest integer.
//Example 1:
//Input: 0 0 2 -2
//Output: 3
//Explanation: Distance between (0, 0)
//and (2, -2) is 3.
//Example 2:
//Input: -20 23 -15 68
//Output: 45
//Explanation: Distance between (-20, 23)
//------------------------------------------------------------------------------------

import java.lang.Math;

public class Distancebtw2points {
    public static void main(String[] args) {
        System.out.println(calculateDistance(0, 0, 2, -2));
        System.out.println(calculateDistance(-20, 23, -15, 68));
    }

    public static int calculateDistance(int x1, int y1, int x2, int y2) {
        // Calculate Euclidean distance
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        // Round up to the nearest integer
        return (int) Math.ceil(distance);
    }
}