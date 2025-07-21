package Algorithms;
//Given the root of a binary tree, return all root-to-leaf paths in any order.
//A leaf is a node with no children.
//Example 1:
//Input: root = [1,2,3,null,5]
//Output: ["1->2->5","1->3"]
//Example 2:
//Input: root = [1]
//Output: ["1"]
// ----------------------------------------------------------------------------------------------------------------------

import java.util.*;


public class Binarytreepath {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root != null) {
            dfs(root, "", result);
        }
        return result;
    }

    private void dfs(TreeNode node, String path, List<String> result) {
        if (node.left == null && node.right == null) {
            // Reached a leaf
            result.add(path + node.val);
            return;
        }

        // Append current node and recurse
        if (node.left != null) {
            dfs(node.left, path + node.val + "->", result);
        }

        if (node.right != null) {
            dfs(node.right, path + node.val + "->", result);
        }
    }

    // Test
    public static void main(String[] args) {
        /*
              1
             / \
            2   3
             \
              5
        */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);

        Binarytreepath obj = new Binarytreepath();
        List<String> paths = obj.binaryTreePaths(root);
        System.out.println(paths); // Output: [1->2->5, 1->3]
    }
}
