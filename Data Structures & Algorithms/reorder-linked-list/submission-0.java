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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        // Step 1: Copy values into list
        ListNode temp = head;
        List<Integer> list = new ArrayList<>();
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        // Step 2: Build reordered value list
        List<Integer> newList = new ArrayList<>();
        int i = 0, j = list.size() - 1;
        while (i <= j) {
            newList.add(list.get(i++));
            if (i <= j) {
                newList.add(list.get(j--));
            }
        }

        // Step 3: Write values back into original linked list
        temp = head;
        for (int val : newList) {
            temp.val = val;
            temp = temp.next;
        }
    }
}
