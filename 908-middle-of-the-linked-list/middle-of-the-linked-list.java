/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode node = head;
        int counter = 0;
        while (node != null) {
            counter++;
            node = node.next;
        }

        double limit = counter % 2 == 0 ? (counter / 2) + 1 : Math.ceil(counter / 2.0);
        node = head;
        for (int i = 0; i < limit-1; i++) {
        
            node = node.next;
        }
        return node;
    }
}