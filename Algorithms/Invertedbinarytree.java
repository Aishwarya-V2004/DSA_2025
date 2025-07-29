package Algorithms;
import java.util.*;

//Given the root of a binary tree, invert the tree, and return its root.
//Example 1:
//Input: root = [4,2,7,1,3,6,9]
//Output: [4,7,2,9,6,3,1]
//Example 2:
//Input: root = [2,1,3]
//Output: [2,3,1]
//Example 3:
//Input: root = []
//Output: []
//----------------------------------------------------------------------------------------------------------------

import java.util.LinkedList;
import java.util.Queue;

public class Invertedbinarytree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        // Swap left and right children
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);

        return root;
    }

    // Helper to print tree in level order (for verification)
    public void printLevelOrder(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.val + " ");

            if (current.left != null) queue.offer(current.left);
            if (current.right != null) queue.offer(current.right);
        }
    }

    public static void main(String[] args) {
        // Sample tree: [4,2,7,1,3,6,9]
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        Invertedbinarytree obj = new Invertedbinarytree();
        TreeNode invertedRoot = obj.invertTree(root);

        System.out.println("Level order of inverted tree:");
        obj.printLevelOrder(invertedRoot);  // Expected: 4 7 2 9 6 3 1
    }
}
