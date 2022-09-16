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
        ListNode dummy = new ListNode();
        dummy.next = head;
        
        int sz = 0;
        ListNode next = head;
        while (next != null) {
            sz++;
            next = next.next;
        }
        
        ListNode prev = dummy;
        ListNode curr = head;
        for (int i = 0; i < sz - n; i++) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = curr.next;
        
        return dummy.next;
    }
}