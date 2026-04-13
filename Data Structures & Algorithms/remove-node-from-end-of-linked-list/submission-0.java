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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int count = 0;
        while(count < n && temp != null){
            temp = temp.next;
            count++;
        }

        if (temp == null) return head.next;

        ListNode slwPointer = head;

        while(temp.next != null) {
            temp = temp.next;
            slwPointer = slwPointer.next;
        }

        slwPointer.next = slwPointer.next.next;
        return head;
    }
}
