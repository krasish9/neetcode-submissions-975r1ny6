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

class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fPointer = head, secPointer = head;

        while(secPointer != null && secPointer.next != null) {
            fPointer = fPointer.next;
            secPointer = secPointer.next.next;

            if(fPointer == secPointer) {
                return true;
            }
        }
        return false;
    }
}
