package arrays_leetcode;

import java.util.*;

//Given the root of a binary tree, return the preorder traversal of its nodes' values.
//Example 1:
//Input: root = [1,null,2,3]
//Output: [1,2,3]

//------------------------------------------------------------------------------------------------------------------

public class BTpreorderTraversal {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }
    // Method to perform preorder traversal
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        dfs(root, result);
        return result;
    }

    private static void dfs(TreeNode node, List<Integer> result) {
        if (node == null) return;
        result.add(node.val);         // Visit root
        dfs(node.left, result);       // Traverse left
        dfs(node.right, result);      // Traverse right
    }

    // Main method to run the program
    public static void main(String[] args) {
        /*
         Example Tree:
                 1
                  \
                   2
                  /
                 3
        */
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println("Preorder Traversal: " + preorderTraversal(root));
    }
}
