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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        
        List<ListNode> nodes = new ArrayList<ListNode>();
        for (ListNode n = head; n != null; n = n.next) nodes.add(n);
        
        for (int i = 0; i < (nodes.size() / k) * k; i++) {
            if (i % k != 0) nodes.get(i).next = nodes.get(i - 1);
            else if (i + k + k - 1 < nodes.size()) nodes.get(i).next = nodes.get(i + k + k - 1);
            else if (nodes.size() % k != 0) nodes.get(i).next = nodes.get((nodes.size() / k) * k);
            else nodes.get(i).next = null;
        }
        
        return nodes.get(k - 1);
    }
}