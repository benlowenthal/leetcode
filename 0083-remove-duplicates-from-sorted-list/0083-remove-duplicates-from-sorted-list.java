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
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> set = new HashSet<>();
        
        ListNode n = head;
        ListNode prev = head;
        while (n != null) {
            if (!set.add(n.val)) {
                prev.next = n.next;
            } else {
                prev = n;
            }
            
            n = n.next;
        }
        
        return head;
    }
}