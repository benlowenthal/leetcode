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
    public ListNode rotateRight(ListNode head, int k) {        
        int len = 0;
        for (ListNode n = head; n != null; n = n.next) len++;
        if (len == 0) return null;
        
        k = k % len;
        if (k == 0) return head;
        
        ListNode next = head;
        ListNode newHead = null;
        ListNode newTail = null;
        
        for (int i = 0; i < len; i++) {
            if (i == len - k - 1) {
                newHead = next.next;
                newTail = next;
            }
            
            if (i == len - 1) {
                next.next = head;
                newTail.next = null;
            }
            
            else next = next.next;
        }
        
        return newHead;
    }
}