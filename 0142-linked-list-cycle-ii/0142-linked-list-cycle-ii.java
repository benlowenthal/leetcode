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
    public ListNode detectCycle(ListNode head) {
        if (head == null) return null;
        
        Set<ListNode> set = new HashSet<>();
        
        for (ListNode n = head; n != null; n = n.next) {
            if (!set.add(n)) {
                return n;
            }
        }
        
        return null;
    }
}