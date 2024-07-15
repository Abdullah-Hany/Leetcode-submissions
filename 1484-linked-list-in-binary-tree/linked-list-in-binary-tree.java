/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public boolean isSubPath(ListNode head, TreeNode node) {
        if (head == null) {
            return true;
        }
        if (node == null) {
            return false;
        }
        return checkPath(head, node) || isSubPath(head, node.left) || isSubPath(head, node.right);
    }

    private boolean checkPath(ListNode head, TreeNode node) {
        if (head == null) {
            return true;
        }
        if (node == null) {
            return false;
        }
        if (head.val != node.val) {
            return false;
        }
        return checkPath(head.next, node.left) || checkPath(head.next, node.right);
    }
}