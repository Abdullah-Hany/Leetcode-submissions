/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> visited = new HashSet<>();
        ListNode pointer = headA;
        while (pointer != null) {
            visited.add(pointer);
            pointer = pointer.next;
        }
        pointer = headB;
        while (pointer != null) {
            if (visited.contains(pointer)) {
                return pointer;
            }
            pointer = pointer.next;
        }
        return pointer;
    }
}