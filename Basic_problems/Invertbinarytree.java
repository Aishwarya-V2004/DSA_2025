package Basic_problems;

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
// -----------------------------------------------------------------------------------------------------------------
public class Invertbinarytree {

    // TreeNode definition
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Function to invert binary tree
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        // Swap left and right children
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);

        return root;
    }

    // Helper function to print level-order traversal of the tree
    public static void printLevelOrder(TreeNode root) {
        if (root == null) {
            System.out.println("[]");
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<String> result = new ArrayList<>();

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            if (current != null) {
                result.add(String.valueOf(current.val));
                queue.offer(current.left);
                queue.offer(current.right);
            } else {
                result.add("null");
            }
        }

        // Remove trailing "null"s
        int i = result.size() - 1;
        while (i >= 0 && result.get(i).equals("null")) {
            result.remove(i);
            i--;
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        // Example 1: root = [4,2,7,1,3,6,9]
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        System.out.println("Original tree:");
        printLevelOrder(root);

        TreeNode inverted = invertTree(root);

        System.out.println("Inverted tree:");
        printLevelOrder(inverted);
    }
}
