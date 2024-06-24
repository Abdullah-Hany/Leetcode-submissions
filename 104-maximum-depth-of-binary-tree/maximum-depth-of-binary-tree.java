/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    int level = 0;

    public int maxDepth(TreeNode root) {
        test(root, 1);
        return level;
    }

    private void test(TreeNode node, int d) {
        if (node != null) {
            level = Math.max(level, d);
            test(node.left, d + 1);
            test(node.right, d + 1);
        }
    }

}