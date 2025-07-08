package Basic_problems;

import java.util.*;
//Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.
//Example 1:
//Input: nums = [-10,-3,0,5,9]
//Output: [0,-3,9,-10,null,5]
//Explanation: [0,-10,5,null,-3,null,9] is also accepted:
//Example 2:
//Input: nums = [1,3]
//Output: [3,1]
//Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.
//-------------------------------------------------------------------------------------------------------------------------------

public class convertarraytobst {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int x) {
            val = x;
        }
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildBST(nums, 0, nums.length - 1);
    }

    private TreeNode buildBST(int[] nums, int left, int right) {
        if (left > right) return null;

        int mid = left + (right - left) / 2; // Choose mid to avoid overflow
        TreeNode node = new TreeNode(nums[mid]);

        // Recursively build left and right subtrees
        node.left = buildBST(nums, left, mid - 1);
        node.right = buildBST(nums, mid + 1, right);

        return node;
    }

    // Optional: function to print the tree in level order (for testing)
    public void printLevelOrder(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            if (curr != null) {
                System.out.print(curr.val + " ");
                queue.add(curr.left);
                queue.add(curr.right);
            } else {
                System.out.print("null ");
            }
        }
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        convertarraytobst obj = new convertarraytobst();
        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode root = obj.sortedArrayToBST(nums);

        obj.printLevelOrder(root);  // Output tree structure
    }
}

