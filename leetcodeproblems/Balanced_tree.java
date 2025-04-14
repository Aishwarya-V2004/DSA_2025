package leetcodeproblems;


//Given a binary tree, determine if it is height-balanced.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class Balanced_tree {
    public boolean isBalanced(TreeNode root) {
        return checkBalance(root) != -1;
    }
    private int checkBalance(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = checkBalance(node.left);
        if (leftHeight == -1) return -1;  // Left subtree not balanced
        int rightHeight = checkBalance(node.right);
        if (rightHeight == -1) return -1;  // Right subtree not balanced
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        } // Current node not balanced
        return 1 + Math.max(leftHeight, rightHeight);  // Return height if balanced
    }
    public static void main(String[] args) {
        Balanced_tree obj = new Balanced_tree();
        TreeNode root1 = new TreeNode(3);  //balanced one
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        System.out.println(obj.isBalanced(root1));// true
        TreeNode root2 = new TreeNode(1); //unbalanced one
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(2);
        root2.left.left = new TreeNode(3);
        root2.left.right = new TreeNode(3);
        root2.left.left.left = new TreeNode(4);
        root2.left.left.right = new TreeNode(4);
        System.out.println( obj.isBalanced(root2)); // false
        System.out.println(obj.isBalanced(null)); // true bcoz null tree
    }
}
