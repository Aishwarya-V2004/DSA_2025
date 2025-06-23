package arrays_leetcode;

import java.util.*;

//Given the root of a binary tree, return its maximum depth.
//A binary tree's maximum depth is the number of nodes along
// the longest path from the root node down to the farthest leaf node.
//-------------------------------------------------------------------------------------------------------------
public class MaxDepthBinaryTree {

    // Definition for a binary tree node
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Method to calculate max depth of binary tree
    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        /*
        Example Tree:
            3
           / \
          9  20
             / \
            15  7

        Expected Output: 3
        */

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        int depth = maxDepth(root);
        System.out.println("Maximum Depth of Binary Tree: " + depth);
    }
}
