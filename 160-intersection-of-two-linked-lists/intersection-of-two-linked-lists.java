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
        ListNode aPointer = headA;
        ListNode bPointer = headB;
        int aCounter = getListSize(aPointer);
        int bCounter = getListSize(bPointer);
        aPointer = headA;
        bPointer = headB;

        while (aCounter > bCounter) {
            aPointer = aPointer.next;
            aCounter--;
        }
        while (bCounter > aCounter) {
            bPointer = bPointer.next;
            bCounter--;
        }

        while (aPointer != null && bPointer != null) {
            if (aPointer == bPointer) {
                return aPointer;
            }
            aPointer = aPointer.next;
            bPointer = bPointer.next;
        }

        return aPointer;
    }

    private int getListSize(ListNode pointer) {
        int counter = 0;
        while (pointer != null) {
            counter++;
            pointer = pointer.next;
        }
        return counter;
    }
}