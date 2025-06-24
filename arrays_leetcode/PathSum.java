package arrays_leetcode;

//Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf
// path such that adding up all the values along the path equals targetSum.
//A leaf is a node with no children.
//Example 1:
//Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
//Output: true
//Explanation: The root-to-leaf path with the target sum is shown.
//Example 2:
//Input: root = [1,2,3], targetSum = 5
//Output: false
//Explanation: There are two root-to-leaf paths in the tree:
//(1 --> 2): The sum is 3.
//(1 --> 3): The sum is 4.
//There is no root-to-leaf path with sum = 5.
//-----------------------------------------------------------------------------------------------------------------
// Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

// Solution class
public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        // If it's a leaf node
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }

        int remainingSum = targetSum - root.val;

        // Check left and right
        return hasPathSum(root.left, remainingSum) || hasPathSum(root.right, remainingSum);
    }

    // Main method
    public static void main(String[] args) {
        // Build the tree: [5,4,8,11,null,13,4,7,2,null,null,null,1]
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        int targetSum = 22;

        PathSum obj = new PathSum(); // ✅ class name matches
        boolean result = obj.hasPathSum(root, targetSum);

        System.out.println("Path Sum exists? " + result);
    }
}
