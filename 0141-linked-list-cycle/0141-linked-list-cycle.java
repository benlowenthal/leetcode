/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        
        ListNode n1 = head;
        ListNode n2 = head.next;
        
        while (n1 != null && n2 != null) {
            if (n1.equals(n2)) return true;
            
            n1 = n1.next;
            n2 = n2.next;
            if (n2 != null) n2 = n2.next;
        }
        
        return false;
    }
}