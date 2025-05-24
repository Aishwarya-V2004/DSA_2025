package arrays_leetcode;

//Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations
// in candidates where the candidate numbers sum to target.
//Each number in candidates may only be used once in the combination.
//Note: The solution set must not contain duplicate combinations.
//Example 1:
//Input: candidates = [10,1,2,7,6,1,5], target = 8
//Output:
//[
//[1,1,6],
//[1,2,5],
//[1,7],
//[2,6]
//]
//Example 2:
//Input: candidates = [2,5,2,1,2], target = 5
//Output:
//[
//[1,2,2],
//[5]
//]
//--------------------------------------------------------------------------------------------------------------------

import java.util.*;

public class Combinationalsum {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // Sort to handle duplicates
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int start,
                           List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            // Skip duplicates
            if (i > start && candidates[i] == candidates[i - 1]) continue;

            if (candidates[i] > target) break; // No need to continue if number is too large

            current.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i + 1, current, result);
            current.remove(current.size() - 1); // Backtrack
        }
    }

    public static void main(String[] args) {
        Combinationalsum cs = new Combinationalsum();

        int[] candidates1 = {10, 1, 2, 7, 6, 1, 5};
        int target1 = 8;

        int[] candidates2 = {2, 5, 2, 1, 2};
        int target2 = 5;

        System.out.println("Output 1: " + cs.combinationSum2(candidates1, target1));
        System.out.println("Output 2: " + cs.combinationSum2(candidates2, target2));
    }
}
