package Tree;

//Given the root of a complete binary tree, return the number of the nodes in the tree.
//According to Wikipedia, every level, except possibly the last, is completely filled in a complete binary tree,
// and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at
// the last level h.
//Design an algorithm that runs in less than O(n) time complexity.
//Example 1:
//Input: root = [1,2,3,4,5,6]
//Output: 6
//Example 2:
//Input: root = []
//Output: 0
//Example 3:
//Input: root = [1]
//Output: 1
//-----------------------------------------------------------------------------------------------------------------
public class Countcompletetreenode {

    // Definition for a binary tree node.
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        // Example: root = [1,2,3,4,5,6]
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        int result = countNodes(root);
        System.out.println("Number of nodes in the complete binary tree: " + result);
    }

    // Main function
    public static int countNodes(TreeNode root) {
        if (root == null) return 0;

        int leftHeight = getLeftHeight(root);
        int rightHeight = getRightHeight(root);

        if (leftHeight == rightHeight) {
            // Tree is perfect binary tree
            return (1 << leftHeight) - 1;
        } else {
            // Recursively count nodes
            return 1 + countNodes(root.left) + countNodes(root.right);
        }
    }

    // compute height from left
    private static int getLeftHeight(TreeNode node) {
        int height = 0;
        while (node != null) {
            height++;
            node = node.left;
        }
        return height;
    }

    //compute height from right
    private static int getRightHeight(TreeNode node) {
        int height = 0;
        while (node != null) {
            height++;
            node = node.right;
        }
        return height;
    }
}

